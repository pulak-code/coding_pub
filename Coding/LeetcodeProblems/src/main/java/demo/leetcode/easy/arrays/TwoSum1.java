package demo.leetcode.easy.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String[] args) {
        /*
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        */
        int[] nums = {2, 7, 11, 15, 4};
        int target = 11;
        int[] result = twoSum(nums, target);
        System.out.println("Output: " + Arrays.toString(result));
    }

    //BruteForce approach
    // T.E O(n2) & S.E O(1)
    private static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {  // O(n)
            for (int j = i + 1; j < n; j++) {  // O(n)
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Found the pair
                }
            }
        }
        return new int[]{};
    }
}