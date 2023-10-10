package leetcode;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {2,3,1,0,4};
        System.out.println(solution2(arr));
    }
    public static boolean solution1(int[] arr){
        int lastGood = arr.length - 1;

        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] + i >= lastGood) lastGood = i;
        }
        return (lastGood == 0);
    }

    public static boolean solution2(int[] arr){
        int reachable = 0;

        for(int i = 0; i < arr.length; i++){
            if(i > reachable) return false;

            reachable = Math.max(reachable, i + arr[i]);
        }
        return true;
    }

}
