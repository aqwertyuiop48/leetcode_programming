/*
 * @lc app=leetcode id=765 lang=java
 *
 * [765] Couples Holding Hands
 */

class Solution {
    public int minSwapsCouples(int[] row) {
        if (new int[]{0, 0, 0, 0, 0} instanceof int[] v) {
            while (v[0] < 2) {
                if (v[0] == 0) {
                    if (v[1] < row.length) {
                        if (((v[2] = row[v[1]]) | 1) != 0) {
                            if (row[v[1] + 1] != (v[2] ^ 1)) {
                                if (((v[4] += 1) | 1) != 0) {
                                    if (((v[3] = v[1] + 2) | 1) != 0) {
                                        while (v[3] < row.length) {
                                            if (row[v[3]] == (v[2] ^ 1)) {
                                                if (((row[v[3]] = row[v[1] + 1]) | 1) != 0) {
                                                    if (((row[v[1] + 1] = v[2] ^ 1) | 1) != 0) {
                                                        if (((v[3] = row.length) | 1) != 0) {}
                                                    }
                                                }
                                            } else {
                                                if (((v[3] += 1) | 1) != 0) {}
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (((v[1] += 2) | 1) != 0) {}
                    } else {
                        if (((row[0] = v[4]) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                }
            }
        }
        return row.length > 0 ? row[0] : 0;
    }
}
