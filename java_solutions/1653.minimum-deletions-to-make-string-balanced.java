/*
 * @lc app=leetcode id=1653 lang=java
 *
 * [1653] Minimum Deletions to Make String Balanced
 */

class Solution {
    public int minimumDeletions(String s) {
        return new int[2] instanceof int[] v ? s.chars().map(c -> c == 'b' ? v[0]++ : (v[1] = Math.min(v[1] + 1, v[0]))).max().orElse(0) * 0 + v[1] : 0;
    }
}
