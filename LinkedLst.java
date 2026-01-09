import java.util.List;

class LinkedLst {


    Node head;
    private int size;

    LinkedLst(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next;

        Node (int  data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add - first, last
    public  void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode =currNode.next;
        }

        currNode.next = newNode;
    }

    //print

    public void printlist() {
        if (head == null){
            System.out.print("List is Empty");
            return;
        }

        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode =currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deleteFirst(){
        //corner case 1'St
        if (head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head =head.next;
    }

    //delete last

    public void deleteLast(){
        //corner case 1'st
        if (head == null){
            System.out.println("The list is empty");
            return;
        }

        size--;

        if (head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;

    }

    public int getSize(){
        return size;
    }

    public void reverseIterate(){

        if (head == null || head.next == null ){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null){
             Node nextNode = currNode.next;
             currNode.next = prevNode;

             //update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;

    }


    public Node reverseRecursive(Node head){

        if (head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }


    public static void main(String[] args) {

        LinkedLst list = new LinkedLst();
//        list.addFirst("a");
//        list.addFirst("is");
//        list.printlist();
//
//        list.addLast("List");
//        list.printlist();
//
//        list.addFirst("This");
//        list.printlist();
//
//        list.deleteFirst();
//        list.printlist();
//
//        list.deleteLast();
//        list.printlist();


        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printlist();
        System.out.println(list.getSize());

//        list.reverseIterate();
       list.head = list.reverseRecursive(list.head);
        list.printlist();
    }
}
