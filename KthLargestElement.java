package leetcode;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 3;
        int ans = KthLargest(arr, k);
        System.out.println(ans);
    }
    static int KthLargest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr){
            pq.add(i);
            if(pq.size() > k){
                pq.remove();
            }
        }
        return pq.poll();
    }

    static int KthLargest2(int[] arr, int k){
        int index = 0;
        int max = 0;
        while(k > 0){
             max = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                    index = i;
                }
            }
            arr[index] = - 1;
            k -= 1;
        }
        return max;
    }

}
