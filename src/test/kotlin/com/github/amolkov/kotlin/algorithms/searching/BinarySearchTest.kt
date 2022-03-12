package com.github.amolkov.kotlin.algorithms.searching

import com.github.amolkov.kotlin.algorithms.common.SearchingAlgorithmTest
import com.github.amolkov.kotlin.algorithms.common.SearchingParameter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class BinarySearchTest : SearchingAlgorithmTest() {

    @ParameterizedTest
    @MethodSource("data")
    fun search(parameter: SearchingParameter<Int>) {
        val idx = BinarySearch.search(arr = parameter.array, key = parameter.key)
        assertEquals(parameter.expected, idx)
    }

    @ParameterizedTest
    @MethodSource("data")
    fun searchRange(parameter: SearchingParameter<Int>) {
        val idx = BinarySearch.search(arr = parameter.array, from = 0, to = parameter.array.size, key = parameter.key)
        assertEquals(parameter.expected, idx)
    }
}
