import java.util.LinkedList;
import java.util.Queue;

public class Q3_Stack_Using_Queue {
      Queue<Integer> li;
    public MyStack() {
        li=new LinkedList<>();
    }
    
    public void push(int x) {
        li.add(x);
        for(int i=0;i<li.size()-1;i++){
            li.add(li.remove());
        }
    }
    
    public int pop() {
        int r=li.remove();
        return r;
    }
    
    public int top() {
        int p=li.peek();
        return p;
    }
    
    public boolean empty() {
        return li.isEmpty();
    }
}
