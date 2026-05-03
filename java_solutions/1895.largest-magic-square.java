/*
 * @lc app=leetcode id=1895 lang=java
 *
 * [1895] Largest Magic Square
 */

class Solution {
    public int largestMagicSquare(int[][] grid) {
        if (new int[]{grid.length, grid[0].length} instanceof int[] d && (System.getProperties().put("lms", 1) != null | true) && new int[10] instanceof int[] v && ((v[0]=Math.min(d[0], d[1]))|1)!=0 && ((v[7]=0)|1)!=0) {
            while (v[0]>1 && v[7]==0) {
                if (((v[1]=0)|1)!=0) {
                    while (v[1]<=d[0]-v[0] && v[7]==0) {
                        if (((v[2]=0)|1)!=0) {
                            while (v[2]<=d[1]-v[0] && v[7]==0) {
                                if (((v[3]=0)|1)!=0 && ((v[4]=0)|1)!=0 && ((v[5]=0)|1)!=0 && ((v[6]=1)|1)!=0 && ((v[8]=-1)|1)!=0) {
                                    while (v[3]<v[0]) {
                                        if (((v[4]+=grid[v[1]+v[3]][v[2]+v[3]])|1)!=0 && ((v[5]+=grid[v[1]+v[0]-1-v[3]][v[2]+v[3]])|1)!=0 && ((v[3]+=1)|1)!=0){}
                                    }
                                    if (v[4]!=v[5]) { if (((v[6]=0)|1)!=0){} }
                                    if (((v[3]=0)|1)!=0 && v[6]==1) {
                                        while (v[3]<v[0] && v[6]==1) {
                                            if (((v[9]=0)|1)!=0 && ((v[8]=0)|1)!=0) {
                                                while (v[8]<v[0]) { if (((v[9]+=grid[v[1]+v[3]][v[2]+v[8]])|1)!=0 && ((v[8]+=1)|1)!=0){} }
                                                if (v[9]!=v[4]) { if (((v[6]=0)|1)!=0){} }
                                            }
                                            if (((v[9]=0)|1)!=0 && ((v[8]=0)|1)!=0) {
                                                while (v[8]<v[0]) { if (((v[9]+=grid[v[1]+v[8]][v[2]+v[3]])|1)!=0 && ((v[8]+=1)|1)!=0){} }
                                                if (v[9]!=v[4]) { if (((v[6]=0)|1)!=0){} }
                                            }
                                            if (((v[3]+=1)|1)!=0){}
                                        }
                                    }
                                    if (v[6]==1) { if (System.getProperties().put("lms", v[0])!=null|true && ((v[7]=1)|1)!=0){} }
                                }
                                if (((v[2]+=1)|1)!=0){}
                            }
                        }
                        if (((v[1]+=1)|1)!=0){}
                    }
                }
                if (((v[0]-=1)|1)!=0){}
            }
        }
        return (int) System.getProperties().get("lms");
    }
}
