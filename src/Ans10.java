import java.util.Scanner;

public class Ans10 {
    //10.Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *) find addition, Subtraction, multiplication and division according to their symbol  (using if else)

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the calculation symbol +, -, / or * : ");
        char z = scan.next().charAt(0); //symbols data type char

        System.out.println("Input the first number: ");
        int x = scan.nextInt();

        System.out.println("Input the second number: ");
        int y = scan.nextInt();
        scan.close();

        if (z == '+') {
            System.out.println(x + " + " + y + " = " + (x + y)); //addition
        } else if (z == '-') {
            System.out.println(x + " - " + y + " = " + (x - y));//subtraction
        } else if (z == '*') {
            System.out.println(x + " x " + y + " = " + (x * y));//multiplication
        } else {
            System.out.println(+x + " / " + y + " = " + (x / y));//division
        }


    }
    }

