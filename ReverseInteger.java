package leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        var x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x){
        var ans = 0;

        while(x != 0){
            if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
                return 0;
            }
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return ans;
    }
}
