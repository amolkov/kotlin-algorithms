package com.github.amolkov.kotlin.algorithms.searching

class BinarySearch {
    companion object {

        /**
         * Searches the specified array for the specified value using the binary search algorithm.
         *
         * @param arr the array to be searched
         * @param key the value to be searched for
         */
        fun <T : Comparable<T>> search(arr: Array<T>, key: T): Int? {
            return search(arr, 0, arr.size, key)
        }

        /**
         * Searches the specified array for the specified value using the binary search algorithm.
         *
         * @param arr the array to be searched
         * @param from the index of the first element (inclusive) to be searched
         * @param to the index of the last element (exclusive) to be searched
         * @param key the value to be searched for
         */
        fun <T : Comparable<T>> search(arr: Array<T>, from: Int, to: Int, key: T): Int? {
            var lo = from
            var hi = to - 1

            while (lo <= hi) {
                val mid = lo + (hi - lo) / 2

                when {
                    key < arr[mid] -> hi = mid - 1
                    key > arr[mid] -> lo = mid + 1
                    else -> return mid
                }
            }

            return null
        }
    }
}