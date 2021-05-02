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
        divisorsAndCorrespondencesProperties.setDivisorsKeys("3,5,7");
        divisorsAndCorrespondencesProperties.setCorrespondencesValues("Foo,Bar,Quix");

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

    @DisplayName("Manage the match combination foo, bar and quix")
    @Test
    public void should_return_combination_of_foo_bar_quix() {
        // Given
        final int zero = 0;

        // When
        final String fooBarQuix = fooBarQuixService.convertNumber(zero);

        // Then
        assertThat("FooBarQuix", is(equalTo(fooBarQuix)));
    }

    @DisplayName("Manage the match combination foo and bar")
    @Test
    public void should_return_combination_of_foo_bar() {
        // Given
        final int sixty = 60;

        // When
        final String fooBar = fooBarQuixService.convertNumber(sixty);

        // Then
        assertThat("FooBar", is(equalTo(fooBar)));
    }

    @DisplayName("Manage the match combination bar and quix")
    @Test
    public void should_return_combination_of_bar_quix() {
        // Given
        final int fiveHundredSeventyTwo = 572;

        // When
        final String barQuix = fooBarQuixService.convertNumber(fiveHundredSeventyTwo);

        // Then
        assertThat("BarQuix", is(equalTo(barQuix)));
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

        @DisplayName("Manage the input number that contains the number 3")
        @Test
        public void should_return_foo_when_input_number_contains_3() {
            // Given
            final int twentyThree = 23;

            // When
            final String foo = fooBarQuixService.convertNumber(twentyThree);

            // Then
            assertThat("Foo", is(equalTo(foo)));
        }

        @DisplayName("Manage the input number that divisible by the number 3 and contains 3")
        @Test
        public void should_return_foo_when_input_number_is_divisible_by_3_and_contains_3() {
            // Given
            final int thirtySix = 36;

            // When
            final String fooFoo = fooBarQuixService.convertNumber(thirtySix);

            // Then
            assertThat("FooFoo", is(equalTo(fooFoo)));
        }
    }

    @DisplayName("Feature that converts the number five to Bar")
    @Nested
    class ConvertFiveToBarClass {

        @DisplayName("Manage the input number that divisible by the number 5")
        @Test
        public void should_return_bar_when_input_number_is_divisible_by_5() {
            // Given
            final int twenty = 20;

            // When
            final String bar = fooBarQuixService.convertNumber(twenty);

            // Then
            assertThat("Bar", is(equalTo(bar)));
        }

        @DisplayName("Manage the input number that contains the number 5")
        @Test
        public void should_return_foo_when_input_number_contains_5() {
            // Given
            final int fiftyTwo = 52;

            // When
            final String bar = fooBarQuixService.convertNumber(fiftyTwo);

            // Then
            assertThat("Bar", is(equalTo(bar)));
        }

        @DisplayName("Manage the input number that divisible by the number 5 and contains 5")
        @Test
        public void should_return_foo_when_input_number_is_divisible_by_5_and_contains_5() {
            // Given
            final int fifty = 50;

            // When
            final String barBar = fooBarQuixService.convertNumber(fifty);

            // Then
            assertThat("BarBar", is(equalTo(barBar)));
        }
    }

    @DisplayName("Feature that converts the number seven to Quix")
    @Nested
    class ConvertSevenToQuixClass {

        @DisplayName("Manage the input number that divisible by the number 7")
        @Test
        public void should_return_bar_when_input_number_is_divisible_by_7() {
            // Given
            final int twentyEight = 28;

            // When
            final String quix = fooBarQuixService.convertNumber(twentyEight);

            // Then
            assertThat("Quix", is(equalTo(quix)));
        }

        @DisplayName("Manage the input number that contains the number 7")
        @Test
        public void should_return_foo_when_input_number_contains_7() {
            // Given
            final int seventeen = 17;

            // When
            final String quix = fooBarQuixService.convertNumber(seventeen);

            // Then
            assertThat("Quix", is(equalTo(quix)));
        }

        @DisplayName("Manage the input number that divisible by the number 7 and contains 7")
        @Test
        public void should_return_foo_when_input_number_is_divisible_by_7_and_contains_7() {
            // Given
            final int sevenHundredTwentyEight = 728;

            // When
            final String quixQuix = fooBarQuixService.convertNumber(sevenHundredTwentyEight);

            // Then
            assertThat("QuixQuix", is(equalTo(quixQuix)));
        }
    }
}
