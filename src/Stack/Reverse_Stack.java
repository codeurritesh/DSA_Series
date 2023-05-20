package Stack;

import java.util.Stack;

public class Reverse_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);
        System.out.println("-------------------------------");
        reverse(stack);
        System.out.println(stack);
    }
    public static void insertEnd(Stack<Integer> stack,int item){
        if(stack.isEmpty()){
            stack.push(item);
            return;
        }
        int val=stack.pop();
        insertEnd(stack, item);
        stack.push(val);
    }
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int item=stack.pop();
        reverse(stack);
        insertEnd(stack,item);
    }
}
