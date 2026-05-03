/*
 * @lc app=leetcode id=1959 lang=java
 *
 * [1959] Minimum Total Space Wasted With K Resizing Operations
 */

class Solution {
    public int minSpaceWastedKResizing(int[] nums, int k) {
        if (new int[]{nums.length, k+1} instanceof int[] dim && new int[dim[0]][dim[1]] instanceof int[][] dp && (System.getProperties().put("msw", 0)!=null|true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while (v[0]<dim[0]) {
                if (((v[1]=0)|1)!=0) { while (v[1]<dim[1]) { if (((dp[v[0]][v[1]]=1000000000)|1)!=0 && ((v[1]+=1)|1)!=0){} } }
                if (((v[0]+=1)|1)!=0){}
            }
            if (((v[0]=0)|1)!=0) {
                while (v[0]<dim[0]) {
                    if (((v[1]=0)|1)!=0 && ((v[2]=0)|1)!=0 && ((v[3]=0)|1)!=0) {
                        while (v[1]<=v[0]) { if (nums[v[0]-v[1]]>v[2]) { if (((v[2]=nums[v[0]-v[1]])|1)!=0){} } if (((v[3]+=nums[v[0]-v[1]])|1)!=0 && ((v[1]+=1)|1)!=0){} }
                        if (((dp[v[0]][0] = v[2]*(v[0]+1)-v[3])|1)!=0){}
                    }
                    if (((v[1]=1)|1)!=0) {
                        while (v[1]<=k) {
                            if (((v[2]=0)|1)!=0 && ((v[3]=0)|1)!=0 && ((v[4]=0)|1)!=0) {
                                while (v[2]<=v[0]) {
                                    if (nums[v[0]-v[2]]>v[3]) { if (((v[3]=nums[v[0]-v[2]])|1)!=0){} }
                                    if (((v[4]+=nums[v[0]-v[2]])|1)!=0) {
                                        if (v[0]-v[2]>0) { if (dp[v[0]-v[2]-1][v[1]-1]+v[3]*(v[2]+1)-v[4] < dp[v[0]][v[1]]) { if (((dp[v[0]][v[1]] = dp[v[0]-v[2]-1][v[1]-1]+v[3]*(v[2]+1)-v[4])|1)!=0){} } }
                                        else { if (v[3]*(v[2]+1)-v[4] < dp[v[0]][v[1]]) { if (((dp[v[0]][v[1]] = v[3]*(v[2]+1)-v[4])|1)!=0){} } }
                                    }
                                    if (((v[2]+=1)|1)!=0){}
                                }
                            }
                            if (((v[1]+=1)|1)!=0){}
                        }
                    }
                    if (((v[0]+=1)|1)!=0){}
                }
            }
            if (System.getProperties().put("msw", dp[dim[0]-1][k])!=null|true){}
        }
        return (int) System.getProperties().get("msw");
    }
}
