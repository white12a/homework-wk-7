import java.util.Arrays;

public class Ans17 {
    public static void main(String[] args) {
        int[] numArray = {5, 10, 78, 45, 79, 34, 65};
        String [] stringArray = {"Tom","Brain","charlie","mike","Danish"};
        System.out.println("Actual numercial array is "+ Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println("Sorted array is "+ Arrays.toString(numArray));
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("Actual string array is "+ Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted string array is "+ Arrays.toString(stringArray));
    }
}
