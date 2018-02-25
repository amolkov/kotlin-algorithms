package com.github.amolkov.kotlin.algorithms.sorting

class InsertionSort {
    companion object {

        /**
         *  Sorts the specified array into ascending order, according to the natural ordering of its elements,
         *  using the insertion sort algorithm.
         *
         *  @param arr the array to be sorted
         */
        fun <T : Comparable<T>> sort(arr: Array<T>) {
            (1 until arr.size).forEach { i ->
                val key = arr[i]
                var idx = i

                while (idx > 0 && arr[idx - 1] > key) {
                    arr[idx] = arr[idx - 1]
                    idx--
                }

                arr[idx] = key
            }
        }
    }
}