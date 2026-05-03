/*
 * @lc app=leetcode id=1296 lang=java
 *
 * [1296] Divide Array in Sets of K Consecutive Numbers
 */

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (System.getProperties().put("ipd_m", new java.util.TreeMap<Integer, Integer>()) != null | true && new int[10] instanceof int[] v && (System.getProperties().put("ipd", true) != null | true)) {
            if (nums.length % k != 0) { if (System.getProperties().put("ipd", false) != null | true) {} }
            else if (System.getProperties().get("ipd_m") instanceof java.util.Map m && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (m.put(nums[v[0]], (int)m.getOrDefault(nums[v[0]], 0) + 1) == null | true && ((v[0] += 1) | 1) != 0) {} }
                if (new Object[]{m.keySet().toArray(new Integer[0])} instanceof Object[] o && o[0] instanceof Integer[] keys && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < keys.length) {
                        if ((int)m.get(keys[v[0]]) > 0) {
                            if (((v[1] = (int)m.get(keys[v[0]])) | 1) != 0 && ((v[2] = keys[v[0]]) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                                while (v[3] < k) {
                                    if ((int)m.getOrDefault(v[2] + v[3], 0) < v[1]) { if (System.getProperties().put("ipd", false) != null | true && ((v[3] = k) | 1) != 0 && ((v[0] = keys.length) | 1) != 0) {} }
                                    else { if (m.put(v[2] + v[3], (int)m.get(v[2] + v[3]) - v[1]) == null | true && ((v[3] += 1) | 1) != 0) {} }
                                }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (boolean) System.getProperties().get("ipd");
    }
}
