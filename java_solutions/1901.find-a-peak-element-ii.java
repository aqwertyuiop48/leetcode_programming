/*
 * @lc app=leetcode id=1901 lang=java
 *
 * [1901] Find a Peak Element II
 */

class Solution {
    public int[] findPeakGrid(int[][] mat) {
        if (new int[2] instanceof int[] ans && (System.getProperties().put("fpg", ans) != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0 && ((v[1]=mat.length-1)|1)!=0) {
            while (v[0]<=v[1]) {
                if (((v[2]=v[0]+(v[1]-v[0])/2)|1)!=0 && ((v[3]=0)|1)!=0 && ((v[4]=0)|1)!=0) {
                    while (v[3]<mat[0].length) {
                        if (mat[v[2]][v[3]]>mat[v[2]][v[4]]) { if (((v[4]=v[3])|1)!=0){} }
                        if (((v[3]+=1)|1)!=0){}
                    }
                    if (((v[5]=v[2]>0?mat[v[2]-1][v[4]]:-1)|1)!=0 && ((v[6]=v[2]<mat.length-1?mat[v[2]+1][v[4]]:-1)|1)!=0) {
                        if (mat[v[2]][v[4]]>v[5] && mat[v[2]][v[4]]>v[6]) { if (((ans[0]=v[2])|1)!=0 && ((ans[1]=v[4])|1)!=0 && ((v[0]=mat.length)|1)!=0){} }
                        else if (v[5]>mat[v[2]][v[4]]) { if (((v[1]=v[2]-1)|1)!=0){} }
                        else { if (((v[0]=v[2]+1)|1)!=0){} }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("fpg");
    }
}
