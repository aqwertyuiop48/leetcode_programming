/*
 * @lc app=leetcode id=3370 lang=java
 *
 * [3370] Smallest Number With All Set Bits
 */

class Solution {
    public int smallestNumber(int n) {
        if (new int[2] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "snwa", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] < n) { if (((v[0] = v[0] * 2 + 1) | 1) != 0) {} }
                if (System.getProperties().put(Thread.currentThread().getId() + "snwa", v[0]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "snwa");
    }
}
