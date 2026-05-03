/*
 * @lc app=leetcode id=2765 lang=java
 *
 * [2765] Longest Alternating Subarray
 */

class Solution {
    public int alternatingSubarray(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("las", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0) {
                while (v[0] < nums.length - 1) {
                    if (nums[v[0] + 1] - nums[v[0]] == 1) {
                        if (((v[2] = v[0] + 2) | 1) != 0 && ((v[3] = -1) | 1) != 0) {
                            while (v[2] < nums.length && nums[v[2]] - nums[v[2] - 1] == v[3]) { if (((v[3] *= -1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                            if (v[2] - v[0] > v[1]) { if (((v[1] = v[2] - v[0]) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("las", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("las");
    }
}
