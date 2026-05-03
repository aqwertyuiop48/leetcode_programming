/*
 * @lc app=leetcode id=2501 lang=java
 *
 * [2501] Longest Square Streak in an Array
 */

class Solution {
    public int longestSquareStreak(int[] nums) {
        if (new int[100005] instanceof int[] f && new int[10] instanceof int[] v && (System.getProperties().put("lss", -1) != null | true)) {
            if (new Object[]{java.util.Arrays.stream(nums).sorted().toArray()} instanceof Object[] o && o[0] instanceof int[] n && ((v[0] = 0) | 1) != 0) {
                while (v[0] < n.length) { if (((f[n[v[0]++]] = 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < n.length) {
                        if (((v[1] = n[v[0]]) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                            while ((long)v[1] * v[1] <= 100000 && f[v[1] * v[1]] == 1) { if (((v[1] *= v[1]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                            if (v[2] >= 2 && v[2] > (int)System.getProperties().get("lss")) { if (System.getProperties().put("lss", v[2]) != null | true) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("lss");
    }
}
