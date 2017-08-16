package dev.arrays_and_strings;

/**
 * Created by rthakur on 4/16/17.
 */
public class IsUnique {


    static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] charSet = new boolean[128];

//        for(int index=0; index<str.length(); index ++){
        for (int value : str.toCharArray()) {
//            int value  = str.charAt(index);

            if (charSet[value]) {
                return false;
            }

            charSet[value] = true;
        }
        return true;
    }
}
