/*
 * @lc app=leetcode id=780 lang=java
 *
 * [780] Reaching Points
 */

class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        if (new int[]{0} instanceof int[] v) {
            while (v[0] == 0) {
                if (tx >= sx && ty >= sy) {
                    if (tx > ty) {
                        if (ty == sy) {
                            if (((tx = (tx - sx) % ty == 0 ? -1 : -2) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        } else {
                            if (((tx %= ty) | 1) != 0) {}
                        }
                    } else if (ty > tx) {
                        if (tx == sx) {
                            if (((tx = (ty - sy) % tx == 0 ? -1 : -2) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        } else {
                            if (((ty %= tx) | 1) != 0) {}
                        }
                    } else {
                        if (((tx = (tx == sx && ty == sy ? -1 : -2)) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else {
                    if (((tx = -2) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                }
            }
        }
        return tx == -1;
    }
}
