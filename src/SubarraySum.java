public class SubarraySum {
    public static int subArray(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;

                for (int K = i; K <= j; K++) {
                    sum = sum + arr[K];
                }
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;

        int count = subArray(arr, k);

        System.out.println(count);
    }
}
