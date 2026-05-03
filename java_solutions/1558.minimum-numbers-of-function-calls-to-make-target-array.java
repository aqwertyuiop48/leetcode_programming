/*
 * @lc app=leetcode id=1558 lang=java
 *
 * [1558] Minimum Numbers of Function Calls to Make Target Array
 */

class Solution {
    public int minOperations(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mno", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<nums.length) {
                if (nums[v[0]]>0 && ((v[1]+=Integer.bitCount(nums[v[0]]))|1)!=0 && ((v[2]=32-Integer.numberOfLeadingZeros(nums[v[0]])-1)|1)!=0 && v[2]>v[3]) {
                    if (((v[3]=v[2])|1)!=0){}
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("mno", v[1]+v[3])!=null|true){}
        }
        return (int) System.getProperties().get("mno");
    }
}
