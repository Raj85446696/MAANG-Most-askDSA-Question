import java.util.*;

class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = nums[0]; // Start with the first element
        int sum = 0;

        for (int num : nums) {
            sum += num;
            maxi = Math.max(maxi, sum);
            if (sum < 0) sum = 0; // Reset sum if it becomes negative
        }

        return maxi;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(obj.maxSubArray(arr)); // Output: 6
    }
}
