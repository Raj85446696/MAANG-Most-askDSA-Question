# MAANG-Most-askDSA-Question
Problems Covered:
Two Sum using HashMap

Objective: Find indices of two numbers in an array that add up to a specific target.
Approach:
Utilize a HashMap to store the difference between the target and the current element as the key, and the index of the current element as the value.
Traverse the array once, checking if the complement (target - current element) is already present in the HashMap.
Time Complexity: O(n), where n is the length of the array, because we traverse the array once.
Space Complexity: O(n), for storing the elements in the HashMap.
Longest Substring Without Repeating Characters using HashSet

Objective: Determine the length of the longest substring without repeating characters in a given string.
Approach:
Use a sliding window technique with a HashSet to track the characters in the current substring.
Expand the window by moving the right pointer and contract it by moving the left pointer when a repeating character is found.
Time Complexity: O(n), where n is the length of the string, as each character is visited at most twice.
Space Complexity: O(min(n, m)), where m is the size of the character set (e.g., 26 for lowercase English letters) due to the HashSet.
