package dev.arrays_and_strings;

/**
 * Created by rthakur on 4/17/17.
 */
public class IntegerFromString {

    public static Integer getInteger(String str) {
        int result = 0;
        for (char a : str.toCharArray()) {
            result = result * 10 + a - '0';
        }
        return result;
    }
}
