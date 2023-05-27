package Stack;

import java.util.Stack;

public class Number_of_Valid_Subarray {
    public static void main(String[] args) {
        int arr[] = {3, 2, 11, 4, 5, 7};
        System.out.println(find(arr));
    }

    public static int find(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
                while(!stack.isEmpty() && arr[i]<arr[stack.peek()]){
                    count+=i-stack.pop();
                }
                stack.push(i);
        }
        while (!stack.isEmpty()){
            count+=arr.length-stack.pop();
        }

    return count;
}
}
