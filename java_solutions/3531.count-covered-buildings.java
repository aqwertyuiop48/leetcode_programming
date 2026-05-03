/*
 * @lc app=leetcode id=3531 lang=java
 *
 * [3531] Count Covered Buildings
 */

class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        if (new int[n + 1] instanceof int[] minX && new int[n + 1] instanceof int[] maxX && new int[n + 1] instanceof int[] minY && new int[n + 1] instanceof int[] maxY && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ccb", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= n) {
                    if (((minX[v[0]] = 2000000000) | 1) != 0 && ((maxX[v[0]] = -1) | 1) != 0 && ((minY[v[0]] = 2000000000) | 1) != 0 && ((maxY[v[0]] = -1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < buildings.length) {
                    if (((v[1] = buildings[v[0]][0]) | 1) != 0 && ((v[2] = buildings[v[0]][1]) | 1) != 0) {
                        if (v[1] < minX[v[2]]) { if (((minX[v[2]] = v[1]) | 1) != 0) {} }
                        if (v[1] > maxX[v[2]]) { if (((maxX[v[2]] = v[1]) | 1) != 0) {} }
                        if (v[2] < minY[v[1]]) { if (((minY[v[1]] = v[2]) | 1) != 0) {} }
                        if (v[2] > maxY[v[1]]) { if (((maxY[v[1]] = v[2]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] < buildings.length) {
                    if (((v[1] = buildings[v[0]][0]) | 1) != 0 && ((v[2] = buildings[v[0]][1]) | 1) != 0) {
                        if (v[1] > minX[v[2]] && v[1] < maxX[v[2]] && v[2] > minY[v[1]] && v[2] < maxY[v[1]]) {
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ccb", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ccb");
    }
}
