/*
 * @lc app=leetcode id=3770 lang=java
 *
 * [3770] Largest Prime from Consecutive Prime Sum
 */

class Solution {
    public int largestPrime(int n) {
        if (new int[10] instanceof int[] v && new boolean[500005] instanceof boolean[] isP && (System.getProperties().put(Thread.currentThread().getId() + "lp", 0) != null | true) && ((v[0] = 2) | 1) != 0) {
            while (v[0] <= 500000) { if (((isP[v[0]] = true) | true) && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 2) | 1) != 0) {
                while (v[0] * v[0] <= 500000) {
                    if (isP[v[0]] && ((v[1] = v[0] * v[0]) | 1) != 0) {
                        while (v[1] <= 500000) { if (((isP[v[1]] = false) == false | true) && ((v[1] += v[0]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 2) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] <= 500000 && v[2] == 0) {
                    if (isP[v[0]]) {
                        if (((v[1] += v[0]) | 1) != 0) {
                            if (v[1] > 500000) { if (((v[2] = 1) | 1) != 0) {} }
                            else if (v[1] <= n && isP[v[1]]) { if (((v[3] = v[1]) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "lp", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lp");
    }
}
