import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,6,4,5,3};
        int n = arr.length;

        Arrays.sort(arr);

        System.out.println("Array after sorting : ");

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nFirst Largest Number: " + arr[n-1]);
        System.out.println("Second Largest Number: " + arr[n-2]);
    }
}
