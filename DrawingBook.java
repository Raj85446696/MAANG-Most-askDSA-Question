public class DrawingBook {
    public static int pageCount(int n, int p) {
        int front = p/2 ; 
        int back = (n/2)-(p/2);
        return Math.min(front,back);
        }
        public static void main(String[] args) {
            System.out.println(pageCount(5,4));
        }
}
