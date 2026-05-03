/*
 * @lc app=leetcode id=3468 lang=java
 *
 * [3468] Find the Number of Copy Arrays
 */

class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ca", 0) != null | true)) {
            if (((v[0] = bounds[0][0]) | 1) != 0 && ((v[1] = bounds[0][1]) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                while (v[2] < original.length) {
                    if (((v[3] = original[v[2]] - original[v[2]-1]) | 1) != 0) {
                        if (((v[0] += v[3]) | 1) != 0 && ((v[1] += v[3]) | 1) != 0) {
                            if (v[0] < bounds[v[2]][0]) { if (((v[0] = bounds[v[2]][0]) | 1) != 0) {} }
                            if (v[1] > bounds[v[2]][1]) { if (((v[1] = bounds[v[2]][1]) | 1) != 0) {} }
                            if (v[0] > v[1]) { if (((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {} }
                        }
                    }
                    if (((v[2] += 1) | 1) != 0) {}
                }
                if (v[1] >= v[0]) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "ca", v[1] - v[0] + 1) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ca");
    }
}
