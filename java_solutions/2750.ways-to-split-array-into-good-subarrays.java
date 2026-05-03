/*
 * @lc app=leetcode id=2750 lang=java
 *
 * [2750] Ways to Split Array Into Good Subarrays
 */

class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {
        if (new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("wga", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0 && ((lv[0] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] == 1) {
                        if (v[1] != -1) { if (((lv[0] = (lv[0] * (v[0] - v[1])) % 1000000007) | 1) != 0) {} }
                        if (((v[1] = v[0]) | 1) != 0 && ((v[2] = 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("wga", v[2] == 0 ? 0 : (int)lv[0]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("wga");
    }
}
