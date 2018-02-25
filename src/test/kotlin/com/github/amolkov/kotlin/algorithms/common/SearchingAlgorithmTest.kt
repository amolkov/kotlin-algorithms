package com.github.amolkov.kotlin.algorithms.common

abstract class SearchingAlgorithmTest {
    companion object {
        @JvmStatic
        fun data(): List<SearchingParameter<Int>> =
                listOf(
                        SearchingParameter(array = emptyArray(), key = 1, expected = null),
                        SearchingParameter(array = arrayOf(0), key = 0, expected = 0),
                        SearchingParameter(array = arrayOf(0, 1), key = 1, expected = 1),
                        SearchingParameter(array = arrayOf(0, 1, 2, 3, 5, 8, 13), key = 0, expected = 0),
                        SearchingParameter(array = arrayOf(0, 1, 2, 3, 5, 8, 13), key = 8, expected = 5),
                        SearchingParameter(array = arrayOf(0, 1, 2, 3, 5, 8, 13, 14, 100, 342), key = 342, expected = 9),
                        SearchingParameter(array = arrayOf(0, 1, 2, 3, 5, 8, 13, 14, 100, 342), key = 123, expected = null)
                )
    }
}

class SearchingParameter<T : Comparable<T>>(val array: Array<T>, val key: T, val expected: Int?) {

    override fun toString(): String = "$key in ${array.contentToString()} -> $expected"
}