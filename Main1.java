import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Stack{
    Node top;
    void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
        System.out.println(top.data + "Pushed");
    }
    
    void pop(){
        Node temp=top;
        if(temp == null){
            System.out.print("Stack is empty");
            return;
        }
        else{
            System.out.println(temp.data+" popped ");
            top = top.next;
        }
    }
    void isempty(){
        if(top == null){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    void peek(){
        Node temp = top;
        System.out.print(temp.data);
    }
    
    void sort(int arr[],int count){
        for(int i=0;i<count;i++){
            for(int j=i+1;j<count;j++){
                if(arr[i]>arr[j]){
                    int t = arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    
    void display(){
        Node temp = top;
        if(temp == null){
            System.out.println("Stack is empty");
            return;
        }
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
}

public class Main1{
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        
       Node temp = s.top;
       int count = 0;
       
       while(temp != null){
           count++;
           temp = temp.next;
           
       }
       int arr[] = new int[count];
       
       temp = s.top;
       
       for(int i = 0; i < count; i++){
           arr[i] = temp.data;
           temp = temp.next;
           
       }
       for(int i = 0; i < count; i++){
           System.out.print(arr[i] + " ");
       }
       System.out.println();
       
       
       s.sort(arr,count);
       
    }
}