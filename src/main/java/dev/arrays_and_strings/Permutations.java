package dev.arrays_and_strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rthakur on 6/27/17.
 */
public class Permutations {

    public static void main(String[] args) {
        Permutations p = new Permutations();
        System.out.println(p.permute(new int[]{1, 2, 3}));
//        for(List<Integer> i : p.permute(new int[] {1,2,3})){
//            System.out.print("[");
//            i.forEach(j -> System.out.print(j));
//            System.out.println("]");
//        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        backtrack(list, new ArrayList<>(), nums);

        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tmpList, int[] nums) {
//        System.out.println(tmpList);
        if (tmpList.size() == nums.length) {
            list.add(new ArrayList<>(tmpList));
        } else {
            for (int i = 0; i < nums.length; i++) {
//                System.out.println(tmpList);
                if (!tmpList.contains(nums[i])) {
//                    continue;
                    tmpList.add(nums[i]);

                    backtrack(list, tmpList, nums);
//                }

//                tmpList.clear();
//                tmpList.forEach(j -> System.out.print(j));
                    tmpList.remove(tmpList.size() - 1);
                }
            }
        }
    }
}
