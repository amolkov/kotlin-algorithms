package com.github.amolkov.kotlin.algorithms.sorting

class MergeSort {

    companion object {

        /**
         *  Sorts the specified array into ascending order, according to the natural ordering of its elements,
         *  using the merge sort algorithm.
         *
         *  @param arr the array to be sorted
         */
        fun sort(arr: Array<Int>) {
            val helper = Array(arr.size) { 0 }
            sort(arr, 0, arr.size - 1, helper)
        }

        private fun sort(arr: Array<Int>, lo: Int, hi: Int, helper: Array<Int>) {
            if (lo >= hi) {
                return
            }

            val mid = lo + (hi - lo) / 2

            sort(arr, lo, mid, helper)
            sort(arr, mid + 1, hi, helper)
            merge(arr, lo, mid, hi, helper)
        }

        private fun merge(arr: Array<Int>, lo: Int, mid: Int, hi: Int, helper: Array<Int>) {
            (lo..hi).forEach { helper[it] = arr[it] }

            var left = lo
            var right = mid + 1

            (lo..hi).forEach {
                when {
                    left > mid -> arr[it] = helper[right++]
                    right > hi -> arr[it] = helper[left++]
                    helper[left] <= helper[right] -> arr[it] = helper[left++]
                    else -> arr[it] = helper[right++]
                }
            }
        }
    }
}
