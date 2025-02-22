public class validParenthesis {
    public void ValidParenthesis(String par){
        int count = 0 ; 
        for(int i = 0 ; i<par.length();i++){
            if(par.charAt(i)=='(' || par.charAt(i)=='[' || par.charAt(i)=='{'){
                count++;
            }else if(par.charAt(i)==')' || par.charAt(i)==']' || par.charAt(i)=='}'){
                count--; 
            }
        }
        if(count==0){
            System.out.println("Valid");
        }else{
            System.out.println("inValid");
        }
    }
    public static void main(String[] args) {
        validParenthesis v = new validParenthesis(); 
        String par = "{[()]]}";
        v.ValidParenthesis(par);
        
    }
}
