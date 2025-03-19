# Project: Java Algorithm and Data Structure Implementations

## Overview
This project contains multiple Java classes implementing different algorithmic solutions and data structures. The implementations cover clustering, sorting, searching, trees, queues, mathematical operations, and game strategies.

## Files and Descriptions

### 1. `Clusterer.java`
- Implements a clustering algorithm to group data points into `k` clusters based on their pairwise distances.
- Uses a greedy approach to merge clusters until the desired number is reached.
- Computes the cost of clustering as the minimum distance between any two clusters.

### 2. `Drainage.java`
- Computes the longest drainage path in a grid-based elevation map.
- Uses dynamic programming with memoization to find the longest decreasing sequence of elevations.
- Outputs the path coordinates in reverse order, from lowest to highest.

### 3. `GamePlayer.java`
- Implements a divide-and-conquer algorithm to find the optimal game move.
- Uses binary search and heuristic evaluation to determine the best move in a game board scenario.

### 4. `GreedyChooser.java`
- Implements three greedy algorithms:
  - **`deadlines`**: Selects the task with the earliest deadline.
  - **`bakeoff`**: Selects the component with the best active-to-passive time ratio.
  - **`mileage`**: Selects the most fuel-efficient car for delivery.

### 5. `MedianFinder.java`
- Implements an optimized algorithm to find the median of two sorted arrays.
- Uses binary search to efficiently partition the arrays and compute the median.
- Handles both even and odd total sizes correctly.

### 6. `NestBoxes.java`
- Implements an algorithm to determine the maximum number of nested boxes.
- Uses dynamic programming and depth-first search (DFS) to compute the deepest nesting configuration.

### 7. `AVLTree.java`
- Implements a self-balancing AVL tree.
- Provides insertion and removal methods that maintain balance through rotations.
- Extends a binary search tree (BST) to ensure O(log n) operations.

### 8. `BigOh.java`
- Contains methods demonstrating various time complexities:
  - **Binary search** (O(log n))
  - **Finding max value** (O(n))
  - **Multiple binary search calls** (O(n log n))
  - **Counting pairs summing to multiples of 5** (O(n²))
  - **Finding all triplets satisfying a+b=c** (O(n³))
  - **Generating all subsets** (O(2ⁿ))

### 9. `FourFunctions.java`
- Implements multiple utility functions:
  - **Even sum split**: Finds a pivot where the sum of two halves is equal.
  - **Just 8 and 9**: Checks if an array contains only 8s and 9s.
  - **Count runs**: Counts consecutive repeated numbers.
  - **Sum 6-7**: Sums numbers while ignoring values between 6 and 7.
  - **Mode**: Determines the most frequent number in an array.

### 10. `MinMax.java`
- Implements:
  - **Finding the second largest number**
  - **Finding the second smallest number**
- Uses sorting and scanning techniques to achieve results efficiently.

### 11. `Power.java`
- Implements an iterative function to compute power (`base^exp`).
- Uses a simple loop to multiply values successively.

### 12. `Queue.java`
- Implements a linked-list-based queue.
- Provides `enqueue`, `dequeue`, and `size` operations.
- Uses a custom `LinkedList` class for internal storage.

### 13. `RobotZookeeper.java`
- Simulates a zookeeper handling different animals.
- Assigns food, toys, and attention to elephants, lions, and monkeys.
- Implements logic to track the needs of each animal type.

### 14. `SortingAlgorithms.java`
- Implements sorting algorithms:
  - **Insertion Sort**
  - **Merge Sort**
  - **Quick Sort**
- Uses helper methods for merging and partitioning data.

### 15. `Vector.java`
- Implements a custom `Vector` class that extends the `List<T>` interface.
- Supports dynamic resizing, insertion, deletion, and search operations.

## Compilation and Execution
To compile and run a specific file, use:

```sh
javac FileName.java
java FileName
```

Ensure all necessary dependencies (such as linked lists or additional classes) are available in the classpath.

## Dependencies
- Uses Java standard libraries (`java.util.*`, `java.io.*`).
- Some classes depend on custom implementations (`LinkedList.java`, `BinarySearchTree.java`).

## License
This project is released under an open-source license. Refer to the LICENSE file for details.

## Author
Developed by James Sweat III

## Acknowledgments
If you referenced external sources or collaborated with others, acknowledge them here.

