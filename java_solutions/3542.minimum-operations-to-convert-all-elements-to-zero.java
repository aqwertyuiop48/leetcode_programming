/*
 * @lc app=leetcode id=3542 lang=java
 *
 * [3542] Minimum Operations to Convert All Elements to Zero
 */

class Solution {
    public int minOperations(int[] nums) {
        if (new int[nums.length + 1] instanceof int[] st && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mo0", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((st[0] = 0) | 1) != 0) {
                while(v[0] < nums.length) {
                    while(v[1] >= 0 && st[v[1]] > nums[v[0]]) { if (((v[1] -= 1) | 1) != 0) {} }
                    if (v[1] < 0 || st[v[1]] < nums[v[0]]) {
                        if (((v[2] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0 && ((st[v[1]] = nums[v[0]]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mo0", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mo0");
    }
}
