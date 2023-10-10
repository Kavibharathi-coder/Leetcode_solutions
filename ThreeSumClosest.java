package leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int target = 1;
        int[] arr = {-1,2,1,-4};
        System.out.println(threeSumClosest(arr, target));
    }
    static int threeSumClosest(int[] arr, int target){
        Arrays.sort(arr);
        int minDif = Integer.MAX_VALUE;
        int ans = arr[0] + arr[1] + arr[2];
        for (int i = 0; i < arr.length - 2; i++) {
            if(i > 0 && arr[i] == arr[i - 1]) continue;
            int left = i + 1;
            int right = arr.length - 1;
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == target){
                    return sum;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    right--;
                }
                int dif = Math.abs(sum - target);
                if(minDif > dif){
                    minDif = dif;
                    ans = sum;
                }
            }
        }
        return ans;
    }

}
