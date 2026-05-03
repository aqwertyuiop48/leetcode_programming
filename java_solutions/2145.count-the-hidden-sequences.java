/*
 * @lc app=leetcode id=2145 lang=java
 *
 * [2145] Count the Hidden Sequences
 */

class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        if (new long[10] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put("noa", 0) != null | true)) {
            if (((lv[0] = 0) | 1) != 0 && ((lv[1] = 0) | 1) != 0 && ((lv[2] = 0) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[0] < differences.length) {
                    if (((lv[0] += differences[v[0]]) | 1) != 0) {
                        if (lv[0] > lv[1]) { if (((lv[1] = lv[0]) | 1) != 0) {} }
                        if (lv[0] < lv[2]) { if (((lv[2] = lv[0]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((lv[3] = (upper - lower) - (lv[1] - lv[2]) + 1) | 1) != 0) {
                    if (System.getProperties().put("noa", (int)Math.max(0L, lv[3])) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("noa");
    }
}
