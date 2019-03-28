package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author THY
 * @date 2019/3/25
 */
public class Solution1 {
    private static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return null;
        }

        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(nums[i])) {
                int index = numsMap.get(nums[i]);
                int[] result = {index, i};
                return result;
            } else {
                numsMap.put(target - nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] nums = {1, 3, 5, 7, 9, 1, 2, 3};
        int target = 8;
        long endTime = System.currentTimeMillis();
        System.out.println(startTime - endTime);

    }
}
