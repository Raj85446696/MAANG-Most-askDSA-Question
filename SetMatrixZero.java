import java.util.*;

class Solution {
    public List<List<Integer>> SetMatrixZero(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        int[] row = new int[r]; // Array to mark rows that need to be zeroed
        int[] col = new int[c]; // Array to mark columns that need to be zeroed
        
        // Step 1: Mark rows and columns that need to be zeroed
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1; 
                    col[j] = 1;
                }
            }
        }
        
        // Step 2: Set the marked rows and columns to zero
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // Convert matrix to List<List<Integer>> for returning
        List<List<Integer>> result = new ArrayList<>();
        for (int[] rowArr : matrix) {
            List<Integer> rowList = new ArrayList<>();
            for (int num : rowArr) {
                rowList.add(num);
            }
            result.add(rowList);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = {
            {1, 1, 1}, 
            {1, 0, 1}, 
            {1, 1, 1}
        };

        List<List<Integer>> updatedMatrix = s.SetMatrixZero(arr);
        
        // Print the modified matrix
        for (List<Integer> row : updatedMatrix) {
            System.out.println(row);
        }
    }
}
