class Solution{
    Node head1 ;
    Node head2 ;

    class Node{
        Node head ; 
        int data ; 
        Node next ; 
        Node(int data){
            this.data = data ; 
            this.next = null ; 
        }
    }

    public void CreateNode1(){
        Node first = new Node(2);
        Node second = new Node(4);
        Node third = new Node(8);
        Node fourth = new Node(10);

        head1 = first; 
        first.next = second ; 
        second.next = third ; 
        third.next = fourth ; 
    }

    public void CreateNode2(){
        Node first = new Node(1);
        Node second = new Node(3);
        Node third = new Node(3);
        Node fourth = new Node(6);
        Node fifth = new Node(11); 
        Node sixth = new Node(14);

        head2 = first; 
        first.next = second ; 
        second.next = third ; 
        third.next = fourth ; 
        fourth.next = fifth ; 
        fifth.next = sixth ; 

    }

    public void Traverse(Node head){
        if(head==null){
            System.out.println("Node not exit's");
        }else{
            Node temp = head ; 
            while(temp!=null){
                System.out.print(temp.next+" ");
                temp = temp.next ; 
            }
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        s.CreateNode1(); 
        s.CreateNode2(); 
    }
}