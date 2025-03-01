import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }
        
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(obj.groupAnagrams(strs));
    }
}
