/*
 * @lc app=leetcode id=3392 lang=java
 *
 * [3392] Count Subarrays of Length Three With a Condition
 */

class Solution {
    public int countSubarrays(int[] nums) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "csl3", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length - 2) {
                    if ((nums[v[0]] + nums[v[0] + 2]) * 2 == nums[v[0] + 1]) {
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "csl3", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "csl3");
    }
}
