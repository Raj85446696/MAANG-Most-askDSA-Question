import java.util.*; 

public class LonleyInteger {
    // First method TimeComplexity = O(n) , Space Complexity = O(n)
    public static int lonelyinteger(List<Integer> a) {
        Map<Integer,Integer> map = new HashMap<>(); 
        for(int val : a){
                map.put(val,map.getOrDefault(val,0)+1);
            }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }return -1 ;
        
        }

        // second method TimeComplexity = O(n) , Space Complexity = O(1)
        public static int LonelyInteger(int []arr){
            int result = 0 ; 
            for(int a : arr){
                result^=a;
            }return result; 
        }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        int[] arr = {1,2,3,4,3,2,1};
        for(int ele : arr){
            a.add(ele);
        }
        System.out.println(lonelyinteger(a));
        System.out.println(LonelyInteger(arr));
    }
}
