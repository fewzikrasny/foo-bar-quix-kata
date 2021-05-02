package com.kata.foobarquix.services

import com.kata.foobarquix.configuration.DivisorsAndCorrespondencesProperties
import org.springframework.stereotype.Component
import java.util.stream.Collectors
import java.util.stream.IntStream

@Component
class FooBarQuixService(private val divisorsAndCorrespondencesProperties: DivisorsAndCorrespondencesProperties) {
    private final val divisorsAndCorrespondences: HashMap<Int, String> = buildDivisorsAndCorrespondences();

    fun convertNumber(inputNumber: Int): String {
        val outputBuilder = StringBuilder();
        convertInputNumberToStringWhichDivisibleByDivisors(outputBuilder, inputNumber, divisorsAndCorrespondences);

        return if (!outputBuilder.toString().isEmpty()) outputBuilder.toString() else inputNumber.toString()
    }

    /**
     * populate a hashmap from an divisors and correspondences properties
     **/
    private fun buildDivisorsAndCorrespondences(): HashMap<Int, String> {
        val divisorsKeys: List<String> = divisorsAndCorrespondencesProperties.getDivisorsKeys().split(",")
        val correspondencesValues: List<String> = divisorsAndCorrespondencesProperties.getCorrespondencesValues().split(",")
        val divisorsAndCorrespondencesMap = IntStream.range(0, divisorsKeys.size).boxed()
                .collect(Collectors.toMap({ i: Int? -> divisorsKeys[i!!].toInt() }) { i: Int? -> correspondencesValues[i!!] })
        return HashMap(divisorsAndCorrespondencesMap)
    }

    /**
     * Convert the input Number to (Foo)
     * which are divisible by the dividing numbers (3)
     * **/
    private fun convertInputNumberToStringWhichDivisibleByDivisors(outputBuilder: StringBuilder, inputNumber: Int, divisorsAndCorrespondences: HashMap<Int, String>): StringBuilder {
        divisorsAndCorrespondences.keys.forEach { divisor ->
            if (inputNumber % divisor == 0) {
                outputBuilder.append(divisorsAndCorrespondences[divisor]);
            }
        }
        return outputBuilder;
    }
}
