package com.kata.foobarquix.cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

/**
 * Class to run cucumber test
 **/
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report.html"}, features = "src/test/resources/features", glue = {
        "com.kata.foobarquix.cucumber"})
@TestPropertySource("classpath:application-test.properties")
@ActiveProfiles("test")
public class CucumberTest {

}
