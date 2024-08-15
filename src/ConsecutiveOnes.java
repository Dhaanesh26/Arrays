public class ConsecutiveOnes {
    public static int maxCount(int[] a, int n){
        int count = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            if(a[i] == 1) {
                count++;
            }else{
                count = 0;
            }
            max = Math.max(count, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int a[] = {1,1,1,1,2,3,5};
        int n = a.length;

        System.out.println("The maximum count of consecutive ones are : " + maxCount(a,n));
    }
}
