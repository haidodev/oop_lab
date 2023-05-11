import java.util.Arrays;
import java.util.Random;

public class E6Matrix {
    public static int[][] randomMatrix(int m, int n){
        Random random = new Random();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; ++i){
            for (int j = 0; j < n; ++j){
                arr[i][j] = Math.abs(random.nextInt()) % 100;
            }        
        }
        return arr;
    }
    public static int[][] sumMatrix(int[][] arr1, int[][] arr2){
        if (arr1.length != arr2.length || arr1[0].length != arr2[0].length) return null;
        int m = arr1.length, n = arr1[0].length;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; ++i){
            for (int j = 0; j < n; ++j){
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }        
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr1 = E6Matrix.randomMatrix(3, 3);
        System.out.println("MATRIX 1");
        for (int i = 0; i < arr1.length; ++i){
            System.out.println(Arrays.toString(arr1[i]));
        }
        int[][] arr2 = E6Matrix.randomMatrix(3, 3);
        System.out.println("MATRIX 2");
        for (int i = 0; i < arr2.length; ++i){
            System.out.println(Arrays.toString(arr2[i]));
        }
        int[][] arr3 = E6Matrix.sumMatrix(arr1, arr2);
        if (arr2 != null){
            System.out.println("MATRIX SUM");
            for (int i = 0; i < arr3.length; ++i){
                System.out.println(Arrays.toString(arr3[i]));
            }
        }
        

    }

}
