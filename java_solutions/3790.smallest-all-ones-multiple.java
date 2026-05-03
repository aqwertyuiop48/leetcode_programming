/*
 * @lc app=leetcode id=3790 lang=java
 *
 * [3790] Smallest All-Ones Multiple
 */

class Solution {
    public int minAllOneMultiple(int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "som", -1) != null | true)) {
            if (k % 2 != 0 && k % 5 != 0) {
                if (((v[0] = 1) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
                    while (v[0] % k != 0) {
                        if (((v[0] = (v[0] * 10 + 1) % k) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "som", v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "som");
    }
}
