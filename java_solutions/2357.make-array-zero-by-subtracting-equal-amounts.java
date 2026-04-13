/*
 * @lc app=leetcode id=2357 lang=java
 *
 * [2357] Make Array Zero by Subtracting Equal Amounts
 */

class Solution {
    public int minimumOperations(int[] nums) {
        return (int) Arrays.stream(nums).filter(n -> n > 0).distinct().count();
    }
}
