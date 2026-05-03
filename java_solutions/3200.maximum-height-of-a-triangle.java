/*
 * @lc app=leetcode id=3200 lang=java
 *
 * [3200] Maximum Height of a Triangle
 */

class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mht", 0) != null | true)) {
            if (((v[0] = red) | 1) != 0 && ((v[1] = blue) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                while (v[0] >= 0 && v[1] >= 0) {
                    if (v[2] % 2 == 0) { if (((v[0] -= v[3]) | 1) != 0) {} } else { if (((v[1] -= v[3]) | 1) != 0) {} }
                    if (v[0] >= 0 && v[1] >= 0) { if (((v[2] += 1) | 1) != 0 && ((v[3] += 1) | 1) != 0) {} }
                }
                if (((v[4] = red) | 1) != 0 && ((v[5] = blue) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((v[7] = 1) | 1) != 0) {
                    while (v[4] >= 0 && v[5] >= 0) {
                        if (v[6] % 2 == 0) { if (((v[5] -= v[7]) | 1) != 0) {} } else { if (((v[4] -= v[7]) | 1) != 0) {} }
                        if (v[4] >= 0 && v[5] >= 0) { if (((v[6] += 1) | 1) != 0 && ((v[7] += 1) | 1) != 0) {} }
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mht", Math.max(v[2], v[6])) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mht");
    }
}
