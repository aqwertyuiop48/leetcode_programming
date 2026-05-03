/*
 * @lc app=leetcode id=2513 lang=java
 *
 * [2513] Minimize the Maximum of Two Arrays
 */

class Solution {
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("mmo", 0) != null | true)) {
            if (((v[0] = divisor1) | 1) != 0 && ((v[1] = divisor2) | 1) != 0) {
                while (v[1] > 0) { if (((v[2] = v[0] % v[1]) | 1) != 0 && ((v[0] = v[1]) | 1) != 0 && ((v[1] = v[2]) | 1) != 0) {} }
                if (((v[3] = (long)divisor1 * divisor2 / v[0]) | 1) != 0 && ((v[4] = 1) | 1) != 0 && ((v[5] = 10000000000L) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                    while (v[4] <= v[5]) {
                        if (((v[7] = v[4] + (v[5] - v[4]) / 2) | 1) != 0) {
                            if (v[7] - v[7] / divisor1 >= uniqueCnt1 && v[7] - v[7] / divisor2 >= uniqueCnt2 && v[7] - v[7] / v[3] >= uniqueCnt1 + uniqueCnt2) {
                                if (((v[6] = v[7]) | 1) != 0 && ((v[5] = v[7] - 1) | 1) != 0) {}
                            } else {
                                if (((v[4] = v[7] + 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (System.getProperties().put("mmo", (int)v[6]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("mmo");
    }
}
