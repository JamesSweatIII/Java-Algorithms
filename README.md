# Project: Java Algorithm Implementations

## Overview
This project contains multiple Java classes implementing different algorithmic solutions to computational problems. Each class is designed to perform a specific task efficiently. Below is a description of each file and its functionality.

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
- Each function iterates through an input list of pairs and applies a selection heuristic.

### 5. `MedianFinder.java`
- Implements an optimized algorithm to find the median of two sorted arrays.
- Uses binary search to efficiently partition the arrays and compute the median.
- Handles both even and odd total sizes correctly.

### 6. `NestBoxes.java`
- Implements an algorithm to determine the maximum number of nested boxes.
- Uses dynamic programming and depth-first search (DFS) to compute the deepest nesting configuration.
- Sorts boxes by height in descending order before applying the memoized DFS.

## Compilation and Execution
Each Java file is self-contained and does not rely on a main method. To compile and run any file, follow these steps:

```sh
javac FileName.java
java FileName
```

Replace `FileName.java` with the actual Java file name you want to run.

## Dependencies
- The implementation assumes standard Java libraries (`java.util.*`, `java.io.*`).
- No external dependencies are required.

## License
This project is released under an open-source license. Please refer to the LICENSE file for details.

## Author
Developed by James Sweat III

## Acknowledgments
If you used any external references or had peer collaborations, acknowledge them here.

