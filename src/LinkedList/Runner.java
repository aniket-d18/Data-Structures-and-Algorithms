package LinkedList;

public class Runner {
    public static void main(String[] args) {
        //we can implement by this way also
//        LinkedList linkedList = new LinkedList();
//        linkedList.add(6) ;
//        linkedList.add(4 , 12) ;
//        linkedList.size();


        //This is only testing and running the program


        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        //list.display();
        list.deleteAtPosition(2);

        list.display();
    }
}
