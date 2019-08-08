public class LinkedList{
     private Node Head;

    public LinkedList(){
    }

    public Node get_Head(){
        return this.Head;
    } 

    public void append(int data_in) {
        if(Head==null){
            Head =new Node(null, data_in);
        }
        else{
            Node last=this.giveTheLastNode();
            Node newNode=new Node(null, data_in);
            last.set_next(newNode);
        }   
    }

    public Node giveTheLastNode(){
        Node temp=Head;
        while(temp.get_next()!=null){
            temp=temp.get_next();
        }
        return temp;
    }
}