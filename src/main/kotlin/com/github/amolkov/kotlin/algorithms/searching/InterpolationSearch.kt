package com.github.amolkov.kotlin.algorithms.searching

class InterpolationSearch {
    companion object {

        /**
         * Searches the specified array for the specified value using the interpolation search algorithm.
         *
         * @param arr the array to be searched
         * @param key the value to be searched for
         */
        fun search(arr: Array<Int>, key: Int): Int? {
            if (arr.isEmpty()) {
                return null
            }

            var lo = 0
            var hi = arr.size - 1

            while (lo != hi && key >= arr[lo] && key <= arr[hi]) {
                val mid = lo + (hi - lo) / (arr[hi] - arr[lo]) * (key - arr[lo])

                when {
                    key == arr[mid] -> return mid
                    key > arr[mid] -> lo = mid + 1
                    else -> hi = mid - 1
                }
            }

            return when (key) {
                arr[lo] -> lo
                else -> null
            }
        }
    }
}