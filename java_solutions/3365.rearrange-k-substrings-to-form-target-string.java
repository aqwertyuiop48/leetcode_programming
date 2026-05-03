/*
 * @lc app=leetcode id=3365 lang=java
 *
 * [3365] Rearrange K Substrings to Form Target String
 */

class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        if (new java.util.HashMap<String, Integer>() instanceof java.util.HashMap map && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "rks", false) != null | true)) {
            if (((v[0] = s.length() / k) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[1] < s.length()) {
                    if (map.put(s.substring(v[1], v[1] + v[0]), (int)map.getOrDefault(s.substring(v[1], v[1] + v[0]), 0) + 1) != null | true && ((v[1] += v[0]) | 1) != 0) {}
                }
                if (((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                    while (v[1] < t.length()) {
                        if (((v[3] = (int)map.getOrDefault(t.substring(v[1], v[1] + v[0]), 0)) | 1) != 0) {
                            if (v[3] == 0) { if (((v[2] = 0) | 1) != 0 && ((v[1] = t.length()) | 1) != 0) {} }
                            else { if (map.put(t.substring(v[1], v[1] + v[0]), v[3] - 1) != null | true && ((v[1] += v[0]) | 1) != 0) {} }
                        }
                    }
                    if (v[2] == 1) { if (System.getProperties().put(Thread.currentThread().getId() + "rks", true) != null | true) {} }
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "rks");
    }
}
