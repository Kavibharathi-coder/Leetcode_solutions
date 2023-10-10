package leetcode;

public class IntegerToRoman {
    public static void main(String[] args) {
        var num = 3;
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder ans = new StringBuilder();

        for(int i = values.length - 1; i >= 0 && num > 0; i--){

            while(values[i] <= num){
                ans.append(roman[i]);
                num = num - values[i];
            }
        }
        System.out.println(ans);
    }
}
