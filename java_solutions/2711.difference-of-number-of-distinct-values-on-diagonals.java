/*
 * @lc app=leetcode id=2711 lang=java
 *
 * [2711] Difference of Number of Distinct Values on Diagonals
 */

class Solution {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        if (new int[]{grid.length, grid[0].length} instanceof int[] dim && new int[dim[0]][dim[1]] instanceof int[][] ans && new int[10] instanceof int[] v && (System.getProperties().put("ddv", ans) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<dim[0]) {
                if(((v[1]=0)|1)!=0) {
                    while(v[1]<dim[1]) {
                        if (new java.util.HashSet<Integer>() instanceof java.util.HashSet tl && new java.util.HashSet<Integer>() instanceof java.util.HashSet br && ((v[2]=1)|1)!=0) {
                            while(v[0]-v[2]>=0 && v[1]-v[2]>=0) { if(tl.add(grid[v[0]-v[2]][v[1]-v[2]])|true && ((v[2]+=1)|1)!=0){} }
                            if (((v[2]=1)|1)!=0) {
                                while(v[0]+v[2]<dim[0] && v[1]+v[2]<dim[1]) { if(br.add(grid[v[0]+v[2]][v[1]+v[2]])|true && ((v[2]+=1)|1)!=0){} }
                            }
                            if (((ans[v[0]][v[1]] = Math.abs(tl.size() - br.size()))|1)!=0){}
                        }
                        if(((v[1]+=1)|1)!=0){}
                    }
                }
                if(((v[0]+=1)|1)!=0){}
            }
        }
        return (int[][]) System.getProperties().get("ddv");
    }
}
