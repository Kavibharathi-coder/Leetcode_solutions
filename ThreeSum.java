package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr= {-1,0,1,2,-1,-4};
        System.out.println(threesum(arr));

    }
    static List<List<Integer>> threesum(int[] arr){
       List<List<Integer>> ans = new ArrayList<>();
       Arrays.sort(arr);
       for(int i = 0; i < arr.length - 2; i++){
           if(i > 0 && arr[i] == arr[i - 1]){
               continue;
           }
           int left = 0;
           int right = arr.length - 1;
           while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0){
                    ans.add(Arrays.asList(arr[i], arr[left++], arr[right--]));
                    while(left < right && arr[left] == arr[left - 1]){
                        left++;
                    }
                    while(left < right && arr[right] == arr[right + 1]){
                        right--;
                    }
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
           }
       }
       return ans;
    }
}
