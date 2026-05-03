/*
 * @lc app=leetcode id=3645 lang=java
 *
 * [3645] Maximum Total from Optimal Activation Order
 */

class Solution {
    public long maxTotal(int[] value, int[] limit) {
        if (new long[value.length] instanceof long[] combined && new long[5] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mtoa", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < value.length) {
                if (((combined[(int)v[0]] = ((long)limit[(int)v[0]] << 32) | value[(int)v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if ((combined = java.util.Arrays.stream(combined).sorted().toArray()) != null && ((v[0] = combined.length - 1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] >= 0) {
                    if (((v[3] = combined[(int)v[0]] >>> 32) | 1) != 0 && ((v[4] = combined[(int)v[0]] & 0xFFFFFFFFL) | 1) != 0) {
                        if (v[3] != v[1]) { if (((v[1] = v[3]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {} }
                        if (v[2] < v[1]) { if (((v[2] += 1) | 1) != 0 && (System.getProperties().put(Thread.currentThread().getId() + "mtoa", (long)System.getProperties().get(Thread.currentThread().getId() + "mtoa") + v[4]) != null | true)) {} }
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mtoa");
    }
}
