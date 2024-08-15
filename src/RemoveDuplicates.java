public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5};
        int n = arr.length;

        int k = removeDuplicates(arr,n);
        for(int i = 0; i < k; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int removeDuplicates(int[] arr, int n){
        int i = 0;
        for(int j = 1; j < n; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
