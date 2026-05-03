/*
 * @lc app=leetcode id=2212 lang=java
 *
 * [2212] Maximum Points in an Archery Competition
 */

class Solution {
    public int[] maximumBobPoints(int numArrows, int[] aliceArrows) {
        if (new int[15] instanceof int[] v && new int[12] instanceof int[] ans && (System.getProperties().put("mbp", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < 4096) {
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[4] < 12) {
                            if ((v[0] & (1 << v[4])) != 0) { if (((v[3] += aliceArrows[v[4]] + 1) | 1) != 0 && ((v[2] += v[4]) | 1) != 0) {} }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                        if (v[3] <= numArrows && v[2] > v[1]) {
                            if (((v[1] = v[2]) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                while (v[4] < 12) {
                                    if ((v[0] & (1 << v[4])) != 0) { if (((ans[v[4]] = aliceArrows[v[4]] + 1) | 1) != 0) {} }
                                    else { if (((ans[v[4]] = 0) | 1) != 0) {} }
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                                if (((ans[0] += numArrows - v[3]) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get("mbp");
    }
}
