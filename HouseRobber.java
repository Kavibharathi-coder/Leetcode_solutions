package leetcode;

import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        int loot[] = {2,7,9,3,1};
        int[] total = new int[loot.length];

        total[0] = loot[0];
        total[1] = Math.max(loot[0], loot[1]);

        for(int i = 2; i < loot.length; i++){
            total[i] = Math.max(total[i - 2] + loot[i], total[i - 1]);
        }
        System.out.println(total[loot.length - 1]);
    }

}