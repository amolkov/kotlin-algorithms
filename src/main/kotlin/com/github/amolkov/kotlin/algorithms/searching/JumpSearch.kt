package com.github.amolkov.kotlin.algorithms.searching

import kotlin.math.floor
import kotlin.math.min
import kotlin.math.sqrt

class JumpSearch {
    companion object {

        /**
         * Searches the specified array for the specified value using the jump search algorithm.
         *
         * @param arr the array to be searched
         * @param key the value to be searched for
         */
        fun search(arr: Array<Int>, key: Int): Int? {
            if (arr.isEmpty()) {
                return null
            }

            val size = arr.size
            var step = getStep(size)

            var prev = 0
            while (arr[min(step, size) - 1] < key) {
                prev = step
                step += getStep(size)

                if (prev >= size) {
                    return null
                }
            }

            while (arr[prev] < key) {
                prev++

                if (prev == min(step, size)) {
                    return null
                }
            }

            if (arr[prev] == key) {
                return prev
            }

            return null
        }

        private fun getStep(size: Int): Int = floor(sqrt(size.toDouble())).toInt()
    }
}