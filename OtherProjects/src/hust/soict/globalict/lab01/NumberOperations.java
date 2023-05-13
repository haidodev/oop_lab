package hust.soict.globalict.lab01;
import java.util.Scanner;
public class NumberOperations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = console.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = console.nextDouble();
        System.out.println("Sum " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Difference " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Product " + num1 + " * " + num2 + " = " + (num1 * num2));
        if (num2 == 0){
            System.out.println("Since the second number is 0, cannot divide.");
        } else {
            System.out.println("Quotient " + num1 + " / " + num2 + " = " + (num1 / num2));

        }

    }
    
    

}
