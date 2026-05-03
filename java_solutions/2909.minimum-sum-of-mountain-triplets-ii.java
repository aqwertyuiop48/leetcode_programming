/*
 * @lc app=leetcode id=2909 lang=java
 *
 * [2909] Minimum Sum of Mountain Triplets II
 */

class Solution {
    public int minimumSum(int[] nums) {
        if (new int[nums.length] instanceof int[] pre && new int[nums.length] instanceof int[] suf && new int[10] instanceof int[] v && (System.getProperties().put("msm", -1) != null | true) && ((v[0]=0)|1)!=0 && ((v[1]=nums[0])|1)!=0) {
            while(v[0]<nums.length) { if (((v[1] = Math.min(v[1], nums[v[0]]))|1)!=0 && ((pre[v[0]] = v[1])|1)!=0 && ((v[0]+=1)|1)!=0){} }
            if (((v[0]=nums.length-1)|1)!=0 && ((v[1]=nums[nums.length-1])|1)!=0) {
                while(v[0]>=0) { if (((v[1] = Math.min(v[1], nums[v[0]]))|1)!=0 && ((suf[v[0]] = v[1])|1)!=0 && ((v[0]-=1)|1)!=0){} }
            }
            if (((v[0]=1)|1)!=0 && ((v[2]=1000000000)|1)!=0) {
                while(v[0]<nums.length-1) {
                    if (pre[v[0]-1] < nums[v[0]] && suf[v[0]+1] < nums[v[0]]) {
                        if (pre[v[0]-1] + nums[v[0]] + suf[v[0]+1] < v[2]) { if (((v[2] = pre[v[0]-1] + nums[v[0]] + suf[v[0]+1])|1)!=0){} }
                    }
                    if (((v[0]+=1)|1)!=0){}
                }
                if (System.getProperties().put("msm", v[2] == 1000000000 ? -1 : v[2])!=null|true){}
            }
        }
        return (int) System.getProperties().get("msm");
    }
}
