/*
 * @lc app=leetcode id=3453 lang=java
 *
 * [3453] Separate Squares I
 */

class Solution {
    public double separateSquares(int[][] squares) {
        if (new double[5] instanceof double[] dv && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ss1", 0.0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && (dv[0] = 0.0) == 0.0 && (dv[1] = 2000000000.0) > 0 && (dv[2] = 0.0) == 0.0) {
                while (v[0] < squares.length) { if ((dv[2] += (double)squares[v[0]][2] * squares[v[0]][2]) >= 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < 60) {
                        if ((dv[3] = dv[0] + (dv[1] - dv[0]) / 2.0) >= 0 && (dv[4] = 0.0) == 0.0 && ((v[1] = 0) | 1) != 0) {
                            while (v[1] < squares.length) {
                                if (dv[3] > squares[v[1]][1]) {
                                    if (dv[3] >= squares[v[1]][1] + squares[v[1]][2]) { if ((dv[4] += (double)squares[v[1]][2] * squares[v[1]][2]) >= 0) {} }
                                    else { if ((dv[4] += (dv[3] - squares[v[1]][1]) * squares[v[1]][2]) >= 0) {} }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                            if (dv[4] >= dv[2] / 2.0) { if ((dv[1] = dv[3]) >= 0) {} }
                            else { if ((dv[0] = dv[3]) >= 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "ss1", dv[1]) != null | true) {}
                }
            }
        }
        return (double) System.getProperties().get(Thread.currentThread().getId() + "ss1");
    }
}
