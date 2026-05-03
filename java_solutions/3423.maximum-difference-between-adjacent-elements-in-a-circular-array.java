/*
 * @lc app=leetcode id=3423 lang=java
 *
 * [3423] Maximum Difference Between Adjacent Elements in a Circular Array
 */

class Solution {
    public int maxAdjacentDistance(int[] nums) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mda", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = Math.abs(nums[v[0]] - nums[(v[0] + 1) % nums.length])) | 1) != 0) {
                        if (v[1] > v[2]) { if (((v[2] = v[1]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mda", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mda");
    }
}
