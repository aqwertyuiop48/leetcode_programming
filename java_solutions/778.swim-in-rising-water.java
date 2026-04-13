/*
 * @lc app=leetcode id=778 lang=java
 *
 * [778] Swim in Rising Water
 */

class Solution {
    public int swimInWater(int[][] grid) {
        if (new int[]{0, 0, 0, 0, 0, grid.length, 0, 0} instanceof int[] v && new Object[]{new PriorityQueue<int[]>((a,b)->Integer.compare(a[2],b[2])), new boolean[grid.length][grid.length], new int[][]{{0,1},{1,0},{0,-1},{-1,0}}} instanceof Object[] obj) {
            while (v[0] < 2) {
                if (v[0] == 0) {
                    if (((PriorityQueue<int[]>)obj[0]).offer(new int[]{0, 0, grid[0][0]}) || true) {
                        if ((((boolean[][])obj[1])[0][0] = true) || true) {
                            if (((v[0] = 1) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 1) {
                    if (!((PriorityQueue<int[]>)obj[0]).isEmpty()) {
                        if (new Object[]{((PriorityQueue<int[]>)obj[0]).poll()} instanceof Object[] curr) {
                            if (((v[1] = ((int[])curr[0])[0]) | 1) != 0 && ((v[2] = ((int[])curr[0])[1]) | 1) != 0 && ((v[6] = Math.max(v[6], ((int[])curr[0])[2])) | 1) != 0) {
                                if (v[1] == v[5] - 1 && v[2] == v[5] - 1) {
                                    if (((v[0] = 2) | 1) != 0) {}
                                } else {
                                    if (((v[3] = 0) | 1) != 0) {
                                        while (v[3] < 4) {
                                            if (((v[4] = v[1] + ((int[][])obj[2])[v[3]][0]) | 1) != 0 && ((v[7] = v[2] + ((int[][])obj[2])[v[3]][1]) | 1) != 0) {
                                                if (v[4] >= 0 && v[4] < v[5] && v[7] >= 0 && v[7] < v[5] && !((boolean[][])obj[1])[v[4]][v[7]]) {
                                                    if ((((boolean[][])obj[1])[v[4]][v[7]] = true) || true) {
                                                        if (((PriorityQueue<int[]>)obj[0]).offer(new int[]{v[4], v[7], grid[v[4]][v[7]]}) || true) {}
                                                    }
                                                }
                                            }
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (((v[0] = 2) | 1) != 0) {}
                    }
                }
            }
            if (((grid[0][0] = v[6]) | 1) != 0) {}
        }
        return grid[0][0];
    }
}
