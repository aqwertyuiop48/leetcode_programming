/*
 * @lc app=leetcode id=2919 lang=java
 *
 * [2919] Minimum Increment Operations to Make Array Beautiful
 */

class Solution {
    public long minIncrementOperations(int[] nums, int k) {
        if (new long[3] instanceof long[] dp && new int[10] instanceof int[] v && (System.getProperties().put("mio", 0L) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<3) { if (((dp[v[0]] = Math.max(0, k - nums[v[0]]))|1)!=0 && ((v[0]+=1)|1)!=0){} }
            if (((v[0]=3)|1)!=0) {
                while(v[0]<nums.length) {
                    if (new long[]{Math.min(dp[0], Math.min(dp[1], dp[2])) + Math.max(0, k - nums[v[0]])} instanceof long[] t) {
                        if (((dp[0]=dp[1])|1)!=0 && ((dp[1]=dp[2])|1)!=0 && ((dp[2]=t[0])|1)!=0 && ((v[0]+=1)|1)!=0){}
                    }
                }
                if (System.getProperties().put("mio", Math.min(dp[0], Math.min(dp[1], dp[2])))!=null|true){}
            }
        }
        return (long) System.getProperties().get("mio");
    }
}
