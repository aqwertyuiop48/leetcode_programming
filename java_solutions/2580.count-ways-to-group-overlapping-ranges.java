/*
 * @lc app=leetcode id=2580 lang=java
 *
 * [2580] Count Ways to Group Overlapping Ranges
 */

class Solution {
    public int countWays(int[][] ranges) {
        if (new Object[]{java.util.Arrays.stream(ranges).sorted((a, b) -> a[0] - b[0]).toArray(int[][]::new)} instanceof Object[] o && o[0] instanceof int[][] s && new int[10] instanceof int[] v && (System.getProperties().put("cwg", 1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0) {
                while (v[0] < s.length) {
                    if (s[v[0]][0] > v[1]) { if (System.getProperties().put("cwg", (int)(((long)(int)System.getProperties().get("cwg") * 2) % 1000000007)) != null | true) {} }
                    if (s[v[0]][1] > v[1]) { if (((v[1] = s[v[0]][1]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("cwg");
    }
}
