import java.util.*;

public class FlippingMatrix {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size();
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int maxVal = Math.max(
                    Math.max(matrix.get(i).get(j), matrix.get(i).get(2 * n - 1 - j)),
                    Math.max(matrix.get(2 * n - 1 - i).get(j), matrix.get(2 * n - 1 - i).get(2 * n - 1 - j))
                );
                maxSum+=maxVal;
            }
        }return maxSum;

    }

    public static void main(String[] args) {

    }
}
