/*
 * @lc app=leetcode id=3809 lang=java
 *
 * [3809] Best Reachable Tower
 */

class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "brt", new int[] {-1, -1}) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0 && ((v[2] = -1) | 1) != 0) {
                while (v[0] < towers.length) {
                    if (Math.abs(towers[v[0]][0] - center[0]) + Math.abs(towers[v[0]][1] - center[1]) <= radius) {
                        if (v[2] < towers[v[0]][2] || (v[2] == towers[v[0]][2] && (towers[v[0]][0] < towers[v[1]][0] || (towers[v[0]][0] == towers[v[1]][0] && towers[v[0]][1] < towers[v[1]][1])))) {
                            if (((v[1] = v[0]) | 1) != 0 && ((v[2] = towers[v[0]][2]) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[1] != -1) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "brt", new int[] {towers[v[1]][0], towers[v[1]][1]}) != null | true) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "brt");
    }
}
