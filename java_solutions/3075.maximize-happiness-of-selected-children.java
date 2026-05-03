/*
 * @lc app=leetcode id=3075 lang=java
 *
 * [3075] Maximize Happiness of Selected Children
 */

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        if (new Object[]{new int[happiness.length], new int[256]} instanceof Object[] o && o[0] instanceof int[] tmp && o[1] instanceof int[] cnt && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "mhs", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= 24) {
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < 256) { if (((cnt[v[1]++] = 0) | 1) != 0) {} } }
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < happiness.length) { if (((cnt[(happiness[v[1]++] >> v[0]) & 255] += 1) | 1) != 0) {} } }
                    if (((v[1] = 254) | 1) != 0) { while (v[1] >= 0) { if (((cnt[v[1]] += cnt[v[1] + 1]) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} } }
                    if (((v[1] = happiness.length - 1) | 1) != 0) {
                        while (v[1] >= 0) { if (((tmp[--cnt[(happiness[v[1]] >> v[0]) & 255]] = happiness[v[1]]) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} }
                    }
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < happiness.length) { if (((happiness[v[1]] = tmp[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} } }
                    if (((v[0] += 8) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < k) {
                    if (happiness[v[0]] - v[0] > 0) { if (((lv[0] += happiness[v[0]] - v[0]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mhs", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mhs");
    }
}
