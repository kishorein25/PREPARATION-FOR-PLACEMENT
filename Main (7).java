class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Queue{
    Node front;
    Node rear;
    void enqueue(int data){
        Node newNode=new Node(data);
        if(front == null){
            front = rear = newNode;
        }
        
        rear.next = newNode;
        rear = newNode;
        System.out.print(rear.data+" ");
        System.out.println();
    }
    
    void dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
        }
        
        System.out.println("removed "+front.data+" ");
        front= front.next;
    }
    
    void isempty(){
        System.out.println();
        System.out.println(front==null);
    }
    
    void peek(){
        if(front==null){
            System.out.println("Queue is empty");
        }
        System.out.println();
        System.out.println(front.data +" ");
    }
    
    void size(){
        int count =0;
        while(front !=  null){
            count++;
            front = front.next;
        }
        System.out.println(count+" ");
    }
}

class Main{
    public static void main(String[] args){
        Queue st=new Queue();
        st.enqueue(10);
        st.enqueue(20);
        st.enqueue(30);
        st.enqueue(40);
        st.isempty();
        st.peek();
        st.size();
        
        
        
    }
}