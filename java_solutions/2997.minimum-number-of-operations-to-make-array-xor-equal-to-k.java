/*
 * @lc app=leetcode id=2997 lang=java
 *
 * [2997] Minimum Number of Operations to Make Array XOR Equal to K
 */

class Solution {
    public int minOperations(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mo", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (((v[1] ^= nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (System.getProperties().put(Thread.currentThread().getId() + "mo", Integer.bitCount(v[1] ^ k)) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mo");
    }
}
