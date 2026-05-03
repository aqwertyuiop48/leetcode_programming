/*
 * @lc app=leetcode id=3192 lang=java
 *
 * [3192] Minimum Operations to Make Binary Array Elements Equal to One II
 */

class Solution {
    public int minOperations(int[] nums) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mo2", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if ((nums[v[0]] + v[1]) % 2 == 0) {
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mo2", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mo2");
    }
}
