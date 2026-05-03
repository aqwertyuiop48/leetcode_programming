/*
 * @lc app=leetcode id=2507 lang=java
 *
 * [2507] Smallest Value After Replacing With Sum of Prime Factors
 */

class Solution {
    public int smallestValue(int n) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("sv", n) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] == 1) {
                    if (((v[1] = (int)System.getProperties().get("sv")) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 2) | 1) != 0) {
                        while (v[3] * v[3] <= v[1]) {
                            while (v[1] % v[3] == 0) { if (((v[2] += v[3]) | 1) != 0 && ((v[1] /= v[3]) | 1) != 0) {} }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                        if (v[1] > 1) { if (((v[2] += v[1]) | 1) != 0) {} }
                        if (v[2] == (int)System.getProperties().get("sv")) { if (((v[0] = 0) | 1) != 0) {} }
                        else { if (System.getProperties().put("sv", v[2]) != null | true) {} }
                    }
                }
            }
        }
        return (int) System.getProperties().get("sv");
    }
}
