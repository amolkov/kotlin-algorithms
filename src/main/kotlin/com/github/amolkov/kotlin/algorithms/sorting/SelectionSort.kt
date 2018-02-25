package com.github.amolkov.kotlin.algorithms.sorting

import com.github.amolkov.kotlin.algorithms.extensions.swap

class SelectionSort {
    companion object {

        /**
         *  Sorts the specified array into ascending order, according to the natural ordering of its elements,
         *  using the selection sort algorithm.
         *
         *  @param arr the array to be sorted
         */
        fun <T : Comparable<T>> sort(arr: Array<T>) {
            (0 until arr.size - 1).forEach { i ->
                var min = i

                (i until arr.size).forEach { j ->
                    if (arr[min] > arr[j]) {
                        min = j
                    }
                }

                if (min != i) {
                    arr.swap(i, min)
                }
            }
        }
    }
}