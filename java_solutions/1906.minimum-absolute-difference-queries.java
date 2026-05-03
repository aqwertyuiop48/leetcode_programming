/*
 * @lc app=leetcode id=1906 lang=java
 *
 * [1906] Minimum Absolute Difference Queries
 */

class Solution {
    public int[] minDifference(int[] nums, int[][] queries) {
        if (new int[nums.length+1][101] instanceof int[][] p && new int[queries.length] instanceof int[] ans && (System.getProperties().put("mdq", ans) != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while (v[0]<nums.length) {
                if (((v[1]=1)|1)!=0) {
                    while (v[1]<=100) { if (((p[v[0]+1][v[1]]=p[v[0]][v[1]])|1)!=0 && ((v[1]+=1)|1)!=0){} }
                }
                if (((p[v[0]+1][nums[v[0]]]+=1)|1)!=0 && ((v[0]+=1)|1)!=0){}
            }
            if (((v[0]=0)|1)!=0) {
                while (v[0]<queries.length) {
                    if (((v[2]=-1)|1)!=0 && ((v[3]=1000)|1)!=0 && ((v[1]=1)|1)!=0) {
                        while (v[1]<=100) {
                            if (p[queries[v[0]][1]+1][v[1]] - p[queries[v[0]][0]][v[1]] > 0) {
                                if (v[2]!=-1 && v[1]-v[2]<v[3]) { if (((v[3]=v[1]-v[2])|1)!=0){} }
                                if (((v[2]=v[1])|1)!=0){}
                            }
                            if (((v[1]+=1)|1)!=0){}
                        }
                        if (((ans[v[0]] = v[3]==1000?-1:v[3])|1)!=0){}
                    }
                    if (((v[0]+=1)|1)!=0){}
                }
            }
        }
        return (int[]) System.getProperties().get("mdq");
    }
}
