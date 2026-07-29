package LinkedList;

public class LinkedList {
    Node head ;  //By default, it is null

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode ;
            return;
        }
        newNode.next = head ;
        head = newNode ;
    }

    public void insert(int data){
        Node newNode = new Node(data);   //Just created a new node

        if(head == null){
            head = newNode ;
            return;
        }
        Node temp = head ;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void display(){
        if(head == null) {
            System.out.println("List is empty...");
            return;
        }
            Node temp = head ;
        while (temp != null){
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
        System.out.print("null");

    }

    public void search(int data){
        if(head == null){
            System.out.println("List is empty , element not found");
            return ;
        }
        Node temp = head ;
        while(temp != null){
            if(temp.data == data){
                System.out.println("Element found in the list");
                return ;
            }
            temp = temp.next ;
        }
        System.out.println("Element not found in the list..");
    }


    public void delete(int data){
        if(head == null){
            System.out.println("List is empty");
            return ;
        }
        if(head.data == data){
            head = head.next;
            return ;
        }
        Node temp = head ;
        while(temp != null && temp.next.data != data){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Element not found");
            return;
        }
        temp.next = temp.next.next;
    }


    public void size(){
        int count = 0 ;
        Node temp = head ;
        while(temp != null){
            count++;
            temp = temp.next ;
        }
        System.out.println("Toatal no. of nodes: " + count);
    }



    public void insertAtPosition(int position , int data){
        if(position <= 0){
            System.out.println("invalid position");
            return ;
        }

        if(position == 1){
            insertAtBeginning(data);  //inserting at first position
            return;
        }

        Node newNode = new Node(data);
        Node temp = head ;

        for (int i = 1; i < position - 1 ; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next= newNode;
    }



    public void deleteAtPosition(int position){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(position == 1){
            head = head.next;
            return ;
        }

        Node temp = head ;

    }

}
