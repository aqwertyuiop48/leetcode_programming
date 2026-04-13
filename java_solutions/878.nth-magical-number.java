/*
 * @lc app=leetcode id=878 lang=java
 *
 * [878] Nth Magical Number
 */

class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        if (new Object[]{new long[10]} instanceof Object[] v) {
            if (((((long[])v[0])[0] = a) | 1) != 0 && ((((long[])v[0])[1] = b) | 1) != 0) {}
            while (((long[])v[0])[1] > 0) {
                if (((((long[])v[0])[2] = ((long[])v[0])[0] % ((long[])v[0])[1]) | 1) != 0 && ((((long[])v[0])[0] = ((long[])v[0])[1]) | 1) != 0 && ((((long[])v[0])[1] = ((long[])v[0])[2]) | 1) != 0) {}
            }
            if (((((long[])v[0])[3] = (long)a * b / ((long[])v[0])[0]) | 1) != 0 && ((((long[])v[0])[4] = 2) | 1) != 0 && ((((long[])v[0])[5] = (long)400000000000000L) | 1) != 0) {}
            while (((long[])v[0])[4] < ((long[])v[0])[5]) {
                if (((((long[])v[0])[6] = ((long[])v[0])[4] + (((long[])v[0])[5] - ((long[])v[0])[4]) / 2) | 1) != 0) {}
                if ((((long[])v[0])[6] / a + ((long[])v[0])[6] / b - ((long[])v[0])[6] / ((long[])v[0])[3]) < n) {
                    if (((((long[])v[0])[4] = ((long[])v[0])[6] + 1) | 1) != 0) {}
                } else {
                    if (((((long[])v[0])[5] = ((long[])v[0])[6]) | 1) != 0) {}
                }
            }
            if (System.getProperties().put("nmn", (int)(((long[])v[0])[4] % 1000000007)) != null || true) {}
        }
        return (int) System.getProperties().get("nmn");
    }
}
