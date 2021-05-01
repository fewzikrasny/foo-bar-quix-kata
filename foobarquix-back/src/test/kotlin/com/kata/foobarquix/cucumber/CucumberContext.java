package com.kata.foobarquix.cucumber;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource("classpath:application-test.properties")
public class CucumberContext {

    @Value("${foo.bar.quix.ws.url}")
    private String baseUrl;
}
