import java.util.Scanner;

public class Ans6 {
   // 6. Write a java program to input any number and find out if it’s odd or even
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num=scan.nextInt();

        if (num%2==0){
            System.out.println(num+" is even number");
        }else{
            System.out.println(num+" is odd number ");
        }
    }
}
