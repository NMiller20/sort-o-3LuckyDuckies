# sort-o-3LuckyDuckies

#### Roster: Gloria Lee, Nora Miller, Ziying Jian
#### Song of the Week:

### Bubblesort
#### Best Case: 
* Best case when the array is completely sorted. ex: [0,2,4,6,8]
* Why? Because 0 swaps are needed to ensure that the array is sorted, and only one pass is necessary.
* In the best case, bubble sort swaps 0 times, makes 1 pass, and makes n-1 comparisons. 
* Why? From best test case data: arraysize 5 -> 4 comparisons, arraysize 10 -> 9 comparisons, array size 50 -> 49 comparisons etc. After the array is traversed with no swaps, the array is finalized as sorted and one pass is made.
* Time Complexity big-O classification: O(1) swaps, O(1) passes, O(n) comparisons. 

#### Worst Case:
* Worst case when the array is in decreasing order (completely unsorted). ex: [8,6,4,2,0]


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
