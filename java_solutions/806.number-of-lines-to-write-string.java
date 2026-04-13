/*
 * @lc app=leetcode id=806 lang=java
 *
 * [806] Number of Lines To Write String
 */

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        return s.chars().boxed().reduce(new int[]{1, 0}, (state, c) -> widths[c - 97] + state[1] > 100 ? new int[]{state[0] + 1, widths[c - 97]} : new int[]{state[0], state[1] + widths[c - 97]}, (a, b) -> a);
    }
}
