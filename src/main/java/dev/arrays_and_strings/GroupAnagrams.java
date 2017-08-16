package dev.arrays_and_strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rthakur on 7/12/17.
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = new String[]{"tea", "", "eat", "", "tea", ""};
//        System.out.println(Character.valueOf(""));
//        for(String s : strs)
//            System.out.println(s);
//        System.out.println(strs);
//        System.out.println('\"\"'-'a');
//        System.out.println(Arrays.toString("tea".toCharArray()));
//        System.out.println(Arrays.toString("eat".toCharArray()));
        GroupAnagrams ga = new GroupAnagrams();
        System.out.println(ga.groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        // int index =0;
        for (String s : strs) {
            int index = isNotAnAnagramOfExistingStuff(result, s);
            if (result.size() == 0 || index == -1) {
                List<String> tmpList = new ArrayList<>();
                tmpList.add(s);
                result.add(tmpList);
            } else {
                result.get(index).add(s);
            }
        }

        return result;

    }

    // will return index if not presnt will retrun -1;
    private int isNotAnAnagramOfExistingStuff(List<List<String>> result, String s) {
        for (int i = 0; i < result.size(); i++) {
            List<String> existing = result.get(i);
            if (existing != null) {
                if (isAnagram(existing.get(0), s))
                    return i;
            }
        }
        return -1;
    }

    private boolean isAnagram(String source, String target) {
//        int[] memo = new int [128];
        Map<Character, Integer> map = new HashMap<>();

//        if(target.equals(""))
//            map.put(target, )
        for (char c : source.toCharArray()) {
//            memo[c]++;
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        for (char c : target.toCharArray()) {
//            memo[c]--;
            map.put(c, map.getOrDefault(c, 0) - 1);
//            if(memo[c] <0)
//                return false;
            if (map.get(c) < 0)
                return false;
        }

        return true;
    }

    public List<List<String>> groupAnagramsLeetCode(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
//            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
