package leetcode;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        if(nums.length == 1) {
            System.out.println(0);
            return;
        }

        if(nums[0] > nums[1])
        {
            System.out.println(0);
            return;
        }
        if(nums[nums.length - 1] > nums[nums.length - 2]) {
            System.out.println(nums.length - 1);
            return;
        }

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + ( right - left ) / 2;

            if(nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                System.out.println(mid);
                return;
            }

            else if(nums[mid] < nums[mid + 1]) left = mid + 1;

            else right = mid - 1;
        }
        System.out.println(-1);
        return;
    }
}
