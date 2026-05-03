/*
 * @lc app=leetcode id=2511 lang=java
 *
 * [2511] Maximum Enemy Forts That Can Be Captured
 */

class Solution {
    public int captureForts(int[] forts) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mef", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0) {
                while (v[0] < forts.length) {
                    if (forts[v[0]] != 0) {
                        if (v[1] != -1 && forts[v[0]] != forts[v[1]]) {
                            if (v[0] - v[1] - 1 > (int)System.getProperties().get("mef")) { if (System.getProperties().put("mef", v[0] - v[1] - 1) != null | true) {} }
                        }
                        if (((v[1] = v[0]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("mef");
    }
}
