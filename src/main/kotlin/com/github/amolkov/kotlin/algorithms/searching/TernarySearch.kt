package com.github.amolkov.kotlin.algorithms.searching

class TernarySearch {
    companion object {

        /**
         * Searches the specified array for the specified value using the ternary search algorithm.
         *
         * @param arr the array to be searched
         * @param key the value to be searched for
         */
        fun search(arr: Array<Int>, key: Int): Int? {
            return search(arr, key, 0, arr.size)
        }

        private fun <T : Comparable<T>> search(arr: Array<T>, key: T, from: Int, to: Int): Int? {
            if (from < to) {
                val mid1 = from + (to - from) / 3
                val mid2 = from + 2 * (to - from) / 3

                return when {
                    key == arr[mid1] -> mid1
                    key == arr[mid2] -> mid2
                    key < arr[mid1] -> search(arr, key, from, mid1 - 1)
                    else -> search(arr, key, mid2 + 1, to)
                }
            }

            return null
        }
    }
}