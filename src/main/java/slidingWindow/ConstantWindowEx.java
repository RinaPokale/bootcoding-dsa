package slidingWindow;

public class ConstantWindowEx {
    public static int maxSum(int[] arr, int k){ // optimal approach
        int l = 0, r = k-1;
        int sum = 0, maxSum = 0;
        int n = arr.length;

        for(int i = l; i <= r; i++){
            sum += arr[i];
        }

        while (r < n-1){
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        int k = 4;
        System.out.println(maxSum(arr, k));
    }
}
