public class Ans19 {
    public static void main(String[] args) {
        int a[]={10,56,78,34,32};

        int sum=0;
        for(int i=0; i<a.length; i++){
            sum=sum+a[i];
            double average=sum/a.length;
            System.out.println("average of the array is "+ average);
        }
    }
}
