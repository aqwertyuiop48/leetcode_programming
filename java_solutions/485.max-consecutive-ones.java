/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        return Arrays.stream(nums).collect(() -> new int[2], (a, b) -> a[1] = Math.max(a[1], a[0] = (b == 1 ? a[0] + 1 : 0)), (a, b) -> {})[1];
    }
}
