import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(int[][] arr) {
        int fdig = 0;
        int secdig = 0;
        int n = arr.length;
        // for first diagonal
        for (int i = 0; i < n; i++) {
            fdig += arr[i][i];
        }

        // for second diagonal
        for (int i = 0; i < n; i++) {
            secdig += arr[i][n - 1 - i];
        }
        return Math.abs(fdig-secdig);

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(diagonalDifference(arr));
    }
}
