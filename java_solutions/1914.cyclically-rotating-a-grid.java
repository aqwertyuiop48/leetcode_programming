/*
 * @lc app=leetcode id=1914 lang=java
 *
 * [1914] Cyclically Rotating a Grid
 */

class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        if (new int[]{grid.length, grid[0].length} instanceof int[] d && (System.getProperties().put("rg", grid) != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while (v[0] < Math.min(d[0], d[1])/2) {
                if (new java.util.ArrayList<Integer>() instanceof java.util.ArrayList l && ((v[1]=v[0])|1)!=0) {
                    while (v[1]<d[1]-v[0]-1) { if (l.add(grid[v[0]][v[1]++])|true){} }
                    if (((v[1]=v[0])|1)!=0) { while (v[1]<d[0]-v[0]-1) { if (l.add(grid[v[1]++][d[1]-v[0]-1])|true){} } }
                    if (((v[1]=d[1]-v[0]-1)|1)!=0) { while (v[1]>v[0]) { if (l.add(grid[d[0]-v[0]-1][v[1]--])|true){} } }
                    if (((v[1]=d[0]-v[0]-1)|1)!=0) { while (v[1]>v[0]) { if (l.add(grid[v[1]--][v[0]])|true){} } }
                    if (((v[2]=k%l.size())|1)!=0 && ((v[1]=v[0])|1)!=0) {
                        while (v[1]<d[1]-v[0]-1) { if (((grid[v[0]][v[1]++]=(int)l.get(v[2]))|1)!=0 && ((v[2]=(v[2]+1)%l.size())|1)!=0){} }
                        if (((v[1]=v[0])|1)!=0) { while (v[1]<d[0]-v[0]-1) { if (((grid[v[1]++][d[1]-v[0]-1]=(int)l.get(v[2]))|1)!=0 && ((v[2]=(v[2]+1)%l.size())|1)!=0){} } }
                        if (((v[1]=d[1]-v[0]-1)|1)!=0) { while (v[1]>v[0]) { if (((grid[d[0]-v[0]-1][v[1]--]=(int)l.get(v[2]))|1)!=0 && ((v[2]=(v[2]+1)%l.size())|1)!=0){} } }
                        if (((v[1]=d[0]-v[0]-1)|1)!=0) { while (v[1]>v[0]) { if (((grid[v[1]--][v[0]]=(int)l.get(v[2]))|1)!=0 && ((v[2]=(v[2]+1)%l.size())|1)!=0){} } }
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
        }
        return (int[][]) System.getProperties().get("rg");
    }
}
