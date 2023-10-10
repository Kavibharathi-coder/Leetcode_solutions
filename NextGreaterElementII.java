package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        Stack<Integer> stack = new Stack();
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);

        for(int i = 0; i < nums.length * 2; i++){

            while(!stack.isEmpty() && nums[stack.peek()] < nums[i % nums.length]){
                ans[stack.pop()] = nums[i % nums.length];
            }
            if(i < nums.length) stack.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
