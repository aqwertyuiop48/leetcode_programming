/*
 * @lc app=leetcode id=3747 lang=java
 *
 * [3747] Count Distinct Integers After Removing Zeros
 */

class Solution {
    public long countDistinct(long n) {
        if (new Object[]{String.valueOf(n)} instanceof Object[] o && o[0] instanceof String s && new long[20] instanceof long[] pow9 && new long[10] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cdi2", 0L) != null | true)) {
            if (((pow9[0] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] < 20) { if (((pow9[v[0]] = pow9[v[0]-1] * 9) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 1) | 1) != 0 && ((lv[0] = 0) | 1) != 0) {
                    while (v[0] < s.length()) { if (((lv[0] += pow9[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                    if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                        while (v[0] < s.length() && v[1] == 0) {
                            if (((v[2] = s.charAt(v[0]) - '0') | 1) != 0) {
                                if (v[2] == 0) { if (((v[1] = 1) | 1) != 0) {} }
                                else {
                                    if (((lv[0] += (v[2] - 1) * pow9[s.length() - 1 - v[0]]) | 1) != 0) {}
                                }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if (v[1] == 0) { if (((lv[0] += 1) | 1) != 0) {} }
                        if (System.getProperties().put(Thread.currentThread().getId() + "cdi2", lv[0]) != null | true) {}
                    }
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "cdi2");
    }
}
