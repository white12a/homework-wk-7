import java.util.Scanner;

public class Ans16 {/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();
        scan.close();

        if (number > 0) {
            System.out.println(number + " is a Positive number");

        } else if (number < 0) {
            System.out.println(number + " is a Negative number");

        } else {
            System.out.println(number + " is Zero");

        }
    }
}
