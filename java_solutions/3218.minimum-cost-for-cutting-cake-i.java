/*
 * @lc app=leetcode id=3218 lang=java
 *
 * [3218] Minimum Cost for Cutting Cake I
 */

class Solution {
    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mcc", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < horizontalCut.length) {
                    if (((v[1] = v[0] + 1) | 1) != 0) {
                        while (v[1] < horizontalCut.length) {
                            if (horizontalCut[v[0]] < horizontalCut[v[1]]) {
                                if (((v[2] = horizontalCut[v[0]]) | 1) != 0 && ((horizontalCut[v[0]] = horizontalCut[v[1]]) | 1) != 0 && ((horizontalCut[v[1]] = v[2]) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < verticalCut.length) {
                    if (((v[1] = v[0] + 1) | 1) != 0) {
                        while (v[1] < verticalCut.length) {
                            if (verticalCut[v[0]] < verticalCut[v[1]]) {
                                if (((v[2] = verticalCut[v[0]]) | 1) != 0 && ((verticalCut[v[0]] = verticalCut[v[1]]) | 1) != 0 && ((verticalCut[v[1]] = v[2]) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0 && ((v[3] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                while (v[0] < horizontalCut.length || v[1] < verticalCut.length) {
                    if (v[1] == verticalCut.length || (v[0] < horizontalCut.length && horizontalCut[v[0]] > verticalCut[v[1]])) {
                        if (((v[4] += horizontalCut[v[0]] * v[3]) | 1) != 0 && ((v[2] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    } else {
                        if (((v[4] += verticalCut[v[1]] * v[2]) | 1) != 0 && ((v[3] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mcc", v[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mcc");
    }
}
