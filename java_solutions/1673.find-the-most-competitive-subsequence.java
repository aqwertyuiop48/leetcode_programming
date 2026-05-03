/*
 * @lc app=leetcode id=1673 lang=java
 *
 * [1673] Find the Most Competitive Subsequence
 */

class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        if (new int[k] instanceof int[] st && new int[10] instanceof int[] v && (System.getProperties().put("mcs", st) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    while (v[1] > 0 && st[v[1] - 1] > nums[v[0]] && v[1] - 1 + nums.length - v[0] >= k) { if (((v[1] -= 1) | 1) != 0) {} }
                    if (v[1] < k) { if (((st[v[1]++] = nums[v[0]]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get("mcs");
    }
}
