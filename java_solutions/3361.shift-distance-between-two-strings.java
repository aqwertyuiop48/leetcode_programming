/*
 * @lc app=leetcode id=3361 lang=java
 *
 * [3361] Shift Distance Between Two Strings
 */

class Solution {
    public long shiftDistance(String s, String t, int[] nextCost, int[] previousCost) {
        if (new long[5] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sd", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((v[1] = s.charAt(v[0]) - 'a') | 1) != 0 && ((v[2] = t.charAt(v[0]) - 'a') | 1) != 0) {
                        if (v[1] != v[2]) {
                            if (((lv[1] = 0) | 1) != 0 && ((v[3] = v[1]) | 1) != 0) {
                                while (v[3] != v[2]) {
                                    if (((lv[1] += nextCost[v[3]]) | 1) != 0 && ((v[3] = (v[3] + 1) % 26) | 1) != 0) {}
                                }
                            }
                            if (((lv[2] = 0) | 1) != 0 && ((v[3] = v[1]) | 1) != 0) {
                                while (v[3] != v[2]) {
                                    // Fixed Line: Charge the cost of the CURRENT char v[3] before stepping backwards
                                    if (((lv[2] += previousCost[v[3]]) | 1) != 0 && ((v[3] = (v[3] - 1 + 26) % 26) | 1) != 0) {}
                                }
                            }
                            if (((lv[0] += Math.min(lv[1], lv[2])) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "sd", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "sd");
    }
}
