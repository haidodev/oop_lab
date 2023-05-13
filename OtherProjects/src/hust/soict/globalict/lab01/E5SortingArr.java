package hust.soict.globalict.lab01;
import java.util.Arrays;
import java.util.Random;

public class E5SortingArr {
    public static int[] randomIntegers(int n){
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i){
            arr[i] = Math.abs(random.nextInt()) % 100;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = E5SortingArr.randomIntegers(10);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int arrSum = 0;
        for (int num : arr) arrSum += num;
        System.out.println("Sum: " + arrSum);
        System.out.println("Average: " + arrSum * 1d / arr.length);

    }
}
