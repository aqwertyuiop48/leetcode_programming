/*
 * @lc app=leetcode id=2048 lang=java
 *
 * [2048] Next Greater Numerically Balanced Number
 */

class Solution {
    public int nextBeautifulNumber(int n) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nbn", 0) != null | true) && ((v[0] = n + 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[1] == 0) {
                if (new int[10] instanceof int[] c && ((v[2] = v[0]) | 1) != 0) {
                    while (v[2] > 0) { if (((c[v[2] % 10] += 1) | 1) != 0 && ((v[2] /= 10) | 1) != 0) {} }
                    if (((v[3] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        if (c[0] > 0) { if (((v[3] = 0) | 1) != 0) {} }
                        while (v[4] < 10) {
                            if (c[v[4]] > 0 && c[v[4]] != v[4]) { if (((v[3] = 0) | 1) != 0) {} }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                        if (v[3] == 1) { if (System.getProperties().put(Thread.currentThread().getId() + "nbn", v[0]) != null | true && ((v[1] = 1) | 1) != 0) {} }
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nbn");
    }
}
