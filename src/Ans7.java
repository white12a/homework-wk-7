import java.util.Scanner;

public class Ans7 {
    /*7. Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
    Commission
    Sales amount >= 50,000 35%
    Sales amount >= 30,000 20%
            >= 20,000 10%
            >= 10,000 5%
            < 10,000 2%*/
    public static void main(String[] args) {
        int commission;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter seller id");
        int saleId = scan.nextInt();

        System.out.println("Please enter seller name");
        String saleName = scan.next();

        System.out.println("Please enter sales amount");
        int salesAmount = scan.nextInt();

        System.out.println("Please enter basic salary");
        int basicSalary=scan.nextInt();

   //conditional statements to find out the commission value based on salary

        if(salesAmount>=50000){
            commission=(salesAmount*35)/100;
            System.out.println("Sales commission is "+commission);
        }else if (salesAmount>=30000 && salesAmount<=49999){
            commission=(salesAmount*20)/100;
            System.out.println("Sales commission is "+commission);
        }else if(salesAmount>=20000 && salesAmount<=29999){
            commission=(salesAmount*10)/100;
            System.out.println("Sales commission is "+commission);
        }else if(salesAmount>=10000 && salesAmount<=19999){
            commission=(salesAmount*5)/100;
            System.out.println("Sales commission is "+commission);
        }else if(salesAmount<1000){
            commission=(salesAmount*2)/100;
            System.out.println("Sales commission is "+commission);
        }
    }

}
