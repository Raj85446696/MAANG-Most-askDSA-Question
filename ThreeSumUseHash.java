import java.util.* ; 
public class ThreeSumUseHash {
    public static List<List<Integer>> ThreeSum(int []arr){
        Set<List<Integer>> result = new HashSet<>() ; 
        int n = arr.length ; 
        for(int i =0 ; i<n ; i++){
            Set <Integer> seen = new HashSet<>() ; 

            for(int j = i+1 ; j<n ; j++){
                int complement = -(arr[i]+arr[j]);

                if(seen.contains(complement)){
                    List<Integer> triplet = Arrays.asList(arr[i],arr[j],complement);
                    Collections.sort(triplet);
                    result.add(triplet);
                    
                }seen.add(arr[j]);
            }
        }return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        int [] arr = {1,0,-1,-2,1};
        System.out.println(ThreeSum(arr));
    }
}
