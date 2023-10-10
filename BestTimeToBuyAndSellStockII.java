package leetcode;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int profit = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] < arr[i]){
                profit += arr[i] - arr[i - 1];
            }
        }
        System.out.println(profit);
    }
}
