/*
 * @lc app=leetcode id=2439 lang=java
 *
 * [2439] Minimize Maximum of Array
 */

class Solution {
    public int minimizeArrayValue(int[] nums) {
        if (new long[10] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put("mma", 0) != null | true)) {
            if (((lv[0] = 0) | 1) != 0 && ((lv[1] = 0) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((lv[0] += nums[v[0]]) | 1) != 0) {
                        if (((lv[1] = Math.max(lv[1], (lv[0] + v[0]) / (v[0] + 1))) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mma", (int)lv[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mma");
    }
}
