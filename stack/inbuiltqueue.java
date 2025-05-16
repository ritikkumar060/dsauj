package stack;
import java.util.*;
public class inbuiltqueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());




        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(2);
        deque.addLast(5);
        deque.addFirst(6);
        deque.removeFirst();
        
    }
    
}
