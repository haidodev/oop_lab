package hust.soict.globalict.test;

import java.util.Scanner;

public class InteractiveCLI {
    public String read2(){
        System.out.print("Enter: ");
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
        scanner.close();

        return res;
    }
    public String read1(){
        System.out.print("Enter: ");
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
        scanner.close();
        return res + read2();
    }
    public static void main(String[] args) {
        InteractiveCLI cli = new InteractiveCLI();
        System.out.println("Text is \"" +  cli.read1() + "\"");
    }
}
