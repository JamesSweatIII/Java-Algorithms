import java.util.*;

public class NestBoxes {
    public static int max_depth(Box[] boxes) {
        // Sort the boxes in decreasing order of height
        Arrays.sort(boxes, new Comparator<Box>() {
            public int compare(Box b1, Box b2) {
                return Double.compare(b2.height, b1.height);
            }
        });

        int n = boxes.length;
        int[] dp = new int[n]; // Memory array to store computed depths
        Arrays.fill(dp, -1); // Initialize memory array with -1

        int maxDepth = 0; // Variable to store the maximum nesting depth

        // Loop through each box
        for (int i = 0; i < n; i++) {
            maxDepth = Math.max(maxDepth, dfs(boxes, i, dp)); // Use a helper function for memoization
        }

        return maxDepth;
    }

    // Helper function to compute the depth of a box at a given index
    public static int dfs(Box[] boxes, int index, int[] dp) {
        if (dp[index] != -1) {
            return dp[index]; // Return memoized result if available
        }

        int maxDepth = 1; // Initialize maxDepth to 1, as every box has a minimum depth of 1

        // Loop through all boxes before the current index
        for (int i = 0; i < index; i++) {
            // Check if the current box fits inside the box at the current index
            if (boxes[i].length > boxes[index].length && boxes[i].width > boxes[index].width
                    && boxes[i].height > boxes[index].height) {
                // Recursively calculate the depth and update maxDepth
                maxDepth = Math.max(maxDepth, dfs(boxes, i, dp) + 1);
            }
        }

        dp[index] = maxDepth; // Store result in memoization array

        return maxDepth;
    }
}
