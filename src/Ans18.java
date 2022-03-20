public class Ans18 {
   // 18. Write a Java program to sum values of an array.

    public static void main(String[] args) {
        int []a={3,5,7,8,9,10};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];// appand method
        }
        System.out.println("sum of the array is "+ sum);
    }
}
