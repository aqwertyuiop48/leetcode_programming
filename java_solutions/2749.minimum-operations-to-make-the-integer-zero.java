/*
 * @lc app=leetcode id=2749 lang=java
 *
 * [2749] Minimum Operations to Make the Integer Zero
 */

class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        if (new long[5] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put("miz", -1) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] <= 60) {
                    if (((lv[0] = (long)num1 - (long)num2 * v[0]) | 1) != 0 && lv[0] >= v[0]) {
                        if (Long.bitCount(lv[0]) <= v[0]) { if (System.getProperties().put("miz", v[0]) != null | true && ((v[0] = 61) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("miz");
    }
}
