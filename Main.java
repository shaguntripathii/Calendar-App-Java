package general;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Year: ");
        Integer Y = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Day that starts the year: ");
        Integer startDayOfMonth = scan1.nextInt();
        int spaces = startDayOfMonth;

        String[] months = {
                "",
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
        };

        int[] days = {
                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        for (int M = 1; M <= 12; M++) {

            if  ((((Y % 4 == 0) && (Y % 100 != 0)) ||  (Y % 400 == 0)) && M == 2)
                days[M] = 29;

            System.out.println("          "+ months[M] + " " + Y);

            System.out.println("_____________________________________");
            System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");

            spaces = (days[M-1] + spaces)%7;

            for (int i = 0; i < spaces; i++)
                System.out.print("     ");
            for (int i = 1; i <= days[M]; i++) {
                System.out.printf(" %3d ", i);
                if (((i + spaces) % 7 == 0) || (i == days[M])) System.out.println();
            }

            System.out.println();
        }
    }
}