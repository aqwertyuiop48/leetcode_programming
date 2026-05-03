/*
 * @lc app=leetcode id=3776 lang=java
 *
 * [3776] Minimum Moves to Balance Circular Array
 */

class Solution {
    public long minMoves(int[] balance) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mm", -1L) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < balance.length) { if (((v[1] += balance[(int)v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (v[1] >= 0 && ((v[0] = 0) | 1) != 0 && ((v[2] = -1) | 1) != 0) {
                while (v[0] < balance.length) {
                    if (balance[(int)v[0]] < 0) { if (((v[2] = v[0]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[2] == -1) { if (System.getProperties().put(Thread.currentThread().getId() + "mm", 0L) != null | true) {} }
                else if (((v[3] = 1) | 1) != 0 && ((v[4] = v[2]) | 1) != 0 && ((v[8] = 0) | 1) != 0 && ((v[9] = 0) | 1) != 0) {
                    while (v[9] == 0) {
                        if (((v[5] = ((v[4] - v[3]) % balance.length + balance.length) % balance.length) | 1) != 0 && ((v[6] = (v[4] + v[3]) % balance.length) | 1) != 0) {
                            if (v[5] == v[4] || v[6] == v[4]) { if (((v[9] = 1) | 1) != 0) {} }
                            else {
                                if (balance[(int)v[5]] >= -balance[(int)v[4]]) {
                                    if (((v[8] += v[3] * -balance[(int)v[4]]) | 1) != 0 && ((v[9] = 1) | 1) != 0 && System.getProperties().put(Thread.currentThread().getId() + "mm", v[8]) != null | true) {}
                                } else {
                                    if (((v[8] += v[3] * balance[(int)v[5]]) | 1) != 0 && ((balance[(int)v[4]] += balance[(int)v[5]]) | 1) != 0 && ((balance[(int)v[5]] = 0) | 1) != 0) {}
                                }
                                if (v[9] == 0 && v[5] != v[6]) {
                                    if (balance[(int)v[6]] >= -balance[(int)v[4]]) {
                                        if (((v[8] += v[3] * -balance[(int)v[4]]) | 1) != 0 && ((v[9] = 1) | 1) != 0 && System.getProperties().put(Thread.currentThread().getId() + "mm", v[8]) != null | true) {}
                                    } else {
                                        if (((v[8] += v[3] * balance[(int)v[6]]) | 1) != 0 && ((balance[(int)v[4]] += balance[(int)v[6]]) | 1) != 0 && ((balance[(int)v[6]] = 0) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                        if (v[9] == 0) { if (((v[3] += 1) | 1) != 0) {} }
                    }
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mm");
    }
}
