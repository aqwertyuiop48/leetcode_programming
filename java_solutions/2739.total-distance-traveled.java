/*
 * @lc app=leetcode id=2739 lang=java
 *
 * [2739] Total Distance Traveled
 */

class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("tdt", 0) != null | true)) {
            if (((v[0] = mainTank) | 1) != 0 && ((v[1] = additionalTank) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] >= 5) {
                    if (((v[2] += 50) | 1) != 0 && ((v[0] -= 5) | 1) != 0 && v[1] > 0) { if (((v[0] += 1) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} }
                }
                if (System.getProperties().put("tdt", v[2] + v[0] * 10) != null | true) {}
            }
        }
        return (int) System.getProperties().get("tdt");
    }
}
