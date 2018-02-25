package com.github.amolkov.kotlin.algorithms.searching

class LinearSearch {
    companion object {

        /**
         * Searches the specified array for the specified value using the linear search algorithm.
         *
         * @param arr the array to be searched
         * @param key the value to be searched for
         */
        fun <T : Comparable<T>> search(arr: Array<T>, key: T): Int? {
            (0 until arr.size).forEach {
                if (arr[it] == key) {
                    return it
                }
            }

            return null
        }
    }
}