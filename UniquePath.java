class UniquePath{
    public static int uniquePath(int row,int col){
        int []dp = new int[col];
        for(int i = 0 ; i<col ; i++){
            dp[i] = 1 ; 
        }
        for(int i = 1 ; i<row ; i++){
            for(int j = 1 ; j<col ; j++){
                dp[j]+=dp[j-1];
            }
        }return dp[col-1];
    }
    public static void main(String[] args) {
        System.out.println(uniquePath(2, 2));
    }
}