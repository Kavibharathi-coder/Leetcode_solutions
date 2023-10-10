package leetcode;

public class HouseRobberII {
    public static void main(String[] args) {
        int[] loot = {1,2,3,1};
        int[] loot1 = new int[loot.length - 1];
        int[] loot2 = new int[loot.length - 1];

        for(int i = 0; i < loot.length - 1; i++){
            loot1[i] = loot[i];
            loot2[i] = loot[i + 1];
        }

        int total1 = robber(loot1);
        int total2 = robber(loot2);
        System.out.println(Math.max(total1, total2));

    }

    static int robber(int[] loot){
        int[] total = new int[loot.length];
        total[0] = loot[0];
        total[1] = Math.max(loot[0], loot[1]);

        for(int i = 2; i < loot.length; i++){
            total[i] = Math.max(total[i - 2] + loot[i], total[i - 1]);
        }
        return total[loot.length - 1];
    }
}
