public class Ans20 {
    /**
     * Write a Java program to test if an array contains a specific
     * value.
     */
    public static void main(String[] args) {
        int[] a = {5, 67, 37, 98, 56};
        System.out.println(value(a,67));
        System.out.println(value(a,55));
    }

    public static boolean value(int a[], int item) {
        for (int x : a) {
            if (item == x) {
                return true;
            }
        }
        return false;
    }
}
