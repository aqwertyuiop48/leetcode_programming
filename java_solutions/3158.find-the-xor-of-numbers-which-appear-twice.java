/*
 * @lc app=leetcode id=3158 lang=java
 *
 * [3158] Find the XOR of Numbers Which Appear Twice
 */

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        if (new int[55] instanceof int[] cnt && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "dnx", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((cnt[nums[v[0]]] += 1) | 1) != 0 && cnt[nums[v[0]]] == 2) {
                        if (((v[1] ^= nums[v[0]]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "dnx", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "dnx");
    }
}
