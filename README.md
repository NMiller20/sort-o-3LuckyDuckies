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
* In each pass, you move one more element to the right until it reaches its final position. If the array is furthest from sorted, no elements start off in the final position, and all but the very last element must be moved. Thus, n passes are needed. 
* In each pass x, x-1 comparisons and swaps need to be made to ensure that all of the elements that aren't yet guaranteed to be in the correct position are swapped as needed. If you were to add up all of the comparisons and swaps, you would get (n-1 + (n-2 ... (1), which is (n-1)(n)/2. Removing all constants and coefficients from this expression to account for differences in different computers, you get n^2
* **Time Complexity big-O classification: O(n^2) swaps, O(n) passes, O(n^2) comparisons. Thus, the algorithm as a whole is O(n^2)**

### Selection Sort: 

* All cases are treated the same - there is no best or worst case. This is because for any array of length n, the algorithm needs to search for the 1st through (n-1)th highest elements, and place each in the correct index. This requires n-1 passes. 
* In each pass x, x-1 comparisons and swaps need to be made to 'walk' the xth element to the correct position. Adding up the number of comparisons and simplifying the expression as for bubble sort, you get n^2. 
* **Time Complexity big-O classification: O(n^2) swaps, O(n) passes, O(n^2) comparisons. Thus, the algorithm as a whole is O(n^2)**



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
