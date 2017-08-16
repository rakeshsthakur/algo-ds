package dev.arrays_and_strings;

/**
 * Created by rthakur on 4/16/17.
 */
public class CompressedString {

    public static String getCompressedString(String s) {
        int charCount = 0;
        StringBuilder compressedString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            charCount++;
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressedString.append(s.charAt(i));
                compressedString.append(charCount);
                charCount = 0;
            }
        }
        return compressedString.toString().length() < s.length() ? compressedString.toString() : s;
    }
}
