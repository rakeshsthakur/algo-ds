package dev.arrays_and_strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rthakur on 7/25/17.
 */
public class CSVParcerAirbnb {

    // it was array of strings so i had to use another for loop.
    public static String parseCSV(String s) {

        List<String> result = new ArrayList<>();

        if (s == null || s.length() == 0) {

            return "";

        }


        boolean inQuote = false;

        StringBuffer sb = new StringBuffer();


        for (int i = 0; i < s.length(); i++) {

            if (inQuote) {

                if (s.charAt(i) == '"') {

                    if (i == s.length() - 1) {

                        result.add(sb.toString()); // change the 2 lines to break

                        return printStr(result); //

                        // handles this case """Alexandra Alex"""
                    } else if (s.charAt(i + 1) == '"') {

                        sb.append('"');

                        i++;

                    } else {
                        // Code part that handles, the comma at the end after a double quote like here
                        // "San Francisco, CA",0 - to make it San Francisco, CA|0

                        result.add(sb.toString());

                        sb.setLength(0);

                        inQuote = false;

                        i++;

                    }

                } else {

                    sb.append(s.charAt(i));

                }

            } else {

                if (s.charAt(i) == '"') {

                    inQuote = true;

                } else if (s.charAt(i) == ',') {

                    result.add(sb.toString());

                    sb.setLength(0);

                } else {

                    sb.append(s.charAt(i));

                }

            }

        }


        if (sb.length() > 0) {

            result.add(sb.toString());

        }


        return printStr(result);

    }


    private static String printStr(List<String> input) {

        if (input == null || input.size() == 0) {

            return "";

        }


        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < input.size(); i++) {

            sb.append(input.get(i));

            if (i == input.size() - 1) {

                break;

            }

            sb.append("|");

        }


        return sb.toString();

    }


    /**
     * John|Smith|john.smith@gmail.com|Los Angeles|1
     * Jane|Roberts|janer@msn.com|San Francisco, CA,0
     * "Alexandra Alex"
     */
    public static void main(String[] args) {
        System.out.println(parseCSV("John,Smith,john.smith@gmail.com,Los Angeles,1"));
        System.out.println(parseCSV("Jane,Roberts,janer@msn.com,\"San Francisco, CA\",0"));
        System.out.println(parseCSV("\"\"\"Alexandra Alex\"\"\""));
    }
}
