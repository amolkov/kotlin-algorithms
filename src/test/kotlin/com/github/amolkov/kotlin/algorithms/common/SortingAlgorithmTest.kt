package com.github.amolkov.kotlin.algorithms.common

abstract class SortingAlgorithmTest {

    companion object {

        @JvmStatic
        fun data(): List<SortingParameter<Int>> =
            listOf(
                SortingParameter(actual = emptyArray<Int>(), expected = emptyArray<Int>()),
                SortingParameter(actual = arrayOf(0), expected = arrayOf(0)),
                SortingParameter(actual = arrayOf(0, 1), expected = arrayOf(0, 1)),
                SortingParameter(actual = arrayOf(1, 0), expected = arrayOf(0, 1)),
                SortingParameter(actual = arrayOf(1, 2, 3), expected = arrayOf(1, 2, 3)),
                SortingParameter(actual = arrayOf(1, 2, 3, 4), expected = arrayOf(1, 2, 3, 4)),
                SortingParameter(actual = arrayOf(4, 3, 2, 1), expected = arrayOf(1, 2, 3, 4)),
                SortingParameter(actual = arrayOf(1, 2, 4, 3), expected = arrayOf(1, 2, 3, 4)),
                SortingParameter(actual = arrayOf(3, 4, 1, 2), expected = arrayOf(1, 2, 3, 4)),
                SortingParameter(actual = arrayOf(7, 6, 5, 4, 3, 2, 1), expected = arrayOf(1, 2, 3, 4, 5, 6, 7))
            )
    }
}

class SortingParameter<T : Comparable<T>>(val actual: Array<T>, val expected: Array<T>) {

    override fun toString(): String = "${actual.contentToString()} -> ${expected.contentToString()}"
}
