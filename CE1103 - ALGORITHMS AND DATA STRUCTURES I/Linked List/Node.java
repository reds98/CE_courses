public class Node{
     private int data ;    
     private Node next;

    public  Node(Node next_in, int data_in) {
        data=data_in;
        this.next=next_in;   
    }
    public int get_data(){
        return this.data;
    }
    public Node get_next(){
        return this.next;
    }
    public  void set_next(Node Node_in){
        this.next=Node_in;
    }

}