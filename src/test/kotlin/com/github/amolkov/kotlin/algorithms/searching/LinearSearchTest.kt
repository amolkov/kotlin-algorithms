package com.github.amolkov.kotlin.algorithms.searching

import com.github.amolkov.kotlin.algorithms.common.SearchingAlgorithmTest
import com.github.amolkov.kotlin.algorithms.common.SearchingParameter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class LinearSearchTest : SearchingAlgorithmTest() {

    @ParameterizedTest
    @MethodSource("data")
    fun search(parameter: SearchingParameter<Int>) {
        val idx = LinearSearch.search(parameter.array, parameter.key)
        assertEquals(parameter.expected, idx)
    }
}