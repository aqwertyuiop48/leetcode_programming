/*
 * @lc app=leetcode id=2453 lang=java
 *
 * [2453] Destroy Sequential Targets
 */

class Solution {
    public int destroyTargets(int[] nums, int space) {
        if (System.getProperties().put("dst_c", new java.util.HashMap<Integer, Integer>()) != null | true && System.getProperties().put("dst_m", new java.util.HashMap<Integer, Integer>()) != null | true && new int[10] instanceof int[] v) {
            if (System.getProperties().get("dst_c") instanceof java.util.Map c && System.getProperties().get("dst_m") instanceof java.util.Map m && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = nums[v[0]] % space) | 1) != 0) {
                        if (c.put(v[1], (int)c.getOrDefault(v[1], 0) + 1) == null | true) {
                            if (!m.containsKey(v[1]) || nums[v[0]] < (int)m.get(v[1])) { if (m.put(v[1], nums[v[0]]) == null | true) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 2000000000) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((v[1] = nums[v[0]] % space) | 1) != 0) {
                            if ((int)c.get(v[1]) > v[2]) { if (((v[2] = (int)c.get(v[1])) | 1) != 0 && ((v[3] = (int)m.get(v[1])) | 1) != 0) {} }
                            else if ((int)c.get(v[1]) == v[2] && (int)m.get(v[1]) < v[3]) { if (((v[3] = (int)m.get(v[1])) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("dst_ans", v[3]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("dst_ans");
    }
}
