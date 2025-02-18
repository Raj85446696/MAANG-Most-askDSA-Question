class Java{
    public int ContainMostWater(int [] height){
        int left = 0 ; 
        int right = height.length-1 ; 
        int maxArea = 0 ; 
        while(left<right){
            int area = Math.min(height[left],height[right])*(right-left);
            maxArea = Math.max(area,maxArea); 

            if(height[left]<height[right]){
                left++; 
            }else{
                right-- ; 
            }
        }return maxArea; 
    }
    public static void main(String[] args) {
        Java j = new Java(); 
        int []height = {1,2,6,2,5,4,8,3,7}; 
        System.out.println("Max Area: "+j.ContainMostWater(height));
    }
}