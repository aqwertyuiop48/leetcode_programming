/*
 * @lc app=leetcode id=3264 lang=java
 *
 * [3264] Final Array State After K Multiplication Operations I
 */

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "gfs", nums) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < k) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] < nums.length) {
                            if (nums[v[1]] < nums[v[2]]) { if (((v[2] = v[1]) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (((nums[v[2]] *= multiplier) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "gfs");
    }
}
