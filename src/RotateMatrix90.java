public class RotateMatrix90 {
    public static void rightRotate(int matrix[][], int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            int low = 0;
            int high = n-1;

            while(low < high){
                int temp = matrix[i][low];
                matrix[i][low] = matrix[high][i];
                matrix[high][i] = temp;
                low++;
                high--;
            }
        }
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " " +"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original Matrix\n");


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " " + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatrix after 90 degree right rotation\n");
        rightRotate(matrix, 3);
    }
}
