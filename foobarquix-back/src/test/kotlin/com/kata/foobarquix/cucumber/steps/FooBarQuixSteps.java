package com.kata.foobarquix.cucumber.steps;

import com.kata.foobarquix.controllers.FooBarQuixController;
import com.kata.foobarquix.cucumber.CucumberContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@CucumberContextConfiguration
@TestPropertySource("classpath:application-test.properties")
@ActiveProfiles("test")
public class FooBarQuixSteps {

    @Autowired
    private CucumberContext cucumberContext;

    @LocalServerPort
    private int port;

    private int inputNumber;

    @Given("inputNumber {int}")
    public void setInputnumber(final int inputNumber) {
        this.inputNumber = inputNumber;
    }

    @When("Call the convert number webservices")
    public void callTheConvertNumberWebservices() {
        cucumberContext.callConvertNumberWebservicesWithUrl(port, inputNumber);
    }

    @Then("Http response is {int}")
    public void httpResponseIs(final int responseCode) {
        assertEquals(responseCode, cucumberContext.getResponse().getStatusCode());
    }

    @And("The resultDto must be")
    public void theResultDtoMustBe(final DataTable dataTable) {
        final List<Map<String, String>> resultDtoAsMapString = dataTable.asMaps(String.class, String.class);
        final FooBarQuixController.ResultDto resultDtoExpected = buildResultDtoExpected(resultDtoAsMapString);
        final FooBarQuixController.ResultDto resultDtoActual = cucumberContext.getResponse().then().extract().as(FooBarQuixController.ResultDto.class);

        assertEquals(resultDtoActual.getResult(), resultDtoExpected.getResult());
        assertEquals(resultDtoActual.hashCode(), resultDtoExpected.hashCode());
    }

    private FooBarQuixController.ResultDto buildResultDtoExpected(final List<Map<String, String>> resultDtoAsMapString) {
        final AtomicReference<String> result = new AtomicReference<>();
        resultDtoAsMapString.forEach(stringStringMap -> result.set(stringStringMap.get("result")));
        return new FooBarQuixController.ResultDto(result.get());
    }
}
