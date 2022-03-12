package com.github.amolkov.kotlin.algorithms.sorting

class CountingSort {

    companion object {

        /**
         *  Sorts the specified array into ascending order, according to the natural ordering of its elements,
         *  using the counting sort algorithm.
         *
         *  @param arr the array to be sorted
         */
        fun sort(arr: Array<Int>) {
            var max = (arr.indices).map { arr[it] }.maxOrNull() ?: 0
            max += 1

            val count = Array(max) { 0 }
            (arr.indices).forEach { count[arr[it]]++ }
            (1 until count.size).forEach { count[it] += count[it - 1] }

            val sorted = Array(arr.size) { 0 }
            (arr.indices).forEach {
                val index = count[arr[it]]

                sorted[index - 1] = arr[it]
                count[arr[it]]--
            }

            (arr.indices).forEach { arr[it] = sorted[it] }
        }
    }
}
