import java.util.Scanner;

public class Ans1 {
   // 1. Write a java program that tells us that Input number is odd or even?  HINT: use ternary operator (? :)


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scan.nextInt();

        String ans= (num==0)? "Even" : "Odd"; // Ternary operator is used
        System.out.println(num+" is "+ ans);
    }
}
