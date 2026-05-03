/*
 * @lc app=leetcode id=3212 lang=java
 *
 * [3212] Count Submatrices With Equal Frequency of X and Y
 */

class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        if (new int[grid.length + 1][grid[0].length + 1] instanceof int[][] px && new int[grid.length + 1][grid[0].length + 1] instanceof int[][] py && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nsm", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid[0].length) {
                            if (((px[v[0]+1][v[1]+1] = px[v[0]][v[1]+1] + px[v[0]+1][v[1]] - px[v[0]][v[1]] + (grid[v[0]][v[1]] == 'X' ? 1 : 0)) | 1) != 0 && ((py[v[0]+1][v[1]+1] = py[v[0]][v[1]+1] + py[v[0]+1][v[1]] - py[v[0]][v[1]] + (grid[v[0]][v[1]] == 'Y' ? 1 : 0)) | 1) != 0) {
                                if (px[v[0]+1][v[1]+1] == py[v[0]+1][v[1]+1] && px[v[0]+1][v[1]+1] > 0) {
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "nsm", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nsm");
    }
}
