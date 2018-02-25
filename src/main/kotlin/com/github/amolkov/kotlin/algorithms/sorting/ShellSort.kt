package com.github.amolkov.kotlin.algorithms.sorting

class ShellSort {
    companion object {

        /**
         *  Sorts the specified array into ascending order, according to the natural ordering of its elements,
         *  using the shell sort algorithm.
         *
         *  @param arr the array to be sorted
         */
        fun <T : Comparable<T>> sort(arr: Array<T>) {
            var gap = arr.size / 2

            while (gap > 0) {
                (gap until arr.size).forEach { i ->
                    val tmp = arr[i]
                    var j = i

                    while (j >= gap && tmp < arr[j - gap]) {
                        arr[j] = arr[j - gap]
                        j -= gap
                    }
                    arr[j] = tmp
                }
                gap /= 2
            }
        }
    }
}