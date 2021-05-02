package com.kata.foobarquix.services;

import com.kata.foobarquix.configuration.DivisorsAndCorrespondencesProperties;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

@DisplayName("Service that converts the numbers three, five and seven into the string Foo, Bar and Quix")
public class FooBarQuixServiceTest {

    private FooBarQuixService fooBarQuixService;

    @BeforeEach
    public void setUp() {
        final DivisorsAndCorrespondencesProperties divisorsAndCorrespondencesProperties = new DivisorsAndCorrespondencesProperties();
        divisorsAndCorrespondencesProperties.setDivisorsKeys("3");
        divisorsAndCorrespondencesProperties.setCorrespondencesValues("Foo");

        fooBarQuixService = new FooBarQuixService(divisorsAndCorrespondencesProperties);
    }


    @DisplayName("Handling unmatched numbers")
    @Test
    public void should_return_intput_as_string() {
        // Given
        final int two = 2;
        final int eleven = 11;

        // When
        final String twoString = fooBarQuixService.convertNumber(two);
        final String elevenString = fooBarQuixService.convertNumber(eleven);

        // Then
        assertThat("2", is(equalTo(twoString)));
        assertThat("11", is(equalTo(elevenString)));
    }

    @DisplayName("Feature that converts the number three to Foo")
    @Nested
    class ConvertThreeToFooClass {

        @DisplayName("Manage the input number that divisible by the number 3")
        @Test
        public void should_return_foo_when_input_number_is_divisible_by_3() {
            // Given
            final int six = 6;

            // When
            final String foo = fooBarQuixService.convertNumber(six);

            // Then
            assertThat("Foo", is(equalTo(foo)));
        }
    }
}
