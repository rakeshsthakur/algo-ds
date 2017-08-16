package dev.arrays_and_strings;

import java.util.*;

/**
 * Created by rthakur on 6/20/17.
 */


public class topKFrequentElements {
    // Code from leetcode.
    // use treeMap. Use freqncy as the key so we can get all freqencies in order
    public static List<Integer> topKFrequentUsingTreeMap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        TreeMap<Integer, List<Integer>> freqMap = new TreeMap<>();
        for (int num : map.keySet()) {
            int freq = map.get(num);
            if (!freqMap.containsKey(freq)) {
                freqMap.put(freq, new LinkedList<>());
            }
            freqMap.get(freq).add(num);
        }

        List<Integer> res = new ArrayList<>();
        while (res.size() < k) {
            Map.Entry<Integer, List<Integer>> entry = freqMap.pollLastEntry();
            res.addAll(entry.getValue());
        }
        return res;
    }


    // to use bucket based on frequency
    public static List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length + 1];

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i : nums)
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);

        for (Map.Entry entry : frequencyMap.entrySet()) {
            int key = (int) entry.getKey();
            int freq = (int) entry.getValue();

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && result.size() < 2; i--) {
            if (bucket[i] != null)
                result.addAll(bucket[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        topKFrequent(new int[]{1, 2}, 2).forEach(System.out::println);
//        System.out.println();
    }
}
