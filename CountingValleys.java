public class CountingValleys {
    public static int CountVally(String path){
        int altitude = 0 ; 
        int vally = 0 ; 
        for(Character ch :path.toCharArray()){
            int prevAltiude = altitude; 
            if(ch=='U'){
                altitude++;
            }else{
                altitude--; 
            }
            if(prevAltiude<0 && altitude==0){
                vally++; 
            }
        }return vally;
    }
    public static void main(String[] args) {
        System.out.println(CountVally("UDDDUDUU"));
    }
}
