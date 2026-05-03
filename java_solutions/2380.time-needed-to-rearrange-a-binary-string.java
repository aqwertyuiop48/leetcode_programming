/*
 * @lc app=leetcode id=2380 lang=java
 *
 * [2380] Time Needed to Rearrange a Binary String
 */

class Solution {
    public int secondsToRemoveOccurrences(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sn", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] < s.length()) {
                if (s.charAt(v[0]) == '0') { if (((v[1] += 1) | 1) != 0) {} }
                else if (v[1] > 0) { if (((v[2] = Math.max(v[2] + 1, v[1])) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "sn", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "sn");
    }
}
