package leetcode;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class GroupAnagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String word1 = in.nextLine();
//        String word2 = in.nextLine();
//        System.out.println(isAnagram(word1, word2));
        String[] str = {"ate", "eat", "tan", "nat", "cat"};
        System.out.println(groupAnagram(str));
    }

    public static List<List<String>> groupAnagram(String[] str){
        if(str.length == 0){
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for(String word : str){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sortedWord = new String(arr);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static boolean isAnagram(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            arr[word1.charAt(i) - 'a']++;
            arr[word2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static List<List<String>> solution2(String arr[]){
        Map<String, List<String>> map = new HashMap<>();
        if(arr.length == 0 || arr == null){
            return new ArrayList<>();
        }

        for(int i = 0; i < arr.length; i++){
            String freq = getFrequency(arr[i]);

            if(map.containsKey(freq)){
                map.get(freq).add(arr[i]);
            }
            else{
                List<String> list = new ArrayList();
                list.add(arr[i]);
                map.put(freq, list);
            }

        }
        return new ArrayList(map.values());
    }

    public static String getFrequency(String s){
        int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }
        StringBuilder ans = new StringBuilder();
        char ch = 'a';
        for(int i : arr){
            ans.append(ch);
            ans.append(i);
            ch++;
        }
        return ans.toString();
    }
}