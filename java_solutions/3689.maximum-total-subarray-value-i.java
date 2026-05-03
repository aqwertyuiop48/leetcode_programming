/*
 * @lc app=leetcode id=3689 lang=java
 *
 * [3689] Maximum Total Subarray Value I
 */

class Solution {
    public long maxTotalValue(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mts", 0L) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = -2000000000) | 1) != 0 && ((v[2] = 2000000000) | 1) != 0) {
            while (v[0] < nums.length) {
                if (nums[v[0]] > v[1]) { if (((v[1] = nums[v[0]]) | 1) != 0) {} }
                if (nums[v[0]] < v[2]) { if (((v[2] = nums[v[0]]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mts", (long)(v[1] - v[2]) * k) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mts");
    }
}
