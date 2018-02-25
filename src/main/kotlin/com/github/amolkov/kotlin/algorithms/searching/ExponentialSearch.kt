package com.github.amolkov.kotlin.algorithms.searching

import kotlin.math.min

class ExponentialSearch {
    companion object {

        /**
         * Searches the specified array for the specified value using the exponential search algorithm.
         *
         * @param arr the array to be searched
         * @param key the value to be searched for
         */
        fun <T : Comparable<T>> search(arr: Array<T>, key: T): Int? {
            if (arr.isNotEmpty() && arr[0] == key) {
                return 0
            }

            var i = 1
            while (i < arr.size && arr[i] <= key) {
                i *= 2
            }

            return BinarySearch.search(arr = arr, from = i / 2, to = min(i, arr.size), key = key)
        }
    }
}