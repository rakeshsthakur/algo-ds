package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/18/17.
 */
public class OneAway {

    public static boolean oneAway(String s, String t) {

        if (Math.abs(s.length() - t.length()) > 1)
            return false;
        //replace case:
        if (s.length() == t.length())
            return oneReplace(s, t);
        else if (s.length() + 1 == t.length()) {
            return oneInsertOrDelete(t, s);

        } else if (s.length() - 1 == t.length())
            return oneInsertOrDelete(s, t);

        return false;

    }

    private static boolean oneInsertOrDelete(String longString, String shortString) {
//        boolean differenceFound=false;
        int index0 = 0, index1 = 0;
        while (index0 < longString.length() && index1 < shortString.length()) {
            if (longString.charAt(index0) != shortString.charAt(index1)) {
                if (index0 != index1)
                    return false;
                index0++;
            } else {
                index0++;
                index1++;
            }

        }
        return true;
    }

    private static boolean oneReplace(String s, String t) {
        boolean differenceFound = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (differenceFound) return false;
                differenceFound = true;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(oneAway("add", "dadd"));
    }
}
