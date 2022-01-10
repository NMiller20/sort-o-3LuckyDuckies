# sort-o-3LuckyDuckies

#### Roster: Gloria Lee, Nora Miller, Ziying Jian
#### Song of the Week: Lotus by REM

### Data:
### BubbleSort

| Array length | Type Sort | Best - passes|Best - comparisons| Best - swaps | Worst - passes | Worst - comparisons | Worst - swaps |
| ----- | --------- | ----- | ---- | --- | ---- | --- | --- |




| 5 | "Bubble" | 1 | 4 | 0 | 4 | 10 | 10 |
| 10 | "Bubble" | 1 | 9 | 0 | 9 | 45
| 50 |"Bubble" | 1 | 49 | 0 | 49| 1225
| 100 |"Bubble" | 1 | 99 | 0 | 99| 4950
| 200 |"Bubble" | 1 | 199 | 0 | 199 | 19900
| 500 |"Bubble" | 1 | 499 | 0 | 499| 124750
| 1000 |"Bubble" | 1 | 999 | 0 | 999| 499500
|10000 | "Bubble" | 1 | 9999 | 0 | 9999 | 49995000





### Bubble Sort:
#### Best Case:
* Best case when the array is completely sorted. ex: [0,2,4,6,8]
* Why? Because **0 swaps** are needed to ensure that this array is sorted
* Because bubble sort works by repeatedly checking whether the entire array is sorted, to establish that the array is sorted and to exit the algorithm, only **1 pass** is needed.
* To check if the entire array is sorted, **n-1** comparisons are needed to process n elements.
* **Time Complexity big-O classification: O(1) swaps, O(1) passes, O(n) comparisons. Thus, the algorithm as a whole is O(n)**


#### Worst Case:
* Worst case when the array is in decreasing order (completely unsorted). ex: [8,6,4,2,0]

* Why? Because in bubble sort, traversing from left to right, you swap each element with its adjacent right until the greatest unfinalized element is pushed to its final position per pass. In each pass, you push one more element to the right until it reaches its final position. Therefore, if array is in decreasing order, elements start off furthest away from their final position, and maximum possible swaps must be made to push each element to its finalized position. All but the very first element in the final array will be finalized, so **n-1 passes** are needed.

* In each pass x, x-1 comparisons and swaps need to be made to ensure that all of the elements that aren't yet guaranteed to be in the correct position are swapped as needed. If you were to add up all of the comparisons and swaps, you would get (n-1 + (n-2 ... (1), which is **(n-1)(n)/2 for comparisons and swaps each**. Removing all constants and coefficients from this expression, you get n^2.
* **Time Complexity big-O classification: O(n^2) swaps, O(n) passes, O(n^2) comparisons. Thus, the algorithm as a whole is O(n^2)**

### Selection Sort:

* All cases are treated the same - there is no best or worst case. This is because for any array of length n, the algorithm needs to search for the 1st through (n-1)th highest elements, and place each in the correct index. This requires n-1 passes because swapping with the same index is possible as well.
* In each pass x, only one swap is needed to place the nth highest element in the correct index - this value is swapped with the element that is already in said index. So **n-1 passes** are needed in total because by default, the last element not considered will be in its sorted position.
* **Time Complexity big-O classification: O(n) swaps, O(n) passes, O(n^2) comparisons. Thus, the algorithm as a whole is O(n^2)**

### Insertion Sort:
#### Best Case:
* Best case when the array is completely sorted. ex: [0,2,4,6,8]
* Why? Because 0 swaps are needed to ensure that this array is sorted.
* Because insertion sort works by maintaining n elements at the beginning of an array which are guaranteed to be sorted, and each pass increases that number by one, one pass is needed for every element besides the last, regardless of how the array is ordered
* In each pass, if the element being added to the sorted section of the element is already in the correct position, only one comparison - of that element to the highest indexed element in the sorted section - is needed to complete the pass. Thus, n-1 comparisons are needed in total.
* **Time Complexity big-O classification: O(1) swaps, O(n) passes, O(n) comparisons. Thus, the algorithm as a whole is O(n)**

#### Worst Case:
* Worst case when the array is completely unsorted (decreasing order) ex: [8,6,4,2,0]
* Regardless of how the array is arranged to begin with, for an array of size n, n-1 elements need to ultimately be added to the sorted section of the array, so n-1 passes are needed.
* In each pass, the maximum number of comparisons are needed when each element being added to the sorted section belongs below the first element in the sorted section. For pass x, this would mean that x-1 comparisons and swaps are needed. So in total, total comparisons and swaps each are **(n-1)(n/2)**
* Adding and removing constants from the number of comparisons and swaps, you get n^2
* **Time Complexity big-O classification: O(n^2) swaps, O(n) passes, O(n^2) comparisons. Thus, the algorithm as a whole is O(n^2)**
