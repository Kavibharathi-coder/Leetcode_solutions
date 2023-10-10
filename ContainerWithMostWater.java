
package leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7,5};
        System.out.println(solution(arr));
    }
    public static int solution(int arr[]){
        var left = 0;
        var right = arr.length - 1;
        var ans = 0;

        while(left < right){
            var height = Math.min(arr[left], arr[right]);
            var width = right - left;
            var area = height * width;
            ans = Math.max(area, ans);

            while(left < right && arr[left] <= height) left++;
            while(left < right && arr[right] <= height) right--;
        }
        return ans;
    }
}
