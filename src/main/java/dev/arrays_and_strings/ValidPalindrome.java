package dev.arrays_and_strings;

/**
 * Created by rthakur on 6/18/17.
 */
public class ValidPalindrome {

    public static boolean isValidPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                sb.append(c);
        }
//        for(char i : sb.toString().toCharArray()){
//            System.out.println(i);
//        }
        if (sb.length() == 0) return false;
        return isPalindrome(sb.toString());
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j) {
//            System.out.println(j);
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isValidPalindrome("ab2a"));
    }
}
