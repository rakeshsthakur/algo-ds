package dev.arrays_and_strings;

/**
 * Created by rthakur on 4/25/17.
 */
public class ReverseAnInteger {

    public static int reverse(int x) {
        long reverse = 0;
        while (x != 0) {

            reverse = reverse * 10 + x % 10;

            x = x / 10;
            if (Integer.MAX_VALUE < reverse || Integer.MIN_VALUE > reverse)
                return 0;
        }

        return (int) reverse;
    }
}
