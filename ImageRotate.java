import java.util.Arrays;

public class ImageRotate {
    public int[][] RotateImage(int[][]arr){
        int n = arr.length; 
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {  
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0 ; i<n ; i++){
            int left = 0 ; 
            int right = n-1; 
            while(left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp ; 
                left++; 
                right-- ; 
            }
        }return arr ; 
    }

    public static void PrintArray(int[][] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args) {
        ImageRotate s = new ImageRotate();
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(s.RotateImage(arr));
        PrintArray(arr);

    }
}
