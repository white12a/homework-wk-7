import java.util.Scanner;

public class Ans8 {
    public static void main(String[] args) {
        String a[]={"Aberdeen","belfast","cambridge","derby","Edinburgh","feltham"};

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter first letter of city between A to F");
        String city=scan.next();

        if(city.startsWith("a")){
            System.out.println(a[0]);
        }else if(city.startsWith("b")){
            System.out.println(a[1]);
        }else if(city.startsWith("c")){
            System.out.println(a[2]);
        }else if(city.startsWith("d")){
            System.out.println(a[3]);
        }else if(city.startsWith("e")){
            System.out.println(a[4]);
        }else if(city.startsWith("f")){
            System.out.println(a[5]);
        }else{
            System.out.println("Invalid entry");
        }
    }
}
