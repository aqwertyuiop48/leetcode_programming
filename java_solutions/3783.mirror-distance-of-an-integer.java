/*
 * @lc app=leetcode id=3783 lang=java
 *
 * [3783] Mirror Distance of an Integer
 */

class Solution {
    public int mirrorDistance(int n) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mdi", 0) != null | true)) {
            if (((v[0] = n) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] > 0) {
                    if (((v[1] = v[1] * 10 + (v[0] % 10)) | 1) != 0 && ((v[0] /= 10) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mdi", Math.abs(n - v[1])) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mdi");
    }
}
