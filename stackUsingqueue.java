import java.util.*;
public class stackUsingqueue {
    Queue <Integer> q1;
    Queue <Integer> q2;

    public stackUsingqueue(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int val){
        q2.add(val);
        
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

        Queue <Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public void pop(){
        System.out.print(q1.remove());
    }

    public static void main(String[] args) {
        stackUsingqueue s = new stackUsingqueue();
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.pop();
    }
}
