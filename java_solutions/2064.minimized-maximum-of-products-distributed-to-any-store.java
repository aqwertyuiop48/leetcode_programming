/*
 * @lc app=leetcode id=2064 lang=java
 *
 * [2064] Minimized Maximum of Products Distributed to Any Store
 */

class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mmp", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = 100000) | 1) != 0) {
                while (v[0] <= v[1]) {
                    if (((v[2] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[4] < quantities.length) {
                            if (((v[3] += (quantities[v[4]] + v[2] - 1) / v[2]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                        }
                        if (v[3] <= n) {
                            if (System.getProperties().put("mmp", v[2]) != null | true && ((v[1] = v[2] - 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = v[2] + 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("mmp");
    }
}
