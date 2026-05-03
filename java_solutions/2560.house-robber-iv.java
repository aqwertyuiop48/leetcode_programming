/*
 * @lc app=leetcode id=2560 lang=java
 *
 * [2560] House Robber IV
 */

class Solution {
    public int minCapability(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("hr4", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 1000000000) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] <= v[1]) {
                    if (((v[3] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                        while (v[4] < nums.length) {
                            if (nums[v[4]] <= v[3]) { if (((v[5] += 1) | 1) != 0 && ((v[4] += 1) | 1) != 0) {} }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                        if (v[5] >= k) { if (((v[2] = v[3]) | 1) != 0 && ((v[1] = v[3] - 1) | 1) != 0) {} }
                        else { if (((v[0] = v[3] + 1) | 1) != 0) {} }
                    }
                }
                if (System.getProperties().put("hr4", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("hr4");
    }
}
