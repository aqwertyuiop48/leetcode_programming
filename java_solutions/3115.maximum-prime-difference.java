/*
 * @lc app=leetcode id=3115 lang=java
 *
 * [3115] Maximum Prime Difference
 */

class Solution {
    public int maximumPrimeDifference(int[] nums) {
        if (new int[105] instanceof int[] isP && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mpd", 0) != null | true)) {
            if (((v[0] = 2) | 1) != 0) {
                while (v[0] <= 100) { if (((isP[v[0]] = 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 2) | 1) != 0) {
                    while (v[0] * v[0] <= 100) {
                        if (isP[v[0]] == 1) {
                            if (((v[1] = v[0] * v[0]) | 1) != 0) {
                                while (v[1] <= 100) { if (((isP[v[1]] = 0) | 1) != 0 && ((v[1] += v[0]) | 1) != 0) {} }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (isP[nums[v[0]]] == 1) {
                            if (v[1] == -1) { if (((v[1] = v[0]) | 1) != 0) {} }
                            if (((v[2] = v[0]) | 1) != 0) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mpd", v[2] - v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mpd");
    }
}
