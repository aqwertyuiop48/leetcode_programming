/*
 * @lc app=leetcode id=2033 lang=java
 *
 * [2033] Minimum Operations to Make a Uni-Value Grid
 */

class Solution {
    public int minOperations(int[][] grid, int x) {
        if (new int[grid.length * grid[0].length] instanceof int[] arr && new int[10] instanceof int[] v && (System.getProperties().put("mou", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if (((v[2] = 0) | 1) != 0) { while (v[2] < grid[0].length) { if (((arr[v[1]++] = grid[v[0]][v[2]++]) | 1) != 0) {} } }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (new Object[]{java.util.Arrays.stream(arr).sorted().toArray()} instanceof Object[] o && o[0] instanceof int[] s) {
                    if (((v[3] = s[v[1] / 2]) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[0] < v[1]) {
                            if (Math.abs(s[v[0]] - v[3]) % x != 0) { if (((v[4] = -1) | 1) != 0 && ((v[0] = v[1]) | 1) != 0) {} }
                            else { if (((v[4] += Math.abs(s[v[0]] - v[3]) / x) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                        }
                        if (System.getProperties().put("mou", v[4]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("mou");
    }
}
