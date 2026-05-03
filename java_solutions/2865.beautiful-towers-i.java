/*
 * @lc app=leetcode id=2865 lang=java
 *
 * [2865] Beautiful Towers I
 */

class Solution {
    public long maximumSumOfHeights(int[] maxHeights) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("bt", 0L) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<maxHeights.length) {
                if (((v[1]=maxHeights[(int)v[0]])|1)!=0 && ((v[2]=v[1])|1)!=0 && ((v[3]=v[0]-1)|1)!=0) {
                    while(v[3]>=0) {
                        if (maxHeights[(int)v[3]] < v[2]) { if(((v[2]=maxHeights[(int)v[3]])|1)!=0){} }
                        if (((v[1]+=v[2])|1)!=0 && ((v[3]-=1)|1)!=0){}
                    }
                    if (((v[2]=maxHeights[(int)v[0]])|1)!=0 && ((v[3]=v[0]+1)|1)!=0) {
                        while(v[3]<maxHeights.length) {
                            if (maxHeights[(int)v[3]] < v[2]) { if(((v[2]=maxHeights[(int)v[3]])|1)!=0){} }
                            if (((v[1]+=v[2])|1)!=0 && ((v[3]+=1)|1)!=0){}
                        }
                    }
                    if (v[1] > v[4]) { if(((v[4]=v[1])|1)!=0){} }
                }
                if(((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("bt", v[4])!=null|true){}
        }
        return (long) System.getProperties().get("bt");
    }
}
