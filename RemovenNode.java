class SinglyLinkedList{
    int length ; 
    Node head ; 
    class Node{
        int data ; 
        Node next ; 
        Node(int data){
            this.data = data ; 
            this.next = null ; 
        }
    }

    public int Length(){
        return length ; 
    }

    public void CreateNode(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4); 
        Node fifth = new Node(5);

        head = first ;
         first.next = second ; 
         second.next = third ; 
         third.next = fourth ; 
         fourth.next = fifth ; 

    }


    public void Traverse(){
        if(head==null){
            System.out.println("Node not exits");
        }else{
            Node temp = head ; 
            while(temp!=null){
                System.out.print(temp.data+" --> ");
                temp = temp.next ; 
                length++; 
            }
            System.out.print("null");
        }
    }

    public void RemoveNnode(int pos){
        Node temp = head ; 
        for(int i = 1 ; i<length-pos ; i++){
            temp = temp.next ; 
        }
        Node temp2 = temp.next ; 
        temp.next = temp2.next ; 
    
    }
    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList(); 
        s.CreateNode(); 
        s.Traverse(); 
        System.out.println("");
        System.out.println(s.Length());
        s.RemoveNnode(3);
        s.Traverse();

    }
    
}
