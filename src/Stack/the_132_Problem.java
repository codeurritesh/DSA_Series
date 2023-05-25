package Stack;

import java.util.Stack;

public class the_132_Problem {
    public static void main(String[] args) {
        int arr[]={4,6,1,3,2};
        System.out.println(find132pattern(arr));
    }
    public static boolean find132pattern(int[] nums) {
        Stack<Integer>stack=new Stack<>();
        int lmin[]=new int[nums.length];
        lmin[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            lmin[i]=Math.min(nums[i],lmin[i-1]);
        }
//        stack.push(nums.length-1);
        for (int i = nums.length-1; i >=0 ; i--) {
            if(lmin[i]<nums[i]){
                while(!stack.isEmpty() && nums[stack.peek()]<=lmin[i]){
                    stack.pop();
                }
                if(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                    return true;
                }
            }
                stack.push(i);
        }
        return false;
    }
}
