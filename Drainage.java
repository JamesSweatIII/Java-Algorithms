// imports
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Drainage {
    public static void max_run(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
    
        int[][] currentPath = new int[rows][cols]; // Create a 2D array to store the length of the longest path for each cell
        int maxLength = 0; // Initialize maximum length of drainage path
        int maxRow = -1; // Initialize row coordinate of the cell with maximum length
        int maxColumn = -1; // Initialize column coordinate of the cell with maximum length
        Map<String, List<int[]>> memory = new HashMap<>(); // Create a memoization map to store calculated paths
    
        // Update currentPath array by comparing adjacent cells and finding the longest drainage path
        for (int i = rows - 1; i >= 0; i--) { // Start from the bottom-right corner of the grid
            for (int j = cols - 1; j >= 0; j--) {
                int currentLength = findLongestPath(grid, currentPath, memory, i, j); // Find the longest path for the current cell
    
                currentPath[i][j] = currentLength; // Update currentPath array with the calculated length
    
                if (currentPath[i][j] > maxLength) { // Update maximum length and coordinates if the current length is greater
                    maxLength = currentPath[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
    
        // Extract the longest drainage path from currentPath array
        List<int[]> drainagePath = memory.get(maxRow + "," + maxColumn); // Get the path from memory using the coordinates of the cell with the max length
        if (drainagePath != null) {
            for (int i = drainagePath.size() - 1; i >= 0; i--) { // Print the coordinates of cells in the path in reverse order
                int[] coordinates = drainagePath.get(i);
                System.out.println(coordinates[0] + " " + coordinates[1]);
            }
        }
    }

    private static int findLongestPath(int[][] grid, int[][] currentPath, Map<String, List<int[]>> memory, int rowIndex, int columnIndex) {
        int rowLength = grid.length; // Get the number of rows in the grid
        int columnLength = grid[0].length; // Get the number of columns in the grid
    
        // If the length of the longest path from this position has already been computed, return it
        if (currentPath[rowIndex][columnIndex] > 0) {
            return currentPath[rowIndex][columnIndex];
        }
    
        int maxLength = 0; // Variable to store the length of the longest path
        List<int[]> maximumPath = new ArrayList<>(); // Variable to store the coordinates of the longest path
        int[][] possibleDirections = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} }; // Array to store the possible directions to move
    
        // Loop through all possible directions to move
        for (int[] direction : possibleDirections) {
            int newRow = rowIndex + direction[0]; // Calculate the new row position
            int newColumn = columnIndex + direction[1]; // Calculate the new column position
    
            // Check if the new position is within the bounds of the grid and has a lower value than the current position
            if (newRow >= 0 && newRow < rowLength && newColumn >= 0 && newColumn < columnLength && grid[newRow][newColumn] < grid[rowIndex][columnIndex]) {
                // Recursively find the length of the longest path from the new position
                int currentLength = findLongestPath(grid, currentPath, memory, newRow, newColumn);
                // Update the maxLength and maximumPath if a longer path is found
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maximumPath = new ArrayList<>(memory.get(newRow + "," + newColumn));
                }
            }
        }
    
        // Create a new path from the current position to the longest path found and update memo
        List<int[]> finalPath = new ArrayList<>(maximumPath);
        int[] coordinates = {rowIndex, columnIndex};
        finalPath.add(coordinates);
        memory.put(rowIndex + "," + columnIndex, finalPath);
    
        // Return the length of the longest path from the current position
        return maxLength + 1;
    }
    
    
}
