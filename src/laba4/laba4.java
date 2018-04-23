package laba4;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class laba4 {
    static int co = 0;
    static int ch = 0;
    public static void main(String[] args ) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        BigInteger numb =s.nextBigInteger();
        Factorial factorial = new Factorial();
        System.out.println("Ex1 Factorial of number "+ numb+" = "+factorial.fact(new BigInteger(String.valueOf(numb))));
        sort(new int[] { 4, 5, 8, 6, 1, 3, 7, 5, 2 });
    }
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int index = Arrays.binarySearch(arr, 0, k, newElement);
            if (index < 0) {
                index = -(index) - 1;
            }
            System.arraycopy(arr, index, arr, index + 1, k - index);
            arr[index] = newElement;

        }
        System.out.println(Arrays.toString(arr));
    }

}
