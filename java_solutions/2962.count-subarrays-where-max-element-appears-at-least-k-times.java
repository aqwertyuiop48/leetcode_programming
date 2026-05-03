/*
 * @lc app=leetcode id=2962 lang=java
 *
 * [2962] Count Subarrays Where Max Element Appears at Least K Times
 */

class Solution {
    public long countSubarrays(int[] nums, int k) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("cs", 0L) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<nums.length) {
                if (nums[(int)v[0]] > v[1]) { if (((v[1]=nums[(int)v[0]])|1)!=0){} }
                if (((v[0]+=1)|1)!=0){}
            }
            if (((v[0]=0)|1)!=0 && ((v[2]=0)|1)!=0 && ((v[3]=0)|1)!=0 && ((v[4]=0)|1)!=0) {
                while(v[2]<nums.length) {
                    if (nums[(int)v[2]] == v[1]) { if (((v[3]+=1)|1)!=0){} }
                    while(v[3]>=k) {
                        if (((v[4]+=nums.length - v[2])|1)!=0) {
                            if (nums[(int)v[0]] == v[1]) { if (((v[3]-=1)|1)!=0){} }
                            if (((v[0]+=1)|1)!=0){}
                        }
                    }
                    if (((v[2]+=1)|1)!=0){}
                }
                if (System.getProperties().put("cs", v[4])!=null|true){}
            }
        }
        return (long) System.getProperties().get("cs");
    }
}
