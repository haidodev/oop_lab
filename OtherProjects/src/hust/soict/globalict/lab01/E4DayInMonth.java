package hust.soict.globalict.lab01;
import java.util.Scanner;

public class E4DayInMonth {
    public static boolean arrayContainsValue(String value, String[] arr){
        for (String s : arr){
            if (s.equals(value)) return true;
        }
        return false;
    }
    public static boolean leapYear(int year){
        if (year % 100 == 0){
            return year % 400 == 0;
        }
        return year % 4 == 0;

    }
    public static boolean validateYear(int year){
        return year > 1900 && year < 3000;
    }
    public static int dayInMonth(String month, int year){
        if (!E4DayInMonth.validateYear(year)) return -1;
        String[][] monthsWith31Days = {
            {"January", "Jan.", "Jan", "1"},
            {"March", "Mar.", "Mar", "3"},
            {"May", "May", "May", "5"},
            {"July", "Jul.", "Jul", "7"},
            {"August", "Aug.", "Aug", "8"},
            {"October", "Oct.", "Oct", "10"},
            {"December", "Dec.", "Dec", "12"}
        };
        String[][] monthsWith30Days = {
            {"April", "Apr.", "Apr", "4"},
            {"June", "Jun.", "Jun", "6"},
            {"September", "Sept.", "Sep", "9"},
            {"November", "Nov.", "Nov", "11"}
        };
        String[] February = {"February", "Feb.", "Feb", "2"};
        for (String[] month30 : monthsWith30Days){
            if (E4DayInMonth.arrayContainsValue(month, month30)) return 30;
        }
        for (String[] month31 : monthsWith31Days){
            if (E4DayInMonth.arrayContainsValue(month, month31)) return 31;
        }
        if (E4DayInMonth.arrayContainsValue(month, February)){
            if (E4DayInMonth.leapYear(year)) return 29;
            else return 28;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String month;
        int year, days = -1;
        do {
            System.out.print("Enter month: ");
            month = keyboard.nextLine();
            System.out.print("Enter year: ");
            year = keyboard.nextInt();
            String tmp = keyboard.nextLine();
            days = E4DayInMonth.dayInMonth(month, year);
            if (days == -1) System.out.println("Invalid month/year.");;
        } while (days == -1);
        System.out.println(String.format("%s, %d has %d days", month, year, days));
    }
}
