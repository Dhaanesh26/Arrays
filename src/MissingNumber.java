public class MissingNumber {
    public static int missingNumber(int[] a, int n){
        for(int i = 1; i <= n; i++){
            int flag = 0;
            for(int j = 0; j < n-1; j++){
                if(a[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,5};
        int n = a.length;

        System.out.println(missingNumber(a, n));

        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
