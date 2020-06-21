import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (numMap.containsKey(result)) {
                int resultIndex = numMap.get(result);
                if (i == resultIndex) {
                    continue;
                }
                return new int[] { Math.min(i, resultIndex), Math.max(i, resultIndex) };
            }
            numMap.put(nums[i], i);
        }
        return new int[0];
    }
}
// @lc code=end
