package leetcode;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,0,1,2};
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(mid > 0 && arr[mid] < arr[mid - 1]){
                System.out.println(arr[mid]);
                return;
            }
            else if(arr[left] <= arr[mid] && arr[right] < arr[mid]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        System.out.println(arr[left]);
    }
}
