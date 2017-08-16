package dev.arrays_and_strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rthakur on 6/26/17.
 */
public class GenerateParenthesis {

    public static void main(String[] args) {
        System.out.println(0 & 2 & 2);
        GenerateParenthesis target = new GenerateParenthesis();
//
        for (String i : target.generateParenthesis(2)) {
//            System.out.println(i);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        generateOneByOne("", list, n, n, "Intial");
        return list;
    }

    public void generateOneByOne(String sublist, List<String> list, int left, int right, String from) {
        if (left > right) {
            return;
        }
        System.out.println("SubString " + sublist + " From " + from);
        if (left > 0) {
//            System.out.println("From left");
            generateOneByOne(sublist + "(", list, left - 1, right, "From left");
        }
        if (right > 0) {
//            System.out.println("From Right");
            generateOneByOne(sublist + ")", list, left, right - 1, "From right");
        }
        if (left == 0 && right == 0) {
            list.add(sublist);
            return;
        }
    }
}
