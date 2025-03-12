public class MinimumWindowSubstringSimple {
    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        int[] targetFreq = new int[128]; // ASCII character frequency for 't'
        for (char c : t.toCharArray()) {
            targetFreq[c]++;
        }

        int left = 0, right = 0, startIndex = 0, minLength = Integer.MAX_VALUE;
        int requiredChars = t.length(), matchedChars = 0;

        int[] windowFreq = new int[128]; // ASCII character frequency for current window

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            
            // If this character is needed in 't', increase the matched count
            if (targetFreq[rightChar] > 0) {
                windowFreq[rightChar]++;
                if (windowFreq[rightChar] <= targetFreq[rightChar]) {
                    matchedChars++;
                }
            }

            // Once we have all characters of 't' in the window
            while (matchedChars == requiredChars) {
                // Update the minimum window
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                
                // Try reducing the window size
                if (targetFreq[leftChar] > 0) {
                    if (windowFreq[leftChar] == targetFreq[leftChar]) {
                        matchedChars--;
                    }
                    windowFreq[leftChar]--;
                }

                left++; // Shrink window
            }

            right++; // Expand window
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLength);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("Minimum Window Substring: " + minWindow(s, t));  // Output: "BANC"
    }
}
