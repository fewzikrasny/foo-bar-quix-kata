package com.kata.foobarquix.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


/**
 * Class which allows to read the properties of divisors and correspondences
 * in order to make them configurable
 **/
@Configuration
@ConfigurationProperties(prefix = "map")
public class DivisorsAndCorrespondencesProperties {
    public String divisorsKeys;
    public String correspondencesValues;

    public String getDivisorsKeys() {
        return divisorsKeys;
    }

    public void setDivisorsKeys(String divisorsKeys) {
        this.divisorsKeys = divisorsKeys;
    }

    public String getCorrespondencesValues() {
        return correspondencesValues;
    }

    public void setCorrespondencesValues(String correspondencesValues) {
        this.correspondencesValues = correspondencesValues;
    }
}
