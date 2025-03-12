class climbingStairs{
    public static int climbStair(int n){
        if(n==1)return 1 ; 
        if(n==2)return 2 ; 
        int first = 1 , second = 2 ; 
        for(int i = 3 ; i<=n ; i++){
            int third = first +second ; 
            first = second ; 
            second = third ;
        }
        return second ; 
    }
    public static void main(String[] args) {
        System.out.println("Total no of ways :- "+climbStair(4));
    }
}