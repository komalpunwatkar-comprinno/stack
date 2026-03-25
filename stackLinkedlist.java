public class stackLinkedlist {

    class Node{
        int data;
        Node next;
        
        Node(int val){
            data = val;
            next = null;
        }
    }

    Node top = null;
    
    public void push(int val){
        Node newnode = new Node(val);
        if(top == null){
            top = newnode;
            return;
        }
        newnode.next = top;
        top = newnode;
        
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack is empty.");
            return;
        }
        top = top.next;
        
    }

    public void peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(top.data);
    }

    public void display(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        stackLinkedlist s = new stackLinkedlist();
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.pop();
        s.peek();
        s.display();
    }
    
}
