/*
 * @lc app=leetcode id=3301 lang=java
 *
 * [3301] Maximize the Total Height of Unique Towers
 */

class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        if (new int[maximumHeight.length] instanceof int[] tmp && new int[256] instanceof int[] cnt && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "mth", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= 24) {
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < 256) { if (((cnt[v[1]++] = 0) | 1) != 0) {} } }
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < maximumHeight.length) { if (((cnt[(maximumHeight[v[1]++] >> v[0]) & 255] += 1) | 1) != 0) {} } }
                    if (((v[1] = 254) | 1) != 0) { while (v[1] >= 0) { if (((cnt[v[1]] += cnt[v[1] + 1]) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} } }
                    if (((v[1] = maximumHeight.length - 1) | 1) != 0) {
                        while (v[1] >= 0) { if (((tmp[--cnt[(maximumHeight[v[1]] >> v[0]) & 255]] = maximumHeight[v[1]]) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} }
                    }
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < maximumHeight.length) { if (((maximumHeight[v[1]] = tmp[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} } }
                    if (((v[0] += 8) | 1) != 0) {}
                }
            }
            if (((lv[0] = maximumHeight[0]) | 1) != 0 && ((lv[1] = maximumHeight[0]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] < maximumHeight.length) {
                    if (((lv[2] = Math.min((long)maximumHeight[v[0]], lv[0] - 1)) | 1) != 0) {
                        if (lv[2] <= 0) {
                            if (System.getProperties().put(Thread.currentThread().getId() + "mth", -1L) != null | true) {
                                if (((v[0] = maximumHeight.length) | 1) != 0) {}
                            }
                        } else {
                            if (((lv[1] += lv[2]) | 1) != 0 && ((lv[0] = lv[2]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
                if ((long)System.getProperties().get(Thread.currentThread().getId() + "mth") != -1L) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "mth", lv[1]) != null | true) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mth");
    }
}
