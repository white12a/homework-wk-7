import java.util.Scanner;

public class Ans2 {
    //2. Write a java program to input any year like (ex.2007) and find out if it is leap year or  not?
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the year");
        int year = scan.nextInt();
        scan.close();

        //Ternary operator used
        String leapYear=(year%4==0 && year%100!=0)? "Leap year" : "Not leap year"; //
        System.out.println(year+ " is "+ leapYear);

    }
}
