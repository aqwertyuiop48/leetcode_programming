/*
 * @lc app=leetcode id=3270 lang=java
 *
 * [3270] Find the Key of the Numbers
 */

class Solution {
    public int generateKey(int num1, int num2, int num3) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "gk", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                while (v[0] <= 1000) {
                    if (((v[1] = (num1 / v[0]) % 10) | 1) != 0 && ((v[2] = (num2 / v[0]) % 10) | 1) != 0 && ((v[3] = (num3 / v[0]) % 10) | 1) != 0) {
                        if (((v[5] = v[1]) | 1) != 0) {}
                        if (v[2] < v[5]) { if (((v[5] = v[2]) | 1) != 0) {} }
                        if (v[3] < v[5]) { if (((v[5] = v[3]) | 1) != 0) {} }
                        if (((v[4] += v[5] * v[0]) | 1) != 0) {}
                    }
                    if (((v[0] *= 10) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "gk", v[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "gk");
    }
}
