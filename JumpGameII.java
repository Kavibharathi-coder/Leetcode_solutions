package leetcode;

import java.util.ArrayList;

public class JumpGameII {
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        int current = 0;
        int jumps = 0;
        int farthest= 0;

        for(int i = 0; i < nums.length - 1; i++){
            farthest = Math.max(farthest, i + nums[i]);

            if(i == current){
                current = farthest;
                jumps++;
            }
        }
        System.out.println(jumps);
    }
}
