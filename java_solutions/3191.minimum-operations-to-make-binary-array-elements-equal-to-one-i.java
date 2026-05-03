/*
 * @lc app=leetcode id=3191 lang=java
 *
 * [3191] Minimum Operations to Make Binary Array Elements Equal to One I
 */

class Solution {
    public int minOperations(int[] nums) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mo1", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length - 2) {
                    if (nums[v[0]] == 0) {
                        if (((nums[v[0]] = 1) | 1) != 0 && ((nums[v[0]+1] ^= 1) | 1) != 0 && ((nums[v[0]+2] ^= 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (nums[nums.length - 2] == 0 || nums[nums.length - 1] == 0) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "mo1", -1) != null | true) {}
                } else {
                    if (System.getProperties().put(Thread.currentThread().getId() + "mo1", v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mo1");
    }
}
