package dev.recurssion;

/**
 * Created by rthakur on 4/16/17.
 */
public class Factorial {

    public static long getFactorial(int input) {
        if (input == 0) {
            return 1;
        } else {
            return input * getFactorial(input - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(3));
    }
}
