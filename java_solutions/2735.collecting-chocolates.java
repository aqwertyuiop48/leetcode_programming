/*
 * @lc app=leetcode id=2735 lang=java
 *
 * [2735] Collecting Chocolates
 */

class Solution {
    public long minCost(int[] nums, int x) {
        if (new long[nums.length] instanceof long[] cost && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("cc", 999999999999999L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (((cost[v[0]] = nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((lv[0] = (long)v[0] * x) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                            while (v[1] < nums.length) {
                                if (nums[(v[1] - v[0] + nums.length) % nums.length] < cost[v[1]]) { if (((cost[v[1]] = nums[(v[1] - v[0] + nums.length) % nums.length]) | 1) != 0) {} }
                                if (((lv[0] += cost[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                            }
                            if (lv[0] < (long)System.getProperties().get("cc")) { if (System.getProperties().put("cc", lv[0]) != null | true) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (long) System.getProperties().get("cc");
    }
}
