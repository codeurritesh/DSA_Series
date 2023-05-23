package Stack;

import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        int arr[]={11,2,3,23,9,13,14,15};
        int ans[]=next(arr);
        System.out.println("---------------ARRAY------------------");
        for (int ele:arr) {

            System.out.print(ele+" ");
        }
        System.out.println("\n--------------ANSWER----------------");
        for (int ele:ans) {

            System.out.print(ele+" ");
        }
    }
    public static int[] next(int arr[]){
        int answer[]=new int[arr.length];
        Stack <Integer> stack=new Stack<>();
              stack.push(0);
        for (int i = 1; i <arr.length ; i++) {
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                System.out.println(arr[stack.peek()]+"--->"+arr[i]);
                answer[stack.peek()]=arr[i];
                stack.pop();
            }
            stack.push(i);

        }
        while(!stack.isEmpty()){
            System.out.println(arr[stack.peek()]+"--->"+ -1);
            answer[stack.peek()]=-1;
            stack.pop();
        }
        return answer;
    }
}
