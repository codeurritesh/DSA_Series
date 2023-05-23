package Stack;

import java.util.Stack;

public class Largest_Rectangle_In_Histogram {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 6, 1, 7};
        System.out.println(find(arr));
    }

    public static int find(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        stack.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) { //when left and right is found in stack
                int right = i;
                int s = arr[stack.pop()];
                if (stack.isEmpty()) {// use when last elements are left i the stack
                    answer = Math.max(answer, s * right);
                } else {
                    int left = stack.peek();
                    int area = s * (right - left - 1);
                    answer = Math.max(area, answer);
                }
            }
            stack.push(i);
        }
        return answer;
    }
}
