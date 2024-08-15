public class MajorityElement {
    public static int majority(int[] a){
        int n = a.length;

        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(a[j] == a[i]){
                    count++;
                }
            }
            if(count > (n/2)){
                return a[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,3,4,5};
        int n = arr.length;

        System.out.println(majority(arr));
    }
}
