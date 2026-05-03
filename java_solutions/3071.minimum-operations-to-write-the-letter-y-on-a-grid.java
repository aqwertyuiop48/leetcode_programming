/*
 * @lc app=leetcode id=3071 lang=java
 *
 * [3071] Minimum Operations to Write the Letter Y on a Grid
 */

class Solution {
    public int minimumOperationsToWriteY(int[][] grid) {
        if (new int[15] instanceof int[] v && new int[3] instanceof int[] cntY && new int[3] instanceof int[] cntN && (System.getProperties().put(Thread.currentThread().getId() + "mow", 999999) != null | true)) {
            if (((v[0] = grid.length) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[1] < v[0]) {
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] < v[0]) {
                            if ((v[1] <= v[0] / 2 && (v[1] == v[2] || v[1] + v[2] == v[0] - 1)) || (v[1] > v[0] / 2 && v[2] == v[0] / 2)) {
                                if (((cntY[grid[v[1]][v[2]]] += 1) | 1) != 0) {}
                            } else {
                                if (((cntN[grid[v[1]][v[2]]] += 1) | 1) != 0) {}
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < 3) {
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < 3) {
                                if (v[1] != v[2]) {
                                    if (((v[3] = (cntY[0] + cntY[1] + cntY[2] - cntY[v[1]]) + (cntN[0] + cntN[1] + cntN[2] - cntN[v[2]])) | 1) != 0) {
                                        if (v[3] < (int)System.getProperties().get(Thread.currentThread().getId() + "mow")) {
                                            if (System.getProperties().put(Thread.currentThread().getId() + "mow", v[3]) != null | true) {}
                                        }
                                    }
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mow");
    }
}
