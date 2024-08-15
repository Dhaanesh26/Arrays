public class MaximumSubarray {
    public static int maxSubarray(int[] arr, int n){
        int max = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum = sum + arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;

        System.out.println(maxSubarray(arr, n));
    }
}
