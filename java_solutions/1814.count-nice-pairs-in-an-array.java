/*
 * @lc app=leetcode id=1814 lang=java
 *
 * [1814] Count Nice Pairs in an Array
 */

class Solution {
    public int countNicePairs(int[] nums) {
        if (System.getProperties().put("cnp_m", new java.util.HashMap<Integer, Integer>()) != null | true && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("cnp", 0) != null | true)) {
            if (System.getProperties().get("cnp_m") instanceof java.util.Map m && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] > 0) { if (((v[2] = v[2] * 10 + v[1] % 10) | 1) != 0 && ((v[1] /= 10) | 1) != 0) {} }
                        if (((v[3] = nums[v[0]] - v[2]) | 1) != 0 && ((lv[0] = (lv[0] + (int)m.getOrDefault(v[3], 0)) % 1000000007) | 1) != 0) {
                            if (m.put(v[3], (int)m.getOrDefault(v[3], 0) + 1) == null | true) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("cnp", (int)lv[0]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("cnp");
    }
}
