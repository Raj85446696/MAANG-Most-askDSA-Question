import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralMatrix(int[][] mat) {
        List<Integer> arr = new ArrayList<>(); 
        int n = mat.length;
        int m = mat[0].length ; 
        int left = 0 , right = m - 1; 
        int top = 0 , bottom = n - 1; 
        
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                arr.add(mat[top][i]); 
            }
            top++;
            if (top <= bottom) { // Check to avoid overflow
                for (int i = top; i <= bottom; i++) {
                    arr.add(mat[i][right]);
                }
                right--;
            }
    
            if (left <= right) { // Check to avoid overflow
                for (int i = right; i >= left; i--) {
                    arr.add(mat[bottom][i]);
                }
                bottom--; 
            }
            if (top <= bottom) { 
                for (int i = bottom; i >= top; i--) {
                    arr.add(mat[i][left]);
                }
                left++; 
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        SpiralMatrix s = new SpiralMatrix(); 
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(s.spiralMatrix(arr));
    }
}
