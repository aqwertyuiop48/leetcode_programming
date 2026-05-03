/*
 * @lc app=leetcode id=3201 lang=java
 *
 * [3201] Find the Maximum Length of Valid Subsequence I
 */

class Solution {
    public int maximumLength(int[] nums) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ml1", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] % 2 == 0) {
                        if (((v[1] += 1) | 1) != 0 && ((v[3] = v[4] + 1) | 1) != 0) {}
                    } else {
                        if (((v[2] += 1) | 1) != 0 && ((v[4] = v[3] + 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ml1", Math.max(Math.max(v[1], v[2]), Math.max(v[3], v[4]))) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ml1");
    }
}
