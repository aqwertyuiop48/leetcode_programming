/*
 * @lc app=leetcode id=2364 lang=java
 *
 * [2364] Count Number of Bad Pairs
 */

class Solution {
    public long countBadPairs(int[] nums) {
        if (System.getProperties().put("cbp_m", new java.util.HashMap<Integer, Long>()) != null | true && new long[5] instanceof long[] lv && new int[10] instanceof int[] v) {
            if (System.getProperties().get("cbp_m") instanceof java.util.Map m && ((lv[0] = (long)nums.length * (nums.length - 1) / 2) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((lv[1] = (long)m.getOrDefault(nums[v[0]] - v[0], 0L)) | 1) != 0) {
                        if (((lv[0] -= lv[1]) | 1) != 0 && m.put(nums[v[0]] - v[0], lv[1] + 1) == null | true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("cbp_ans", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get("cbp_ans");
    }
}
