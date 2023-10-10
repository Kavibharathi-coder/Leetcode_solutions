package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        mergerIntervals(intervals);
    }
    static void mergerIntervals(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        result.add(current);

        for(int[] next : intervals){
            if(current[1] > next[0]) current[1] = (current[1] > next[1]) ? current[1] : next[1];
            else{
                current = next;
                result.add(current);
            }
        }

        printlist(result);
    }

    private static void printlist(List<int[]> result) {
        for(int[] arr : result){
            System.out.print(Arrays.toString(arr) + " ");
        }
    }
}
