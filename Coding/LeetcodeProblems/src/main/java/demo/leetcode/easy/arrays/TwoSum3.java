package demo.leetcode.easy.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum3 {
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

    //Two Pointers approach
    // T.E O(nlogn) & S.E O(n)
    private static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[][] numIndexPairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            numIndexPairs[i][0] = nums[i];
            numIndexPairs[i][1] = i;
        }
        Arrays.sort(numIndexPairs, (a, b) -> Integer.compare(a[0], b[0]));
        while (left < right) {
            int sum = numIndexPairs[left][0] + numIndexPairs[right][0];
            if (sum == target)
                return new int[]{numIndexPairs[left][1], numIndexPairs[right][1]};
            else if (sum < target)
                left++;
            else
                right--;
        }
        return new int[]{-1, -1};
    }
}