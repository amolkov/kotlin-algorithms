package com.github.amolkov.kotlin.algorithms.sorting

import com.github.amolkov.kotlin.algorithms.extensions.swap

class HeapSort {

    companion object {

        /**
         *  Sorts the specified array into ascending order, according to the natural ordering of its elements,
         *  using the heap sort algorithm.
         *
         *  @param arr the array to be sorted
         */
        fun <T : Comparable<T>> sort(arr: Array<T>) {
            val size = arr.size

            (size / 2 - 1 downTo 0).forEach { heapify(arr, size, it) }

            (size - 1 downTo 0).forEach {
                arr.swap(0, it)
                heapify(arr, it, 0)
            }
        }

        private fun <T : Comparable<T>> heapify(arr: Array<T>, size: Int, idx: Int) {
            var largest = idx

            val left = (idx shl 1) + 1
            val right = (idx shl 1) + 2

            if (left < size && arr[left] > arr[largest]) {
                largest = left
            }

            if (right < size && arr[right] > arr[largest]) {
                largest = right
            }

            if (largest != idx) {
                arr.swap(idx, largest)
                heapify(arr, size, largest)
            }
        }
    }
}
