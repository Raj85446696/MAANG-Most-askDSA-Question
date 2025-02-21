import java.util.* ; 
class ThreeSumUseBruteForce{
    public static List<List<Integer>> ThreeSums(int[] arr){
        List <List<Integer>> result = new ArrayList<>(); 
        int n = arr.length ; 
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n; j++){
                for(int k = j+1 ; k<n ; k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> triplet = Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(triplet);
                        if(!result.contains(triplet)){
                            result.add(triplet);
                        }


                    }
                }
            }
        }return result ; 
    }
    public static void main(String[] args) { 
        int [] arr = {1,0,-1,-2,1};
        System.out.println(ThreeSums(arr));

    }
}