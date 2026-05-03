/*
 * @lc app=leetcode id=3512 lang=java
 *
 * [3512] Minimum Operations to Make Array Sum Divisible by K
 */

class Solution {
    public int minOperations(int[] nums, int k) {
        if (new int[2] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mo", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (((v[1] = (v[1] + nums[v[0]]) % k) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (System.getProperties().put(Thread.currentThread().getId() + "mo", v[1] % k) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mo");
    }
}
