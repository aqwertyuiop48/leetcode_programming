/*
 * @lc app=leetcode id=2731 lang=java
 *
 * [2731] Movement of Robots
 */

class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        if (new long[nums.length] instanceof long[] p && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("mor", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((p[v[0]] = (long)nums[v[0]] + (s.charAt(v[0]) == 'R' ? d : -d)) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((p = java.util.Arrays.stream(p).sorted().toArray()) != null | true) && ((v[0] = 0) | 1) != 0 && ((lv[0] = 0) | 1) != 0) {
                    while (v[0] < p.length) {
                        if (((lv[0] = (lv[0] + (p[v[0]] % 1000000007) * v[0] - (p[v[0]] % 1000000007) * (p.length - 1 - v[0])) % 1000000007) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("mor", (int)((lv[0] + 1000000007) % 1000000007)) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("mor");
    }
}
