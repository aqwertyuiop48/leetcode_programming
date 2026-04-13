/*
 * @lc app=leetcode id=2562 lang=java
 *
 * [2562] Find the Array Concatenation Value
 */

class Solution {
    public long findTheArrayConcVal(int[] nums) {
        return IntStream.range(0, (nums.length + 1) / 2)
            .mapToLong(i -> Long.parseLong(i == nums.length - 1 - i ? 
                String.valueOf(nums[i]) : 
                String.valueOf(nums[i]) + String.valueOf(nums[nums.length - 1 - i])))
            .sum();
    }
}
