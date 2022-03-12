package com.github.amolkov.kotlin.algorithms.sorting

import com.github.amolkov.kotlin.algorithms.extensions.swap

class BubbleSort {
    companion object {

        /**
         *  Sorts the specified array into ascending order, according to the natural ordering of its elements,
         *  using the bubble sort algorithm.
         *
         *  @param arr the array to be sorted
         */
        fun <T : Comparable<T>> sort(arr: Array<T>) {
            var swapped = true

            while (swapped) {
                swapped = false
                (0 until arr.size - 1).forEach {
                    if (arr[it] > arr[it + 1]) {
                        arr.swap(it, it + 1)
                        swapped = true
                    }
                }
            }
        }
    }
}
