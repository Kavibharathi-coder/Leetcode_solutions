package leetcode;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 6;
        System.out.println(search(matrix, target));
    }

    public static boolean search(int[][] matrix, int target){
        int row = searchRow(matrix, target);
        if(row == -1) return false;

        int left = 0;
        int right = matrix[0].length -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(matrix[row][mid] == target){
                return true;
            }
            else if(matrix[row][mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;


    }

    public static int searchRow (int[][] matrix, int target){
        int left = 0;
        int right = matrix.length - 1;
        int col = matrix[0].length - 1;

        while(left <= right){
            int mid = left + (right - left)  / 2;

            if(matrix[mid][0] <= target && matrix[mid][col] >= target){
                return mid;
            }
            else if(matrix[mid][0] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
