import java.lang.reflect.Array;
import java.util.ArrayList;

public class Leaders {
    public static ArrayList<Integer> printLeaders(int[] a, int n){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            boolean leader = true;

            for(int j = i+1; j < n; j++){
                if(a[j] > a[i]){
                    leader = false;
                    break;
                }
            }
            if(leader){
                ans.add(a[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {1,2,8,4,5};
        int n = a.length;

        ArrayList<Integer> ans = printLeaders(a,n);

        for(int i = 0; i < ans.size(); i++){
            System.out.println(ans.get(i) + " ");
        }
    }
}
