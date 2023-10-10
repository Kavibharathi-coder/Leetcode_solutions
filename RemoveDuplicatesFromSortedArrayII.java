package leetcode;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};

        int index = 2;

        for(int i = 2; i < arr.length; i++){
            if(arr[index - 2] != arr[i]){
                arr[index++] = arr[i];
            }
        }
        System.out.println(index);
    }
}
