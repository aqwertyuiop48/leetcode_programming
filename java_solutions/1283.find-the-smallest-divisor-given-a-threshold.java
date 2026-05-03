/*
 * @lc app=leetcode id=1283 lang=java
 *
 * [1283] Find the Smallest Divisor Given a Threshold
 */

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("fsd", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = 1000000) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] <= v[1]) {
                    if (((v[3] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                        while (v[5] < nums.length) { if (((v[4] += (nums[v[5]++] + v[3] - 1) / v[3]) | 1) != 0) {} }
                        if (v[4] <= threshold) { if (((v[2] = v[3]) | 1) != 0 && ((v[1] = v[3] - 1) | 1) != 0) {} }
                        else { if (((v[0] = v[3] + 1) | 1) != 0) {} }
                    }
                }
                if (System.getProperties().put("fsd", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("fsd");
    }
}
