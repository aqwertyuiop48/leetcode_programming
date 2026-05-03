/*
 * @lc app=leetcode id=2162 lang=java
 *
 * [2162] Minimum Cost to Set Cooking Time
 */

class Solution {
    public int minCostSetTime(int startAt, int moveCost, int pushCost, int targetSeconds) {
        if (new int[15] instanceof int[] v && (System.getProperties().put("mcs", 999999999) != null | true)) {
            if (((v[0] = targetSeconds / 60) | 1) != 0 && ((v[1] = targetSeconds % 60) | 1) != 0 && ((v[10] = 0) | 1) != 0) {
                while (v[10] < 2) {
                    if (v[0] <= 99 && v[0] >= 0 && v[1] <= 99) {
                        if (((v[2] = v[0] / 10) | 1) != 0 && ((v[3] = v[0] % 10) | 1) != 0 && ((v[4] = v[1] / 10) | 1) != 0 && ((v[5] = v[1] % 10) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((v[7] = startAt) | 1) != 0 && ((v[8] = 0) | 1) != 0) {
                            if (v[2] == 0) { if (((v[6] = 1) | 1) != 0) {} }
                            if (v[6] == 1 && v[3] == 0) { if (((v[6] = 2) | 1) != 0) {} }
                            if (v[6] == 2 && v[4] == 0) { if (((v[6] = 3) | 1) != 0) {} }
                            while (v[6] < 4) {
                                if (((v[9] = v[6] == 0 ? v[2] : (v[6] == 1 ? v[3] : (v[6] == 2 ? v[4] : v[5]))) | 1) != 0) {
                                    if (v[9] != v[7]) { if (((v[8] += moveCost) | 1) != 0 && ((v[7] = v[9]) | 1) != 0) {} }
                                    if (((v[8] += pushCost) | 1) != 0 && ((v[6] += 1) | 1) != 0) {}
                                }
                            }
                            if (v[8] < (int)System.getProperties().get("mcs")) { if (System.getProperties().put("mcs", v[8]) != null | true) {} }
                        }
                    }
                    if (((v[0] -= 1) | 1) != 0 && ((v[1] += 60) | 1) != 0 && ((v[10] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("mcs");
    }
}
