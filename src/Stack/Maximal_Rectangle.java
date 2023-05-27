package Stack;

import java.util.Stack;

public class Maximal_Rectangle {
    public static void main(String[] args) {
        int arr[][]={{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        int histo[]=new int[arr[0].length];
        int area=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            if (i == arr.length - 1) {
                for (int j = 0; j < arr[0].length; j++) {
                    histo[j] = arr[i][j];
                }
            } else {
                for (int j = 0; j < arr[0].length; j++) {
                    if(arr[i][j]==0){
                        histo[j]=0;
                    }else{
                    histo[j] += arr[i][j];
                }
                }
                area=Math.max(area,find(histo));
//                System.out.println(area);
//                System.out.println("---------------------");
//                for (int j = 0; j < histo.length; j++) {
//                    System.out.println(histo[j]);
//                }
            }
        }
        System.out.println(area);
    }
    public static int find(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int maxarea = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int h = arr[st.pop()];
                int r = i;
                if (st.isEmpty()) {
                    maxarea = Math.max(maxarea, h * r);

                } else {
                    int l = st.peek();
                    maxarea = Math.max(maxarea, h * (r - l - 1));
                }
            }
            st.push(i);

        }
        int r =arr.length;

        while (!st.isEmpty()) {
            int h = arr[st.pop()];

            if (st.isEmpty()) {
                maxarea = Math.max(maxarea, h * r);

            } else {
                int l = st.peek();
                maxarea = Math.max(maxarea, h * (r - l - 1));
            }
        }
        return maxarea;
    }
}
