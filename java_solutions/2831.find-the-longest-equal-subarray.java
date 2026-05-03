/*
 * @lc app=leetcode id=2831 lang=java
 *
 * [2831] Find the Longest Equal Subarray
 */

class Solution {
    public int longestEqualSubarray(java.util.List<Integer> nums, int k) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap m && (System.getProperties().put("les", 0) != null | true) && ((v[0]=0)|1)!=0 && ((v[1]=0)|1)!=0 && ((v[2]=0)|1)!=0) {
            while(v[1]<nums.size()) {
                if (m.put(nums.get(v[1]), (int)m.getOrDefault(nums.get(v[1]), 0) + 1)==null|true && ((v[3]=(int)m.get(nums.get(v[1])))|1)!=0) {
                    if (v[3]>v[2]) { if(((v[2]=v[3])|1)!=0){} }
                    if (v[1]-v[0]+1-v[2]>k) { if (m.put(nums.get(v[0]), (int)m.get(nums.get(v[0])) - 1)==null|true && ((v[0]+=1)|1)!=0){} }
                }
                if(((v[1]+=1)|1)!=0){}
            }
            if (System.getProperties().put("les", v[2])!=null|true){}
        }
        return (int) System.getProperties().get("les");
    }
}
