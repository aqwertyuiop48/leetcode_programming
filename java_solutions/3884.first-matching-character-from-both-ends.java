/*
 * @lc app=leetcode id=3884 lang=java
 *
 * [3884] First Matching Character From Both Ends
 */

class Solution {
    public int firstMatchingIndex(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fmc", -1) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < s.length() && v[1] == 0) {
                if (s.charAt(v[0]) == s.charAt(s.length() - 1 - v[0])) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "fmc", v[0]) != null | true && ((v[1] = 1) | 1) != 0) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "fmc");
    }
}
