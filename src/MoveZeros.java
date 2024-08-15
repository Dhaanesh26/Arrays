import java.util.ArrayList;

public class MoveZeros {
    public static int[] movezeros(int[] a, int n){
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(a[i] != 0){
                temp.add(a[i]);
            }
        }
        int nz = temp.size();

        for(int i = 0; i < nz; i++){
            a[i] = temp.get(i);
        }

        for(int i = nz; i < n; i++){
            a[i] = 0;
        }
        return a;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,0,0,5};
        int n = a.length;

        movezeros(a,n);

        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
