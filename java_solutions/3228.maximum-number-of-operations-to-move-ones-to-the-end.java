/*
 * @lc app=leetcode id=3228 lang=java
 *
 * [3228] Maximum Number of Operations to Move Ones to the End
 */

class Solution {
    public int maxOperations(String s) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mo", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (s.charAt(v[0]) == '1') {
                        if (((v[1] += 1) | 1) != 0) {}
                    } else if (v[0] > 0 && s.charAt(v[0] - 1) == '1') {
                        if (((v[2] += v[1]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mo", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mo");
    }
}
