/*
 * @lc app=leetcode id=3133 lang=java
 *
 * [3133] Minimum Array End
 */

class Solution {
    public long minEnd(int n, int x) {
        if (new long[5] instanceof long[] lv && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mae", 0L) != null | true)) {
            if (((lv[0] = x) | 1) != 0 && ((lv[1] = n - 1) | 1) != 0 && ((lv[2] = 1) | 1) != 0) {
                while (lv[1] > 0) {
                    if ((lv[0] & lv[2]) == 0) {
                        if (((lv[0] |= (lv[1] & 1) * lv[2]) | 1) != 0 && ((lv[1] >>= 1) | 1) != 0) {}
                    }
                    if (((lv[2] <<= 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mae", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mae");
    }
}
