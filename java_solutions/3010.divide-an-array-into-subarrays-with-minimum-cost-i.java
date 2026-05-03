/*
 * @lc app=leetcode id=3010 lang=java
 *
 * [3010] Divide an Array Into Subarrays With Minimum Cost I
 */

class Solution {
    public int minimumCost(int[] nums) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mc", 0) != null | true)) {
            if (((v[1] = 999999) | 1) != 0 && ((v[2] = 999999) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] < v[1]) {
                        if (((v[2] = v[1]) | 1) != 0 && ((v[1] = nums[v[0]]) | 1) != 0) {}
                    } else if (nums[v[0]] < v[2]) {
                        if (((v[2] = nums[v[0]]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mc", nums[0] + v[1] + v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mc");
    }
}
