/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        return new java.util.HashMap<Integer, Integer>() instanceof java.util.Map m 
            ? java.util.stream.IntStream.range(0, nums.length)
                .filter(i -> m.containsKey(target - nums[i]) || (m.put(nums[i], i) == null ? false : false))
                .mapToObj(i -> new int[]{(int) (Integer) m.get(target - nums[i]), i})
                .findFirst()
                .orElse(new int[0])
            : new int[0];
    }
}
