package leetcode;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        int index1 = -1;
        int index2 = -1;

        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                index1 = i;
                break;
            }
        }

        if(index1 == -1){
            reverse(nums, 0);
        }
        else{
            for(int i = nums.length - 1; i >= 0; i--){
                if(nums[i] > nums[index1]){
                    index2 = i;
                    break;
                }
            }
            swap(nums, index1, index2);
            reverse(nums, index1 + 1);
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    static void reverse(int[] nums, int start){
        int left = start;
        int right = nums.length -1 ;

        while(left < right){
            swap(nums, left++, right--);
        }
    }
}
