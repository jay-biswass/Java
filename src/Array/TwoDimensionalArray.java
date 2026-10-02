package Array;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        // 1. Declaration and shorthand initialization (3 rows, 3 columns)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 2. Alternative declaration with a fixed size (2 rows, 4 columns)
        // Memory is allocated, and elements defaults to 0
        int[][] grid = new int[2][4];

        // 3. Modifying specific elements using indices [row][column]
        // Remember: Java arrays use 0-based indexing
        grid[0][0] = 10; // First row, first column
        grid[1][3] = 40; // Second row, fourth column

        // 4. Accessing a specific element
        System.out.println("Element at grid[0][0]: " + grid[0][0]);
        System.out.println("---------------------------------");

        // 5. Iterating through the 2D array using standard nested loops
        System.out.println("Printing the matrix grid:");
        for (int i = 0; i < matrix.length; i++) { // Loops through rows
            for (int j = 0; j < matrix[i].length; j++) { // Loops through columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        System.out.println("---------------------------------");

        // 6. Iterating using enhanced for-each loops
        System.out.println("Printing the matrix using for-each loops:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
