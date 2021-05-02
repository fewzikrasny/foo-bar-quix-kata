package com.kata.foobarquix.services

import com.kata.foobarquix.configuration.DivisorsAndCorrespondencesProperties
import org.springframework.stereotype.Component
import java.util.stream.Collectors
import java.util.stream.IntStream

@Component
class FooBarQuixService(private val  divisorsAndCorrespondencesProperties: DivisorsAndCorrespondencesProperties) {

    fun convertNumber(inputNumber: Int): String {
        return inputNumber.toString();
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
}
