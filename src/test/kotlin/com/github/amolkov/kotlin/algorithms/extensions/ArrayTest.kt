package com.github.amolkov.kotlin.algorithms.extensions

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ArrayTest {

    @Test
    fun swap() {
        val arr = arrayOf(0, 1)
        arr.swap(left = 0, right = 1)

        assertArrayEquals(arrayOf(1, 0), arr)
    }

    @Test
    fun split() {
        val arr = arrayOf(0, 1, 2, 3, 4, 5)
        val pair = arr.split(idx = 3)

        assertArrayEquals(arrayOf(0, 1, 2), pair.first)
        assertArrayEquals(arrayOf(3, 4, 5), pair.second)
    }
}
