/*
 * @lc app=leetcode id=1992 lang=java
 *
 * [1992] Find All Groups of Farmland
 */

class Solution {
    public int[][] findFarmland(int[][] land) {
        if (new java.util.ArrayList<int[]>() instanceof java.util.ArrayList ans && (System.getProperties().put("faf", new int[0][0])!=null|true) && new int[]{land.length, land[0].length} instanceof int[] d && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while (v[0]<d[0]) {
                if (((v[1]=0)|1)!=0) {
                    while (v[1]<d[1]) {
                        if (land[v[0]][v[1]]==1 && (v[0]==0 || land[v[0]-1][v[1]]==0) && (v[1]==0 || land[v[0]][v[1]-1]==0)) {
                            if (((v[2]=v[0])|1)!=0 && ((v[3]=v[1])|1)!=0) {
                                while (v[2]<d[0] && land[v[2]][v[1]]==1) { if (((v[2]+=1)|1)!=0){} }
                                while (v[3]<d[1] && land[v[0]][v[3]]==1) { if (((v[3]+=1)|1)!=0){} }
                                if (ans.add(new int[]{v[0], v[1], v[2]-1, v[3]-1})|true){}
                            }
                        }
                        if (((v[1]+=1)|1)!=0){}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("faf", ans.toArray(new int[0][0]))!=null|true){}
        }
        return (int[][]) System.getProperties().get("faf");
    }
}
