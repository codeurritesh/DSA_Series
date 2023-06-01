package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Minimum_String_form_from_DI_String {
    public static void main(String[] args) {
        String str="DIDIIDDDD";
        String result= Arrays.toString(findvalidumber(str));

        System.out.println(result);
    }
    public static int[] findvalidumber(String str){
        int counter=1;
        Stack<Integer>stack=new Stack<>();
        int resultArray[]=new int[str.length()+1];
        for (int i = 0; i <=str.length() ; i++) {
            if(i==str.length()){
                resultArray[i]=counter++;
                while(!stack.isEmpty()){
                    resultArray[stack.pop()]=counter++;
                }
                break;
            }
            if(str.charAt(i)=='D'){
                stack.push(i);
                continue;
            }

            resultArray[i]=counter++;
            while (!stack.isEmpty()){
                int ind=stack.pop();
                resultArray[ind]=counter++;
            }
        }

        return resultArray;
    }
}
