import java.util.ArrayDeque;
import java.util.Stack;

public class QueueY {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty(){
        return s1.isEmpty();
    }

    public static void add(int data){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(data);

        while (!s2.isEmpty()){
            s2.push(s1.pop());
        }
    }

    public static int remove(){
        if (isEmpty()){
            System.out.println("empty queue");
            return  -1;
        }
         return s1.pop();
    }

    public static int peek(){
        if (isEmpty()){
            System.out.println("empty queue");
            return  -1;
        }
        return s1.peek();
    }


    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{

        static Node head = null;
        static Node tail = null;


        public static boolean isEmpty(){

            return head == null & tail == null;
        }


        //add or enqueue
        public static void add(int data){
            Node newNode = new Node(data);

            if (tail == null){
                tail = head = newNode;
                return;
            }

            tail.next =newNode;
            tail = newNode;
        }

        //dequeue
        public static int remove(){
            if (isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int front = head.data;
            if (head == tail){
                tail = null;
            }
            head = head.next;

            return front;
        }

        //peak
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {

        Queue q = new Queue();
//        Queue<Integer> queue = new LinkedLst<>();
//        Queue<Integer> queue = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
