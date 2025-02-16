import java.util.HashSet;

public class LongestSubstring {

    public int LenghtofLongestSubString(String str){
        HashSet<Character> set = new HashSet<>(); 
        int left = 0 ; 
        int maxlen = 0 ; 
        for(int right = 0 ; right<str.length();right++){
            char currChar = str.charAt(right);
            while(set.contains(currChar)){
                set.remove(str.charAt(left));
                left++; 
            }set.add(currChar);
            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen; 

    }
    public static void main(String[] args) {
        LongestSubstring l = new LongestSubstring(); 
        String str = "abcdefa";
        System.out.println(l.LenghtofLongestSubString(str));
    }
}
