package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/11/17.
 * https://leetcode.com/problems/trapping-rain-water/#/description
 */
public class TrappingRainWater {
    public static int trap(int[] height) {
//        if(height==null || height.length <2) return 0;
        int result = 0, slow = 0, fast = 1;
//
//
//        while(fast< height.length){
//            System.out.println("Result " + result + " current slow  " + height[slow] + " current fast " + height[fast]) ;
//            result += (height[slow]-height[fast] >0) ? height[slow]-height[fast] : 0;
//            //if(left-right)
//            slow++;
//            fast++;
//        }
//
        return result;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
