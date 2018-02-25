package com.github.amolkov.kotlin.algorithms.extensions

/**
 * Swaps the two specified elements at the specified positions in the array.
 *
 * @param left the index of one element to be swapped
 * @param right the index of the other element to be swapped
 */
fun <T> Array<T>.swap(left: Int, right: Int) {
    val temp = this[left]
    this[left] = this[right]
    this[right] = temp
}

/**
 * Splits the array at the specified index into a pair of arrays.
 *
 * @param idx the index of the element where to split the array
 */
fun <T> Array<T>.split(idx: Int): Pair<Array<T>, Array<T>> =
        Pair(sliceArray(0 until idx), sliceArray(idx until size))
