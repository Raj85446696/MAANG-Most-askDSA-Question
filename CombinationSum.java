import java.util.*;

public class CombinationSum {
    public static void findCombinations(int[] arr, int target, int index, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current)); // Found a valid combination
            return;
        }
        
        for (int i = index; i < arr.length; i++) {
            if (arr[i] <= target) { // Only include if it doesn't exceed the target
                current.add(arr[i]); // Choose
                findCombinations(arr, target - arr[i], i, current, result); // Explore (i allows reusing elements)
                current.remove(current.size() - 1); // Backtrack
            }
        }
    }

    public static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); // Optional: Sort to optimize
        findCombinations(arr, target, 0, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(arr, target));
    }
}
