/*
 * @lc app=leetcode id=1905 lang=java
 *
 * [1905] Count Sub Islands
 */

class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("csi", 0) != null | true) && ((v[0]=0)|1)!=0 && new int[]{0,1,0,-1,0} instanceof int[] d) {
            while (v[0]<grid2.length) {
                if (((v[1]=0)|1)!=0) {
                    while (v[1]<grid2[0].length) {
                        if (grid2[v[0]][v[1]]==1 && new java.util.LinkedList<int[]>() instanceof java.util.LinkedList q && q.add(new int[]{v[0],v[1]})|true && ((grid2[v[0]][v[1]]=0)|1)!=0 && ((v[2]=1)|1)!=0) {
                            while (!q.isEmpty()) {
                                if (q.poll() instanceof int[] p) {
                                    if (grid1[p[0]][p[1]]==0) { if (((v[2]=0)|1)!=0){} }
                                    if (((v[3]=0)|1)!=0) {
                                        while (v[3]<4) {
                                            if (((v[4]=p[0]+d[v[3]])|1)!=0 && ((v[5]=p[1]+d[v[3]+1])|1)!=0 && v[4]>=0 && v[4]<grid2.length && v[5]>=0 && v[5]<grid2[0].length && grid2[v[4]][v[5]]==1) {
                                                if (((grid2[v[4]][v[5]]=0)|1)!=0 && q.add(new int[]{v[4],v[5]})|true){}
                                            }
                                            if (((v[3]+=1)|1)!=0){}
                                        }
                                    }
                                }
                            }
                            if (v[2]==1) { if (((v[6]+=1)|1)!=0){} }
                        }
                        if (((v[1]+=1)|1)!=0){}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("csi", v[6])!=null|true){}
        }
        return (int) System.getProperties().get("csi");
    }
}
