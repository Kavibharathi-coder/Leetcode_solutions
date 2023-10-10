package leetcode;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0,0,2,1,2,0};
        int left = 0;
        int right = arr.length - 1;
        int index = 0;

        while(index <= right){
            if(arr[index] == 0){
                arr[index] = arr[left];
                arr[left] = 0;
                left++;
                index++;
            }
            else if(arr[index] == 2){
                arr[index] = arr[right];
                arr[right] = 2;
                right--;
            }
            else{
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
