package leetcode;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralMatrix(arr));
    }

    static ArrayList<Integer> spiralMatrix (int[][] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int rowBegin = 0;
        int rowEnd = arr.length - 1;
        int colBegin = 0;
        int colEnd = arr[0].length - 1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){

            //Travers right
            for(int i = colBegin; i <= colEnd; i++){
                result.add(arr[rowBegin][i]);

            }
            rowBegin++;

            //Travers down
            for(int i = rowBegin; i <= rowEnd; i++){
                result.add(arr[i][colEnd]);
            }
            colEnd--;

            //Traverse left
            for (int i = colEnd; i >= colBegin; i--) {
                result.add(arr[rowEnd][i]);
            }
            rowEnd--;

            //Traverse up
            for(int i = rowEnd; i >= rowBegin; i--){
                result.add(arr[i][colBegin]);
            }
            colBegin++;
        }
        return result;
    }
}
