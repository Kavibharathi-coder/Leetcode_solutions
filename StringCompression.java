package leetcode;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c','b','b','b','b','b','b','b','b','b','b'};
        StringBuilder ans = new StringBuilder();
        int[] arr = new int[26];

        for(char ch : chars){
            arr[ch - 'a']++;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int index = 97 + i;
                char c = (char) index;
                ans.append(c);
                ans.append(arr[i]);
            }
        }
        String str = ans.toString();
        char[] ch = new char[str.length()];
        for(int i = 0; i < ch.length; i++){
            ch[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(ch));
    }
}
