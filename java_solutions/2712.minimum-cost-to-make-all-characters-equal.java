/*
 * @lc app=leetcode id=2712 lang=java
 *
 * [2712] Minimum Cost to Make All Characters Equal
 */

class Solution {
    public long minimumCost(String s) {
        if (new long[5] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put("mcm", 0L) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (s.charAt(v[0]) != s.charAt(v[0] - 1)) { if (((lv[0] += Math.min(v[0], s.length() - v[0])) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mcm", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get("mcm");
    }
}
