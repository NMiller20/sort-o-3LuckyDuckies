# sort-o-3LuckyDuckies

#### Roster: Gloria Lee, Nora Miller, Ziying Jian
#### Song of the Week:

### Bubblesort
#### Best Case: 
* Best case when the array is completely sorted. ex: [0,2,4,6,8]
* 0 swaps are needed to ensure that this array is sorted
* Because bubble sort works by repeatedly checking whether the entire array is sorted, to establish that the array is sorted and to exit the algorithm, only 1 pass is needed. 
* To check if the entire array is sorted, n-1 comparisons are needed to process n elements. 
* **Time Complexity big-O classification: O(1) swaps, O(1) passes, O(n) comparisons. Thus, the algorithm as a whole is O(n)**


#### Worst Case:
* Worst case when the array is in decreasing order (completely unsorted). ex: [8,6,4,2,0]
* In each pass, you move one more element to the right until it reaches its final position. If the array is furthest from sorted, no elements start off in the final position, and they must all be moved. Thus, n-1 passes are needed. 
* 
* swapped over right and right again until they reach that final position in each swap. Because the array is in decreasing order, elements must swap the most amount of times to get to their final positions.


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
