package com.kata.foobarquix.cucumber;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.test.context.TestPropertySource;

@Component
@TestPropertySource("classpath:application-test.properties")
public class CucumberContext {

    @Value("${foo.bar.quix.ws.url}")
    private String baseUrl;

    private Response response;

    public void callConvertNumberWebservicesWithUrl(final int port, final int inputNumber) {
        final RequestSpecification requestSpecification = RestAssured.given().port(port);
        RestAssured.defaultParser = Parser.JSON;
        response = requestSpecification.when().get(baseUrl + inputNumber);
    }

    public Response getResponse() {
        return response;
    }
}
