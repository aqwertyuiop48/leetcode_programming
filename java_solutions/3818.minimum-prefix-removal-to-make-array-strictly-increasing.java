/*
 * @lc app=leetcode id=3818 lang=java
 *
 * [3818] Minimum Prefix Removal to Make Array Strictly Increasing
 */

class Solution {
    public int minimumPrefixLength(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mpr", 0) != null | true)) {
            if (((v[0] = nums.length - 1) | 1) != 0) {
                while (v[0] > 0 && nums[v[0] - 1] < nums[v[0]]) {
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mpr", v[0]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mpr");
    }
}
