/*
 * @lc app=leetcode id=3833 lang=java
 *
 * [3833] Count Dominant Indices
 */

class Solution {
    public int dominantIndices(int[] nums) {
        if (new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "cd", 0) != null | true)) {
            if (((v[0] = nums.length - 1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((lv[0] = 0L) | 1) != 0) {
                while (v[0] > 0) {
                    if (((lv[0] += nums[v[0]]) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {
                        if ((long)nums[v[0]] * (nums.length - 1 - v[0]) > lv[0]) {
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cd", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cd");
    }
}
