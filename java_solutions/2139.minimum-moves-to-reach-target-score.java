/*
 * @lc app=leetcode id=2139 lang=java
 *
 * [2139] Minimum Moves to Reach Target Score
 */

class Solution {
    public int minMoves(int target, int maxDoubles) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mm", 0) != null | true) && ((v[0] = target) | 1) != 0 && ((v[1] = maxDoubles) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] > 1) {
                if (v[1] == 0) {
                    if (((v[2] += v[0] - 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                } else if (v[0] % 2 == 0) {
                    if (((v[0] /= 2) | 1) != 0 && ((v[1] -= 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                } else {
                    if (((v[0] -= 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mm", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mm");
    }
}
