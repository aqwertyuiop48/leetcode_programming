/*
 * @lc app=leetcode id=1567 lang=java
 *
 * [1567] Maximum Length of Subarray With Positive Product
 */

class Solution {
    public int getMaxLen(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("ml", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while (v[0] < nums.length) {
                if (nums[v[0]] == 0) {
                    if (((v[1]=0)|1)!=0 && ((v[2]=0)|1)!=0){}
                } else if (nums[v[0]] > 0) {
                    if (((v[1]+=1)|1)!=0 && ((v[2]=v[2]>0?v[2]+1:0)|1)!=0){}
                } else {
                    if (((v[3]=v[1])|1)!=0 && ((v[1]=v[2]>0?v[2]+1:0)|1)!=0 && ((v[2]=v[3]+1)|1)!=0){}
                }
                if (v[1] > v[4]) { if (((v[4]=v[1])|1)!=0){} }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("ml", v[4]) != null | true) {}
        }
        return (int) System.getProperties().get("ml");
    }
}
