/*
 * @lc app=leetcode id=1929 lang=java
 *
 * [1929] Concatenation of Array
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        return IntStream.range(0, nums.length * 2)
            .map(i -> nums[i % nums.length])
            .toArray();
    }
}
