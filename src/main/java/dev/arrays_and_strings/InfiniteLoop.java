package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/30/17.
 */
public class InfiniteLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = i; j < 2; j++)
                System.out.println("Hello");
        }
    }
}
