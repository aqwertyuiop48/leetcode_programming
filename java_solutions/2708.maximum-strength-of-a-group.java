/*
 * @lc app=leetcode id=2708 lang=java
 *
 * [2708] Maximum Strength of a Group
 */

class Solution {
    public long maxStrength(int[] nums) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("msg", (long)nums[0]) != null | true)) {
            if (nums.length > 1 && ((v[0] = nums[0]) | 1) != 0 && ((v[1] = nums[0]) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                while (v[2] < nums.length) {
                    if (((v[3] = Math.max((long)nums[(int)v[2]], Math.max(v[0] * nums[(int)v[2]], v[1] * nums[(int)v[2]]))) | 1) != 0 && ((v[4] = Math.min((long)nums[(int)v[2]], Math.min(v[0] * nums[(int)v[2]], v[1] * nums[(int)v[2]]))) | 1) != 0) {
                        if (((v[0] = Math.max(v[0], v[3])) | 1) != 0 && ((v[1] = Math.min(v[1], v[4])) | 1) != 0) {}
                    }
                    if (((v[2] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("msg", v[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get("msg");
    }
}
