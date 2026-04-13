/*
 * @lc app=leetcode id=2148 lang=java
 *
 * [2148] Count Elements With Strictly Smaller and Greater Elements 
 */

class Solution {
    public int countElements(int[] nums) {
        return (int) Arrays.stream(nums)
            .filter(n -> n > Arrays.stream(nums).min().getAsInt() && 
                         n < Arrays.stream(nums).max().getAsInt())
            .count();
    }
}
