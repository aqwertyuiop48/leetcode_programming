/*
 * @lc app=leetcode id=2970 lang=java
 *
 * [2970] Count the Number of Incremovable Subarrays I
 */

class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("cis", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<nums.length) {
                if (((v[1]=v[0])|1)!=0) {
                    while(v[1]<nums.length) {
                        if (((v[2]=0)|1)!=0 && ((v[3]=-1)|1)!=0 && ((v[4]=1)|1)!=0) {
                            while(v[2]<nums.length && v[4]==1) {
                                if (v[2]<v[0] || v[2]>v[1]) {
                                    if (nums[v[2]] <= v[3]) { if (((v[4]=0)|1)!=0){} }
                                    if (((v[3]=nums[v[2]])|1)!=0){}
                                }
                                if (((v[2]+=1)|1)!=0){}
                            }
                            if (v[4]==1) { if (((v[5]+=1)|1)!=0){} }
                        }
                        if (((v[1]+=1)|1)!=0){}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("cis", v[5])!=null|true){}
        }
        return (int) System.getProperties().get("cis");
    }
}
