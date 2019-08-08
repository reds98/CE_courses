public class Main{ 
    public static void main(String[] args) {
    LinkedList List=new LinkedList();
    List.append(3);
    List.append(2);
    List.append(999);
   // List.Insertar(1);
    System.out.println("The value of the end of the list is "+ List.giveTheLastNode().get_data());
 }
}