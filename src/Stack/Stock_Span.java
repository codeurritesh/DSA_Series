package Stack;

import java.util.Stack;

public class Stock_Span {
    public static void main(String[] args) {
        int arr[]={110,1,2,99,11,13,15,38,42,37};
        int spanarray[]=findspan(arr);
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
        System.out.println("\n-------------------------------------");
        for (int ele:spanarray) {
            System.out.print(ele+" ");
        }

    }
    public static int[] findspan(int arr[]){
        int allspan[]=new int[arr.length];
        Stack<Integer>stack=new Stack<>();
        stack.push(0);
        allspan[0]=1;
        for (int i = 1; i < arr.length ; i++) {
            while(!stack.isEmpty()){
                if(arr[stack.peek()]<=arr[i]){
                    allspan[i]=allspan[stack.peek()]+1;
                    stack.pop();
                }else{
                    allspan[i]=1;
                    stack.pop();

                }

            }
            stack.push(i);
        }
        return allspan;
    }
}
