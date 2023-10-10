package leetcode;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(maximumSubarray(arr));
    }
    static int maximumSubarray(int[] arr){
        int max = arr[0];
        int currentSum = 0;
        for(int i = 0; i < arr.length; i++){
            currentSum = Math.max(currentSum + arr[i], arr[i]);
            max = Math.max(max,currentSum);
        }
        return max;
    }
}
