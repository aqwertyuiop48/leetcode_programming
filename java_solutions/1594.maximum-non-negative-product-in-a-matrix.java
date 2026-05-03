/*
 * @lc app=leetcode id=1594 lang=java
 *
 * [1594] Maximum Non Negative Product in a Matrix
 */

class Solution {
    public int maxProductPath(int[][] grid) {
        if (new int[]{grid.length, grid[0].length} instanceof int[] dim && new long[dim[0]][dim[1]] instanceof long[][] mx && new long[dim[0]][dim[1]] instanceof long[][] mn && new int[10] instanceof int[] v && (System.getProperties().put("mnp", -1) != null | true) && (((mx[0][0]=grid[0][0])|1L)!=0L) && (((mn[0][0]=grid[0][0])|1L)!=0L) && ((v[0]=1)|1)!=0) {
            while (v[0] < dim[0]) { if ((((mx[v[0]][0] = mx[v[0]-1][0] * grid[v[0]][0])|1L)!=0L) && (((mn[v[0]][0] = mx[v[0]][0])|1L)!=0L) && ((v[0]+=1)|1)!=0){} }
            if (((v[0]=1)|1)!=0) {
                while (v[0] < dim[1]) { if ((((mx[0][v[0]] = mx[0][v[0]-1] * grid[0][v[0]])|1L)!=0L) && (((mn[0][v[0]] = mx[0][v[0]])|1L)!=0L) && ((v[0]+=1)|1)!=0){} }
                if (((v[0]=1)|1)!=0) {
                    while (v[0] < dim[0]) {
                        if (((v[1]=1)|1)!=0) {
                            while (v[1] < dim[1]) {
                                if (grid[v[0]][v[1]] >= 0) {
                                    if ((((mx[v[0]][v[1]] = Math.max(mx[v[0]-1][v[1]], mx[v[0]][v[1]-1]) * grid[v[0]][v[1]])|1L)!=0L) && (((mn[v[0]][v[1]] = Math.min(mn[v[0]-1][v[1]], mn[v[0]][v[1]-1]) * grid[v[0]][v[1]])|1L)!=0L)){}
                                } else {
                                    if ((((mx[v[0]][v[1]] = Math.min(mn[v[0]-1][v[1]], mn[v[0]][v[1]-1]) * grid[v[0]][v[1]])|1L)!=0L) && (((mn[v[0]][v[1]] = Math.max(mx[v[0]-1][v[1]], mx[v[0]][v[1]-1]) * grid[v[0]][v[1]])|1L)!=0L)){}
                                }
                                if (((v[1]+=1)|1)!=0){}
                            }
                        }
                        if (((v[0]+=1)|1)!=0){}
                    }
                    if (System.getProperties().put("mnp", mx[dim[0]-1][dim[1]-1] >= 0 ? (int)(mx[dim[0]-1][dim[1]-1] % 1000000007) : -1) != null | true){}
                }
            }
        }
        return (int) System.getProperties().get("mnp");
    }
}
