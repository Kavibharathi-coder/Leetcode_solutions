package leetcode;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(palindrome(s));
    }
    static String palindrome(String s){
        if(s.length() <= 1) return s;
        String ans = "";

        for(int i = 1; i < s.length(); i++){
            int left = i;
            int right = i;

            while(s.charAt(left) == s.charAt(right)){
                left--;                                         //cbbd
                right++;

                if(left == -1 || right == s.length()){
                    break;
                }
            }
            String palindrome = s.substring(left + 1, right);
            if(palindrome.length() > ans.length()){
                ans = palindrome;
            }

             left = i - 1;
             right = i;

             while(s.charAt(left) < s.charAt(right)){
                 left--;
                 right++;

                 if(left == -1 || right == s.length()){
                     break;
                 }
             }
             palindrome = s.substring(left + 1, right);
             if(palindrome.length() > ans.length()){
                 ans = palindrome;
             }
        }
        return ans;
    }
}
