package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/7/17.
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * <p>
 * For example:
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 */
public class ExcelSheetColumnNumber {

    public int porcess(String s) {
        int result = 0;
        for (char c : s.toCharArray()) {
            result = (result * 26 + c - 'A') + 1;
        }

        return result;
    }
}
