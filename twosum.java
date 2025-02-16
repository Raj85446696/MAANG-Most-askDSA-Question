import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map ; 

class TwoSum{

    // First Method  Time complexity -> O(n^2)
    public ArrayList<Integer> TwoSum(int[] arr,int target){
        for(int i = 0 ; i<arr.length;i++){
            for(int j = i+1 ; j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new ArrayList<Integer>(Arrays.asList(i,j)); 
                }
            }
        }
            return new ArrayList<Integer>(Arrays.asList(-1,-1));
    }

    // second method using maping O(nlog(n))
    public ArrayList<Integer> TwoSum2(int[] arr , int target){
        Map<Integer,Integer> map = new HashMap<>(); 
        for(int i = 0 ; i<arr.length;i++){
            int com = target-arr[i]; 
            if(map.containsKey(com)){
                return new ArrayList<Integer>(Arrays.asList(map.get(com),i)); 
            }
            map.put(arr[i],i); 
        }return new ArrayList<Integer>(Arrays.asList(-1,-1)); 

    }
    public static void main(String[] args) {
        TwoSum t = new TwoSum(); 
        int [] arr = {2,6,5,8,11};
        System.out.println(t.TwoSum(arr, 19));
        System.out.println(t.TwoSum2(arr, 8));

    }
}