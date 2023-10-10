package leetcode;

public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 0, 0, 1, 2};
        int target = 2;

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + ( right - left) / 2;

            if(arr[mid] == target){
                System.out.println(true);
                return;
            }
            else if(arr[mid] == arr[left] && arr[mid] == arr[right]){
                left++;
                right--;
                continue;
            }

            if(arr[left] <= arr[mid]){
                if(arr[left] <= target && arr[mid] > target){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if(arr[mid] < target && arr[right] >= target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        System.out.println(false);
    }
}
