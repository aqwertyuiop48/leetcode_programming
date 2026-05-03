/*
 * @lc app=leetcode id=1911 lang=java
 *
 * [1911] Maximum Alternating Subsequence Sum
 */

class Solution {
    public long maxAlternatingSum(int[] nums) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("mas", 0L) != null | true) && ((v[0]=0)|1)!=0) {
            while (v[0]<nums.length) {
                if (((v[3]=v[1])|1)!=0 && ((v[1]=Math.max(v[1], v[2]+nums[(int)v[0]]))|1)!=0 && ((v[2]=Math.max(v[2], v[3]-nums[(int)v[0]]))|1)!=0 && ((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("mas", v[1])!=null|true){}
        }
        return (long) System.getProperties().get("mas");
    }
}
