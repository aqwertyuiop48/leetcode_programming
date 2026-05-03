/*
 * @lc app=leetcode id=1020 lang=java
 *
 * [1020] Number of Enclaves
 */

class Solution {
    public int numEnclaves(int[][] grid) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("ne", 0) != null | true)) {
            if (new java.util.function.Function[1] instanceof java.util.function.Function[] f && (f[0] = p -> ((int[])p)[0] >= 0 && ((int[])p)[0] < grid.length && ((int[])p)[1] >= 0 && ((int[])p)[1] < grid[0].length && grid[((int[])p)[0]][((int[])p)[1]] == 1 ? (((grid[((int[])p)[0]][((int[])p)[1]] = 0) | 1) != 0 && (boolean)f[0].apply(new int[]{((int[])p)[0]+1, ((int[])p)[1]}) | true && (boolean)f[0].apply(new int[]{((int[])p)[0]-1, ((int[])p)[1]}) | true && (boolean)f[0].apply(new int[]{((int[])p)[0], ((int[])p)[1]+1}) | true && (boolean)f[0].apply(new int[]{((int[])p)[0], ((int[])p)[1]-1}) | true) : true) != null && ((v[0] = 0) | 1) != 0) {
                while (v[0] < grid.length) { if ((boolean)f[0].apply(new int[]{v[0], 0}) | true && (boolean)f[0].apply(new int[]{v[0], grid[0].length - 1}) | true && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) { while (v[0] < grid[0].length) { if ((boolean)f[0].apply(new int[]{0, v[0]}) | true && (boolean)f[0].apply(new int[]{grid.length - 1, v[0]}) | true && ((v[0] += 1) | 1) != 0) {} } }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < grid.length) {
                        if (((v[2] = 0) | 1) != 0) { while (v[2] < grid[0].length) { if (grid[v[0]][v[2]++] == 1) { if (((v[1] += 1) | 1) != 0) {} } } }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("ne", v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("ne");
    }
}
