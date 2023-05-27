package Stack;

import java.util.Stack;

public class Celebrity_Problem {
    public static void main(String[] args) {
        int arr[][]={{0,0,1,1},
                     {0,0,1,1},
                     {0,0,1,1},
                     {0,0,0,0}
        };
        System.out.println(Check_Celebrity(arr));
    }
    public static int Check_Celebrity(int arr[][]){
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i <arr.length ; i++) {
            stack.push(i);
        }
        while(stack.size()>=2){
            int i=stack.pop();
            int j=stack.pop();
            if(arr[i][j]==1){
                stack.push(j);
            }else if(arr[i][j]==0){
                stack.push(i);
            }
        }
        boolean allset=true;
        int cancelebrity=stack.pop();
        for (int i = 0; i <arr.length ; i++) {
            if(arr[cancelebrity][i]==1){
                allset=false;
                break;
            }
        }
        if(allset==false){
            return -1;
        }else{
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i][cancelebrity]==0 && i!=cancelebrity){
                    allset=false;
                    break;
                }
            }
        }

        return allset ? cancelebrity:-1;

//        return 0;
    }
}
