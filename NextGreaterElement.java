package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {7,8,2,47,56,1};
        nextGreater(arr);
    }
    static void nextGreater(int[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length - 1]);

        for(int i = arr.length - 2; i >= 0; i--){
            int peek = stack.peek();
            if(arr[i] < peek){
                arr[i] = peek;
            }
            else{
                stack.pop();
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
