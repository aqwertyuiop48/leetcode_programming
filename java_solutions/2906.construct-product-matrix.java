/*
 * @lc app=leetcode id=2906 lang=java
 *
 * [2906] Construct Product Matrix
 */

class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        if (new int[]{grid.length, grid[0].length} instanceof int[] dim && new int[dim[0]][dim[1]] instanceof int[][] ans && new long[10] instanceof long[] v && (System.getProperties().put("pm", ans) != null | true) && ((v[0]=1)|1)!=0 && ((v[1]=0)|1)!=0) {
            while(v[1]<dim[0]) {
                if (((v[2]=0)|1)!=0) {
                    while(v[2]<dim[1]) {
                        if (((ans[(int)v[1]][(int)v[2]] = (int)v[0])|1)!=0 && ((v[0] = (v[0] * grid[(int)v[1]][(int)v[2]]) % 12345)|1)!=0 && ((v[2]+=1)|1)!=0){}
                    }
                }
                if (((v[1]+=1)|1)!=0){}
            }
            if (((v[0]=1)|1)!=0 && ((v[1]=dim[0]-1)|1)!=0) {
                while(v[1]>=0) {
                    if (((v[2]=dim[1]-1)|1)!=0) {
                        while(v[2]>=0) {
                            if (((ans[(int)v[1]][(int)v[2]] = (int)((ans[(int)v[1]][(int)v[2]] * v[0]) % 12345))|1)!=0 && ((v[0] = (v[0] * grid[(int)v[1]][(int)v[2]]) % 12345)|1)!=0 && ((v[2]-=1)|1)!=0){}
                        }
                    }
                    if (((v[1]-=1)|1)!=0){}
                }
            }
        }
        return (int[][]) System.getProperties().get("pm");
    }
}
