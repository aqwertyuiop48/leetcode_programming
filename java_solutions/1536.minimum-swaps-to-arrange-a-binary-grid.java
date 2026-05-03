/*
 * @lc app=leetcode id=1536 lang=java
 *
 * [1536] Minimum Swaps to Arrange a Binary Grid
 */

class Solution {
    public int minSwaps(int[][] grid) {
        if (new int[grid.length] instanceof int[] a && (System.getProperties().put("ms", 0) != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while(v[0]<grid.length) {
                if (((v[1]=0)|1)!=0 && ((v[2]=grid.length-1)|1)!=0) {
                    while(v[2]>=0) {
                        if (grid[v[0]][v[2]]==0) { if (((v[1]+=1)|1)!=0){} }
                        else { if (((v[2]=-1)|1)!=0){} }
                        if (v[2]!=-1) { if (((v[2]-=1)|1)!=0){} }
                    }
                    if (((a[v[0]]=v[1])|1)!=0){}
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (((v[0]=0)|1)!=0 && ((v[7]=0)|1)!=0) {
                while(v[0]<grid.length && v[7]==0) {
                    if (((v[1]=grid.length-1-v[0])|1)!=0 && ((v[2]=-1)|1)!=0 && ((v[3]=v[0])|1)!=0) {
                        while(v[3]<grid.length && v[2]==-1) {
                            if (a[v[3]]>=v[1]) { if (((v[2]=v[3])|1)!=0){} }
                            if (((v[3]+=1)|1)!=0){}
                        }
                        if (v[2]==-1) { if (((v[7]=1)|1)!=0 && System.getProperties().put("ms", -1)!=null|true){} }
                        else {
                            if (((v[3]=v[2])|1)!=0) {
                                while(v[3]>v[0]) {
                                    if (((v[4]=a[v[3]])|1)!=0 && ((a[v[3]]=a[v[3]-1])|1)!=0 && ((a[v[3]-1]=v[4])|1)!=0 && ((v[5]+=1)|1)!=0 && ((v[3]-=1)|1)!=0){}
                                }
                            }
                        }
                    }
                    if (((v[0]+=1)|1)!=0){}
                }
            }
            if (v[7]==0) { if (System.getProperties().put("ms", v[5])!=null|true){} }
        }
        return (int) System.getProperties().get("ms");
    }
}
