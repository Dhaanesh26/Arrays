public class LeftRotate {
    public static void Reverse(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void RotateLeft(int[] arr, int n, int k){
        Reverse(arr, 0, k-1);
        Reverse(arr, k-1, n-1);
        Reverse(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int k = 3;

        RotateLeft(arr, n, k);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
