/*
 * @lc app=leetcode id=2762 lang=java
 *
 * [2762] Continuous Subarrays
 */

class Solution {
    public long continuousSubarrays(int[] nums) {
        if (new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("cs", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && System.getProperties().put("cs_m", new java.util.TreeMap<Integer, Integer>()) != null | true) {
                while (v[1] < nums.length && System.getProperties().get("cs_m") instanceof java.util.Map m) {
                    if (m.put(nums[v[1]], (int)m.getOrDefault(nums[v[1]], 0) + 1) == null | true) {
                        while ((int)((java.util.TreeMap)m).lastKey() - (int)((java.util.TreeMap)m).firstKey() > 2) {
                            if (m.put(nums[v[0]], (int)m.get(nums[v[0]]) - 1) == null | true && (int)m.get(nums[v[0]]) == 0) { if (m.remove(nums[v[0]]) == null | true) {} }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if (((lv[0] += v[1] - v[0] + 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put("cs", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get("cs");
    }
}
