package leetcode;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 1;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr, int target){


        int left = 0;
        int right = arr.length -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target) return mid;

            else if(arr[mid] >= arr[left]) {

                if(arr[mid] >= target && arr[left] <= target){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }

            else{
                if(arr[mid] <= target && arr[right] >= target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

