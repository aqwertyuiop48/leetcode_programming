/*
 * @lc app=leetcode id=3736 lang=java
 *
 * [3736] Minimum Moves to Equal Array Elements III
 */

class Solution {
    public int minMoves(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mme", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (nums[v[0]] > v[1]) { if (((v[1] = nums[v[0]]) | 1) != 0) {} }
                if (((v[2] += nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mme", v[1] * nums.length - v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mme");
    }
}
