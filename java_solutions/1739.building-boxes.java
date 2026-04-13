/*
 * @lc app=leetcode id=1739 lang=java
 *
 * [1739] Building Boxes
 */

class Solution {
    public int minimumBoxes(int n) {
        if (new int[]{0, 1, 0, 0, 1} instanceof int[] v) {
            while (v[0] == 0) {
                if (v[1] <= n) {
                    if (v[4] <= v[2] && v[1] <= n) {
                        if (((v[4] += 1) | 1) != 0 && ((v[3] += 1) | 1) != 0 && ((v[1] += v[4] - 1) | 1) != 0) {}
                    } else {
                        if (((v[2] += 1) | 1) != 0 && ((v[4] = 1) | 1) != 0) {}
                    }
                } else {
                    if (((n = v[3]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                }
            }
        }
        return n;
    }
}
