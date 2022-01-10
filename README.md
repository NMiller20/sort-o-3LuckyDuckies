# sort-o-3LuckyDuckies

#### Roster: Gloria Lee, Nora Miller, Ziying Jian
#### Song of the Week:

### Bubble Sort:
#### Best Case:
* Best case when the array is completely sorted. ex: [0,2,4,6,8]
* 0 swaps are needed to ensure that this array is sorted
* Because bubble sort works by repeatedly checking whether the entire array is sorted, to establish that the array is sorted and to exit the algorithm, only 1 pass is needed.
* To check if the entire array is sorted, n-1 comparisons are needed to process n elements.
* **Time Complexity big-O classification: O(1) swaps, O(1) passes, O(n) comparisons. Thus, the algorithm as a whole is O(n)**


#### Worst Case:
* Worst case when the array is in decreasing order (completely unsorted). ex: [8,6,4,2,0]

* Why? In bubble sort, traversing from left to right, you swap each element with its adjacent right until the greatest unfinalized element is pushed to its final position per pass. In each pass, you push one more element to the right until it reaches its final position. Therefore, if array is in decreasing order, elements start off furthest away from their final position, and maximum possible swaps must be made to push each element to its finalized position. All but the very first element in the final array will be finalized, so n-1 passes are needed.

* In each pass x, x-1 comparisons and swaps need to be made to ensure that all of the elements that aren't yet guaranteed to be in the correct position are swapped as needed. If you were to add up all of the comparisons and swaps, you would get (n-1 + (n-2 ... (1), which is (n-1)(n)/2. Removing all constants and coefficients from this expression, you get n^2.
* **Time Complexity big-O classification: O(n^2) swaps, O(n) passes, O(n^2) comparisons. Thus, the algorithm as a whole is O(n^2)**

### Selection Sort:

* All cases are treated the same - there is no best or worst case. This is because for any array of length n, the algorithm needs to search for the 1st through (n-1)th highest elements, and place each in the correct index. This requires n-1 passes.
* In each pass x, x-1 comparisons and swaps need to be made to 'walk' the xth element to the correct position. Adding up the number of comparisons and simplifying the expression as for bubble sort, you get n^2.
* **Time Complexity big-O classification: O(n^2) swaps, O(n) passes, O(n^2) comparisons. Thus, the algorithm as a whole is O(n^2)**

### Insertion Sort: 
#### Best Case:
* Best case when the array is completely sorted. ex: [0,2,4,6,8]
* 0 swaps are needed to ensure that this array is sorted
* Because insertion sort works by maintaining n elements at the end of an array which are guaranteed to be sorted, and each pass increases that number by one, one pass is needed for every element besides the last. 
* In each pass, if the element being added to the sorted section of the element is already in the correct position, only one comparison - of that element to the highest indexed element in the sorted section - is needed to complete the pass. Thus, n-1 comparisons are needed in total. 
* **Time Complexity big-O classification: O(1) swaps, O(n) passes, O(n) comparisons. Thus, the algorithm as a whole is O(n)**




Best Cases:
 ---> Bubble Sort: 1 pass, n-1 compares, 0 swaps. Occurs when elements are already in order

 ---> Selection Sort: n-1 passes, (n-1)(n)/2 compares, n-1 swaps
      All cases have same number of passes, compares, and swaps for Selection Sort, so there is no worst/best case.

 ---> Insertion Sort: n-1 passes, n-1 compares, 0 swaps. Occurs when elements are already in order


Worst Cases:
---> Bubble Sort:  n-1 passes, (n-1)(n)/2 compares, (n-1)(n)/2 swaps. Occurs when elements are sorted in the opposite order

---> Selection Sort: n-1 passes, (n-1)(n)/2 compares, n-1 swaps
    All cases have same number of passes, compares, and swaps for Selection Sort, so there is no worst/best case.
---> Insertion Sort: n-1 passes, (n-1)(n)/2 compares, (n-1)(n)/2 swaps. Occurs when elements are sorted in the opposite order
Best Algorithm:
  - B

BubbleSort, worst case:
README.md displaying
TNPG
roster
SotW
Sections with headings “Bubblesort”, “Selection Sort”, “Insertion Sort”
For each sort, a description and example of best- and worst-case arrangement of data, and *why*.
For each sort, a big-O classification of the best- and worst-case time complexity.
