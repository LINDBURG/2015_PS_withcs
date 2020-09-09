import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            if (n == -1) {
                if (!queue.empty()) queue.dequeue();
            } else {
                queue.enqueue(n);
            }
        }
        while (!queue.empty())
            System.out.println(queue.dequeue());
    }
}
 
class Queue {
 
    private class Node{
 
        private int  data;
        private Node nextNode;
 
        Node(int data){
            this.data = data;
            this.nextNode = null;
        }
    }
 
    private Node front;
    private Node rear;
 
    public Queue(){
        this.front = null;
        this.rear = null;
    }
 
    public boolean empty(){
        return (front==null);
    }
 
    public void enqueue(int v){
 
        Node node = new Node(v);
        node.nextNode = null;
 
        if(empty()){
 
            rear = node;
            front = node;
 
        }else{
 
            rear.nextNode = node;
            rear = node;
 
        }
    }
 
    public int peek(){
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        return front.data;
    }
 
    public Object dequeue(){
 
        int v = peek();
        front = front.nextNode;
 
        if(front == null){
            rear = null;
        }
 
        return v;
    }
}