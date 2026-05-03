/*
 * @lc app=leetcode id=3281 lang=java
 *
 * [3281] Maximize Score of Numbers in Ranges
 */

class Solution {
    public int maxPossibleScore(int[] start, int d) {
        if (new int[start.length] instanceof int[] s && new int[10] instanceof int[] v && new long[10] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "mps", 0) != null | true)) {
            if (new Object[]{new int[256], new int[start.length]} instanceof Object[] o && o[0] instanceof int[] cnt && o[1] instanceof int[] tmp && ((v[0] = 0) | 1) != 0) {
                while (v[0] <= 24) {
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < 256) { if (((cnt[v[1]++] = 0) | 1) != 0) {} } }
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < start.length) { if (((cnt[(start[v[1]++] >> v[0]) & 255] += 1) | 1) != 0) {} } }
                    if (((v[1] = 1) | 1) != 0) { while (v[1] < 256) { if (((cnt[v[1]] += cnt[v[1] - 1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} } }
                    if (((v[1] = start.length - 1) | 1) != 0) {
                        while (v[1] >= 0) { if (((tmp[--cnt[(start[v[1]] >> v[0]) & 255]] = start[v[1]]) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} }
                    }
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < start.length) { if (((start[v[1]] = tmp[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} } }
                    if (((v[0] += 8) | 1) != 0) {}
                }
            }
            if (((lv[0] = 0) | 1) != 0 && ((lv[1] = 2000000000L) | 1) != 0) {
                while (lv[0] <= lv[1]) {
                    if (((lv[2] = lv[0] + (lv[1] - lv[0]) / 2L) | 1) != 0 && ((lv[3] = start[0]) | 1) != 0 && ((v[0] = 1) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
                        while (v[0] < start.length && v[1] == 1) {
                            if (lv[3] + lv[2] > start[v[0]] + d) { if (((v[1] = 0) | 1) != 0) {} }
                            else { if (((lv[3] = Math.max((long)start[v[0]], lv[3] + lv[2])) | 1) != 0) {} }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if (v[1] == 1) { if (((lv[4] = lv[2]) | 1) != 0 && ((lv[0] = lv[2] + 1L) | 1) != 0) {} }
                        else { if (((lv[1] = lv[2] - 1L) | 1) != 0) {} }
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mps", (int)lv[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mps");
    }
}
