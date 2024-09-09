
# Bubble Sort

**Bubble Sort** is one of the simplest sorting algorithms. It works by repeatedly swapping the adjacent elements if they are in the wrong order. This process continues until the list is sorted.

## How Bubble Sort Works

Imagine you have a list of numbers and you want to sort them in ascending order (from smallest to largest). Bubble Sort works like bubbles in water; the largest elements "bubble up" to the top (end of the list) after each pass.

### Step-by-Step Explanation

1. Start at the beginning of the list.
2. Compare the first two elements.
3. If the first element is larger than the second, swap them.
4. Move to the next pair of elements and repeat steps 2-3.
5. Continue this process until you reach the end of the list. This completes one pass.
6. Repeat the entire process for the remaining unsorted elements. Each time, the largest unsorted element will bubble up to its correct position.
7. Stop when no more swaps are needed. The list is now sorted!

### Example

Let's sort the following list using Bubble Sort:

**Unsorted List:** `[5, 2, 9, 1, 5]`

**Pass 1:**
- Compare 5 and 2. Swap them: `[2, 5, 9, 1, 5]`
- Compare 5 and 9. No swap needed: `[2, 5, 9, 1, 5]`
- Compare 9 and 1. Swap them: `[2, 5, 1, 9, 5]`
- Compare 9 and 5. Swap them: `[2, 5, 1, 5, 9]`

**Pass 2:**
- Compare 2 and 5. No swap needed: `[2, 5, 1, 5, 9]`
- Compare 5 and 1. Swap them: `[2, 1, 5, 5, 9]`
- Compare 5 and 5. No swap needed: `[2, 1, 5, 5, 9]`
- 9 is already in its correct position (end of list).

**Pass 3:**
- Compare 2 and 1. Swap them: `[1, 2, 5, 5, 9]`
- Compare 2 and 5. No swap needed: `[1, 2, 5, 5, 9]`
- Compare 5 and 5. No swap needed: `[1, 2, 5, 5, 9]`

**The list is now sorted!**

### Complexity

- **Time Complexity:**  
  - Worst-case: `O(n^2)` (when the list is in reverse order)  
  - Best-case: `O(n)` (when the list is already sorted)  
  - Average-case: `O(n^2)`

- **Space Complexity:** `O(1)` (Bubble Sort is an in-place sorting algorithm)

### Visualization

![Bubble Sort Visualization](https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif)

### Pros and Cons

#### Pros
- Simple and easy to understand.
- Suitable for small datasets.

#### Cons
- Inefficient for large datasets.
- Takes a long time to sort if the list is mostly unsorted.

### When to Use Bubble Sort?

Bubble Sort is ideal for learning purposes and understanding basic sorting principles. It is rarely used in practice for large datasets due to its inefficiency compared to other sorting algorithms like Merge Sort or Quick Sort.

## Conclusion

Bubble Sort is a great way to start learning about sorting algorithms. It demonstrates the basic concept of comparing and swapping elements and helps build a foundation for understanding more advanced sorting techniques.

