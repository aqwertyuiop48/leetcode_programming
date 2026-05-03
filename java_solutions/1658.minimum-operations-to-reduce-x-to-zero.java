/*
 * @lc app=leetcode id=1658 lang=java
 *
 * [1658] Minimum Operations to Reduce X to Zero
 */

class Solution {
    public int minOperations(int[] nums, int x) {
        if (System.getProperties().put("mor_m", new java.util.HashMap<Integer, Integer>()) != null | true && new int[10] instanceof int[] v && (System.getProperties().put("mor", -1) != null | true)) {
            if (System.getProperties().get("mor_m") instanceof java.util.Map m && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = -1) | 1) != 0) {
                while (v[0] < nums.length) { if (((v[1] += nums[v[0]++]) | 1) != 0) {} }
                if (v[1] == x) { if (System.getProperties().put("mor", nums.length) != null | true) {} }
                else if (v[1] > x && ((v[3] = v[1] - x) | 1) != 0 && m.put(0, -1) == null | true && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((v[1] += nums[v[0]]) | 1) != 0 && m.put(v[1], v[0]) == null | true && m.containsKey(v[1] - v[3])) {
                            if (v[0] - (int)m.get(v[1] - v[3]) > v[2]) { if (((v[2] = v[0] - (int)m.get(v[1] - v[3])) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (v[2] != -1 && System.getProperties().put("mor", nums.length - v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("mor");
    }
}
