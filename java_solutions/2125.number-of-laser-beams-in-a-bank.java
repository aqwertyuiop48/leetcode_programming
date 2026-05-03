/*
 * @lc app=leetcode id=2125 lang=java
 *
 * [2125] Number of Laser Beams in a Bank
 */

class Solution {
    public int numberOfBeams(String[] bank) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nob", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < bank.length) {
                if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                    while (v[2] < bank[v[0]].length()) {
                        if (bank[v[0]].charAt(v[2]) == '1') { if (((v[3] += 1) | 1) != 0) {} }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                    if (v[3] > 0) {
                        if (((v[4] += v[1] * v[3]) | 1) != 0 && ((v[1] = v[3]) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "nob", v[4]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nob");
    }
}
