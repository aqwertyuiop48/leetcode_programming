/*
 * @lc app=leetcode id=2857 lang=java
 *
 * [2857] Count Pairs of Points With Distance k
 */

class Solution {
    public int countPairs(java.util.List<java.util.List<Integer>> coordinates, int k) {
        if (System.getProperties().put("cpp_m", new java.util.HashMap<Long, Integer>()) != null | true && new int[10] instanceof int[] v && (System.getProperties().put("cpp", 0) != null | true)) {
            if (System.getProperties().get("cpp_m") instanceof java.util.Map map && ((v[0] = 0) | 1) != 0) {
                while (v[0] < coordinates.size()) {
                    if (((v[1] = coordinates.get(v[0]).get(0)) | 1) != 0 && ((v[2] = coordinates.get(v[0]).get(1)) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[3] <= k) {
                            if (((v[4] = v[1] ^ v[3]) | 1) != 0 && ((v[5] = v[2] ^ (k - v[3])) | 1) != 0) {
                                if (((v[6] = (int)map.getOrDefault(((long)v[4] << 32) | v[5], 0)) | 1) != 0) {
                                    if (System.getProperties().put("cpp", (int)System.getProperties().get("cpp") + v[6]) != null | true) {}
                                }
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                        if (map.put(((long)v[1] << 32) | v[2], (int)map.getOrDefault(((long)v[1] << 32) | v[2], 0) + 1) == null | true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("cpp");
    }
}
