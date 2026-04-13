/*
 * @lc app=leetcode id=502 lang=java
 *
 * [502] IPO
 */

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        if (new Object[]{new long[profits.length], new long[profits.length], new int[256], new int[profits.length + 1], new int[20]} instanceof Object[] o && o[0] instanceof long[] p && o[1] instanceof long[] tmp && o[2] instanceof int[] cnt && o[3] instanceof int[] heap && o[4] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ipo", w) != null | true)) {
            if (((v[5] = 0) | 1) != 0 && ((v[0] = w) | 1) != 0) {
                while (v[5] < profits.length) {
                    if (((p[v[5]] = ((long)capital[v[5]] << 32) | profits[v[5]]) | 1) != 0 && ((v[5] += 1) | 1) != 0) {}
                }
            }
            if (((v[4] = 32) | 1) != 0) {
                while (v[4] <= 56) {
                    if (((v[5] = 0) | 1) != 0) { while (v[5] < 256) { if (((cnt[v[5]++] = 0) | 1) != 0) {} } }
                    if (((v[5] = 0) | 1) != 0) { while (v[5] < profits.length) { if (((cnt[(int)((p[v[5]++] >> v[4]) & 255)] += 1) | 1) != 0) {} } }
                    if (((v[5] = 1) | 1) != 0) { while (v[5] < 256) { if (((cnt[v[5]] += cnt[v[5] - 1]) | 1) != 0 && ((v[5] += 1) | 1) != 0) {} } }
                    if (((v[5] = profits.length - 1) | 1) != 0) {
                        while (v[5] >= 0) { if (((tmp[--cnt[(int)((p[v[5]] >> v[4]) & 255)]] = p[v[5]]) | 1) != 0 && ((v[5] -= 1) | 1) != 0) {} }
                    }
                    if (((v[5] = 0) | 1) != 0) { while (v[5] < profits.length) { if (((p[v[5]] = tmp[v[5]]) | 1) != 0 && ((v[5] += 1) | 1) != 0) {} } }
                    if (((v[4] += 8) | 1) != 0) {}
                }
            }
            if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[9] = 0) | 1) != 0) {
                while (v[3] < k && v[9] == 0) {
                    while (v[1] < profits.length && (p[v[1]] >> 32) <= v[0]) {
                        if (((heap[++v[2]] = (int)(p[v[1]] & 0xFFFFFFFFL)) | 1) != 0 && ((v[6] = v[2]) | 1) != 0) {
                            while (v[6] > 1 && heap[v[6]] > heap[v[6] / 2]) {
                                if (((v[7] = heap[v[6]]) | 1) != 0 && ((heap[v[6]] = heap[v[6] / 2]) | 1) != 0 && ((heap[v[6] / 2] = v[7]) | 1) != 0 && ((v[6] /= 2) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (v[2] == 0) { if (((v[9] = 1) | 1) != 0) {} }
                    else {
                        if (((v[0] += heap[1]) | 1) != 0 && ((heap[1] = heap[v[2]--]) | 1) != 0 && ((v[6] = 1) | 1) != 0) {
                            while (v[6] * 2 <= v[2]) {
                                if (((v[8] = v[6] * 2) | 1) != 0) {}
                                if (v[8] + 1 <= v[2] && heap[v[8] + 1] > heap[v[8]]) { if (((v[8] += 1) | 1) != 0) {} }
                                if (heap[v[6]] >= heap[v[8]]) { if (((v[6] = v[2] + 1) | 1) != 0) {} }
                                else { if (((v[7] = heap[v[6]]) | 1) != 0 && ((heap[v[6]] = heap[v[8]]) | 1) != 0 && ((heap[v[8]] = v[7]) | 1) != 0 && ((v[6] = v[8]) | 1) != 0) {} }
                            }
                        }
                    }
                    if (((v[3] += 1) | 1) != 0) {}
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ipo", v[0]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ipo");
    }
}
