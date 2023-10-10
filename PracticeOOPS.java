package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeOOPS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter amount ");
//        int amount = in.nextInt();
//        coinChange(amount);
//        System.out.println(palindromeNumber(amount));
        int[] arr = {7, 8, 9, 1, 5, 2, 10, 39, 485, 23, 39};
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {
        int max = 0;
        int secondMax = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax;
    }

    public static void coinChange(int amount){
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200, 500};
        int change = 0;

        for(int i = coins.length-1; i >= 0 && amount != 0; i--){
            while(coins[i] <= amount && amount != 0){
                amount -= coins[i];
                change++;
            }
        }
        System.out.println(change);
    }
    public static boolean palindromeNumber(int num){
        int temp = num;
        int ans = 0;

        while(num > 0){
            int rem = num % 10;
            ans = ans * 10 + rem;
            num /= 10;
        }
        return (temp == ans);
    }
}


