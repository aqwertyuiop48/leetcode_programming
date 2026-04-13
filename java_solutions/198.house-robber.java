/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

class Solution {
    public int rob(int[] nums) {
        return Arrays.stream(nums)
            .boxed()
            .reduce(new int[]{0, 0}, 
                (state, n) -> new int[]{state[1], Math.max(state[1], state[0] + n)}, 
                (a, b) -> a)[1];
    }
}
