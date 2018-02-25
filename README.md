# Kotlin algorithms

[![Build status](https://travis-ci.org/amolkov/kotlin-algorithms.svg?branch=master)](https://travis-ci.org/amolkov/kotlin-algorithms)

Minimal and clean example implementations of data structures and algorithms in Kotlin.

## Setting up

#### Clone the repo

```
$ git clone https://github.com/amolkov/kotlin-algorithms.git
$ cd kotlin-algorithms
```

#### Building

You can build the app with `$ ./gradlew build` command.

## Implementations

- [Searching](src/main/kotlin/com/github/amolkov/kotlin/algorithms/searching)
    - [binary search](src/main/kotlin/com/github/amolkov/kotlin/algorithms/searching/BinarySearch.kt)
    - [exponential search](src/main/kotlin/com/github/amolkov/kotlin/algorithms/searching/ExponentialSearch.kt)
    - [interpolation search](src/main/kotlin/com/github/amolkov/kotlin/algorithms/searching/InterpolationSearch.kt)
    - [jump search](src/main/kotlin/com/github/amolkov/kotlin/algorithms/searching/JumpSearch.kt)
    - [linear search](src/main/kotlin/com/github/amolkov/kotlin/algorithms/searching/LinearSearch.kt)
    - [ternary search](src/main/kotlin/com/github/amolkov/kotlin/algorithms/searching/TernarySearch.kt)
    
- [Sorting](src/main/kotlin/com/github/amolkov/kotlin/algorithms/sorting)
    - [bubble sort](src/main/kotlin/com/github/amolkov/kotlin/algorithms/sorting/BubbleSort.kt)
    - [counting sort](src/main/kotlin/com/github/amolkov/kotlin/algorithms/sorting/CountingSort.kt)
    - [heap sort](src/main/kotlin/com/github/amolkov/kotlin/algorithms/sorting/HeapSort.kt)
    - [insertion sort](src/main/kotlin/com/github/amolkov/kotlin/algorithms/sorting/InsertionSort.kt)
    - [merge sort](src/main/kotlin/com/github/amolkov/kotlin/algorithms/sorting/MergeSort.kt)
    - [quick sort](src/main/kotlin/com/github/amolkov/kotlin/algorithms/sorting/QuickSort.kt)
    - [selection sort](src/main/kotlin/com/github/amolkov/kotlin/algorithms/sorting/SelectionSort.kt)
    - [shell sort](src/main/kotlin/com/github/amolkov/kotlin/algorithms/sorting/ShellSort.kt)

## License

    Copyright 2018 Alexander Molkov

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
