import java.util.HashMap;
import java.util.Map;

public class countFreqChar {
    public static Map<Character, Integer> CountFreqChar(String str){
        Map<Character,Integer> map = new HashMap<>(); 
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return map ;
    }
    public static void main(String[] args) {
        String str = "Ritu Raj Verma";
        System.out.println(CountFreqChar(str));
    }
}
