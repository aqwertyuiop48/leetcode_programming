/*
 * @lc app=leetcode id=2405 lang=java
 *
 * [2405] Optimal Partition of String
 */

class Solution {
    public int partitionString(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ps", 1) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
            while (v[0] < s.length()) {
                if (((v[3] = 1 << (s.charAt(v[0]) - 'a')) | 1) != 0) {
                    if ((v[1] & v[3]) != 0) { if (((v[2] += 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {} }
                    if (((v[1] |= v[3]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ps", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ps");
    }
}
