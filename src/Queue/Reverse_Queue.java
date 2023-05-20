package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(queue);
        System.out.println("===============================");
        reverse(queue);
        System.out.println(queue);
    }
    public static void reverse(Queue<Integer> queue){
        if(queue.isEmpty()){
            return;
        }
        int item=queue.poll();
        reverse(queue);
        queue.add(item);
    }
}
