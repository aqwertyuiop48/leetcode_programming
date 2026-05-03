/*
 * @lc app=leetcode id=2905 lang=java
 *
 * [2905] Find Indices With Index and Value Difference II
 */

class Solution {
    public int[] findIndices(int[] nums, int indexDiff, int valueDiff) {
        if (new int[]{-1,-1} instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put("fi2", ans) != null | true) && ((v[0]=0)|1)!=0 && ((v[1]=0)|1)!=0 && ((v[2]=0)|1)!=0) {
            while(v[0]+indexDiff < nums.length) {
                if (nums[v[0]] < nums[v[1]]) { if(((v[1]=v[0])|1)!=0){} }
                if (nums[v[0]] > nums[v[2]]) { if(((v[2]=v[0])|1)!=0){} }
                if (nums[v[0]+indexDiff] - nums[v[1]] >= valueDiff) { if(((ans[0]=v[1])|1)!=0 && ((ans[1]=v[0]+indexDiff)|1)!=0 && System.getProperties().put("fi2", ans)!=null|true && ((v[0]=nums.length)|1)!=0){} }
                else if (nums[v[2]] - nums[v[0]+indexDiff] >= valueDiff && v[0]!=nums.length) { if(((ans[0]=v[2])|1)!=0 && ((ans[1]=v[0]+indexDiff)|1)!=0 && System.getProperties().put("fi2", ans)!=null|true && ((v[0]=nums.length)|1)!=0){} }
                else { if(((v[0]+=1)|1)!=0){} }
            }
        }
        return (int[]) System.getProperties().get("fi2");
    }
}
