import java.util.*;

class Solution {

    public List<int[]> MergeIntervals(int[][] arr) {
        if (arr.length <= 1) {
            return Arrays.asList(arr); 
        }

        Arrays.sort(arr, Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();
        int[] newInterval = arr[0];
        result.add(newInterval);

        for (int[] interval : arr) {
            if (interval[0] <= newInterval[1]) { 
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = {{1, 3}, {2, 6}, {9, 11}, {8, 10}, {2, 4}, {15, 18}, {16, 17}};

        List<int[]> mergedIntervals = s.MergeIntervals(arr);

        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
