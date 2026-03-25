public class stackArray {
    int [] stack;
    int top;
    int size;
    
    stackArray(int n){
        stack = new int[n];
        top = -1;
        size = n;
    }

    public void push(int val){
        if(top == size-1){
            System.out.println("stack is full.");
            return;
        }
        top++;
        stack[top] = val;
    }

    public void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        top--;
        
    }

    public void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(stack[top]);
    }

    public void display(){
        if(top == -1){
            System.out.println("Stack is empty.");
            return;
        }
        
        for(int i = top; i>=0; i--){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        stackArray s = new stackArray(5);
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.push(10);
        s.pop();
        s.peek();
        s.display();
    }
    
}
