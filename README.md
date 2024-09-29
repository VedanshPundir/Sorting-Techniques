# Sorting-Techniques
A collection of sorting techniques in java

## Table of Contents
  - [1. Bubble Sort](#1-bubble-sort)
  - [2. Selection Sort](#2-selection-sort)
  - [3. Insertion Sort](#3-insertion-sort)
  - [4. Merge Sort](#4-merge-sort)
  - [5. Quick Sort](#5-quick-sort)
  - [6. Cycle Sort](#6-cycle-sort)
- [Time and Space Complexities](#time-and-space-complexities)


## Sorting Algorithms

### 1. Bubble Sort

**Description:**
Bubble Sort is one of the simplest sorting algorithms. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.


**Java Implementation:** [Bubblesort.java](./Bubblesort.java)

---

### 2. Selection Sort

**Description:**
Selection Sort divides the input list into two parts: a sorted sublist of items which is built up from left to right and an unsorted sublist. It repeatedly selects the smallest (or largest) element from the unsorted sublist and moves it to the end of the sorted sublist.


**Java Implementation:** [Selectionsort.java](./Selectionsort.java)

---

### 3. Insertion Sort

**Description:**
Insertion Sort builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms but has the advantage of simplicity and efficiency on small or nearly sorted datasets.


**Java Implementation:** [Insertionsort.java](./Insertionsort.java)

---

### 4. Merge Sort

**Description:**
Merge Sort is a divide-and-conquer algorithm that divides the input array into two halves, recursively sorts them, and then merges the sorted halves to produce the final sorted array.


**Java Implementation:** [Mergesort.java](./Mergesort.java)

---

### 5. Quick Sort

**Description:**
Quick Sort is an efficient, in-place sorting algorithm that employs a divide-and-conquer strategy. It selects a 'pivot' element and partitions the array into two sub-arrays, according to whether elements are less than or greater than the pivot.


**Java Implementation:** [Quicksort.java](./Quicksort.java)

---

### 6. Cycle Sort

**Description:**
Cycle Sort is an in-place, unstable sorting algorithm that is optimal in terms of the total number of writes to the array. It is particularly useful when memory writes are expensive.


**Java Implementation:** [Cyclesort.java](./Cyclesort.java)

---

## Time and Space Complexities

Understanding the time and space complexities of each sorting algorithm is crucial for selecting the right algorithm based on the context and constraints of your problem.

| **Sorting Algorithm** | **Time Complexity**       | **Space Complexity** | **Stable** | **In-Place** |
|-----------------------|---------------------------|----------------------|------------|--------------|
| **Bubble Sort**        | O(n²)                     | O(1)                 | Yes        | Yes          |
| **Selection Sort**     | O(n²)                     | O(1)                 | No         | Yes          |
| **Insertion Sort**     | O(n²)                     | O(1)                 | Yes        | Yes          |
| **Merge Sort**         | O(n log n)                | O(n)                 | Yes        | No           |
| **Quick Sort**         | O(n²) *Average: O(n log n)*| O(log n)             | No         | Yes          |
| **Cycle Sort**         | O(n²)                     | O(1)                 | No         | Yes          |

**Notes:**
- *Quick Sort* has an average time complexity of O(n log n) but can degrade to O(n²) in the worst case, typically mitigated by using random pivots or other pivot selection strategies.
- **Stable** means that the algorithm maintains the relative order of equal elements.
- **In-Place** means that the algorithm requires only a constant amount of extra space.

---

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/VedanshPundir/Sorting-Techniques.git
   cd Sorting-Techniques

