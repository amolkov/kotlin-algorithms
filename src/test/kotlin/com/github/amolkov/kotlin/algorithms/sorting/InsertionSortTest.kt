package com.github.amolkov.kotlin.algorithms.sorting

import com.github.amolkov.kotlin.algorithms.common.SortingAlgorithmTest
import com.github.amolkov.kotlin.algorithms.common.SortingParameter
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class InsertionSortTest : SortingAlgorithmTest() {

    @ParameterizedTest
    @MethodSource("data")
    fun sort(parameter: SortingParameter<Int>) {
        val arr = parameter.actual
        InsertionSort.sort(arr)

        assertArrayEquals(parameter.expected, arr)
    }
}
