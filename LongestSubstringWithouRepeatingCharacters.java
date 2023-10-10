package leetcode;

import java.util.HashSet;

public class LongestSubstringWithouRepeatingCharacters {
    public static void main(String[] args) {
        String s = "bbbbb";
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int len = 0;

        while(right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right++));
                len = Math.max(len, set.size());
            }
            else{
                set.remove(s.charAt(left++));
            }
        }
        System.out.println(len);
    }
}
