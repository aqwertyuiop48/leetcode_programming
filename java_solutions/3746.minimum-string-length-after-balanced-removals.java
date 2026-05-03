/*
 * @lc app=leetcode id=3746 lang=java
 *
 * [3746] Minimum String Length After Balanced Removals
 */

class Solution {
    public int minLengthAfterRemovals(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mslbr", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (s.charAt(v[0]) == 'a') { if (((v[1] += 1) | 1) != 0) {} }
                    if (s.charAt(v[0]) == 'b') { if (((v[2] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mslbr", Math.abs(v[1] - v[2])) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mslbr");
    }
}
