package com.github.amolkov.kotlin.algorithms.sorting

import com.github.amolkov.kotlin.algorithms.extensions.swap

class QuickSort {

    companion object {

        /**
         *  Sorts the specified array into ascending order, according to the natural ordering of its elements,
         *  using the quick sort algorithm.
         *
         *  @param arr the array to be sorted
         */
        fun <T : Comparable<T>> sort(arr: Array<T>) = sort(arr, 0, arr.size - 1)

        private fun <T : Comparable<T>> sort(arr: Array<T>, lo: Int, hi: Int) {
            if (lo >= hi) {
                return
            }

            val p = partition(arr, lo, hi)

            sort(arr, lo, p - 1)
            sort(arr, p, hi)
        }

        private fun <T : Comparable<T>> partition(arr: Array<T>, lo: Int, hi: Int): Int {
            val pivot = arr[hi]
            var left = lo
            var right = hi

            while (left < right) {
                while (arr[left] < pivot) left++
                while (arr[right] > pivot) right--

                if (left <= right) {
                    arr.swap(left, right)
                }
            }

            return left
        }
    }
}
