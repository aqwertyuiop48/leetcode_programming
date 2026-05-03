/*
 * @lc app=leetcode id=2996 lang=java
 *
 * [2996] Smallest Missing Integer Greater Than Sequential Prefix Sum
 */

class Solution {
    public int missingInteger(int[] nums) {
        if (new java.util.HashSet<Integer>() instanceof java.util.HashSet s && new int[10] instanceof int[] v && (System.getProperties().put("smi", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<nums.length) { if (s.add(nums[v[0]])|true && ((v[0]+=1)|1)!=0){} }
            if (((v[1]=nums[0])|1)!=0 && ((v[0]=1)|1)!=0 && ((v[2]=1)|1)!=0) {
                while(v[0]<nums.length && v[2]==1) {
                    if (nums[v[0]] == nums[v[0]-1]+1) { if (((v[1]+=nums[v[0]])|1)!=0){} }
                    else { if (((v[2]=0)|1)!=0){} }
                    if (((v[0]+=1)|1)!=0){}
                }
                while(s.contains(v[1])) { if (((v[1]+=1)|1)!=0){} }
                if (System.getProperties().put("smi", v[1])!=null|true){}
            }
        }
        return (int) System.getProperties().get("smi");
    }
}
