package Stack;

import java.util.Stack;

public class Number_of_Valid_Subarray {
    public static void main(String[] args) {
        int arr[]={3,2,11,4,5,7};
        System.out.println(find(arr));
    }
    public static int find(int arr[]){
        Stack<Integer>stack=new Stack<>();
        stack.push(0);
        int count=1;
        for (int i = 1; i <arr.length ; i++) {
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            stack.push(i);
            count+=stack.size();
            System.out.println(count);
        }
        return count;
    }

}
