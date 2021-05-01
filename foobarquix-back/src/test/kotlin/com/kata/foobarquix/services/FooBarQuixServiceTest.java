package com.kata.foobarquix.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

@DisplayName("Service that converts the numbers three, five and seven into the string Foo, Bar and Quix")
public class FooBarQuixServiceTest {

    private final FooBarQuixService fooBarQuixService = new FooBarQuixService();

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
}
