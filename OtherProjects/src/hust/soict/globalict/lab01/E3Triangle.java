package hust.soict.globalict.lab01;
import java.util.Scanner;
public class E3Triangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = keyboard.nextInt();
        for (int i = 1; i <= n; ++i){
            for (int j = 0; j < n - i; ++j){
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * i - 1; ++j){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
