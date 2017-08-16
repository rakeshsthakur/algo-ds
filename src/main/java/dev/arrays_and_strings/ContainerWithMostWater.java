package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/31/17.
 */
public class ContainerWithMostWater {

    public static int maxArea(int nums[]) {

        int maxArea = 0;

        int i = 0, j = nums.length - 1;

        while (i < j) {
            maxArea = Math.max(maxArea, Math.min(nums[i], nums[j]) * (j - i));
//            System.out.println("current cal " + Math.min(nums[i], nums[j]) * (j-i) + " i = " + i + " j = " +j);
//            System.out.println(maxArea);
            if (nums[i] < nums[j]) {
                i++;
            } else {
                j--;
            }
        }


        return maxArea;

    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
