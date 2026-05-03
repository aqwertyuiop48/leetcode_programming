/*
 * @lc app=leetcode id=1995 lang=java
 *
 * [1995] Count Special Quadruplets
 */

class Solution {
    public int countQuadruplets(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("csq", 0)!=null|true) && ((v[0]=0)|1)!=0) {
            while (v[0]<nums.length) {
                if (((v[1]=v[0]+1)|1)!=0) {
                    while (v[1]<nums.length) {
                        if (((v[2]=v[1]+1)|1)!=0) {
                            while (v[2]<nums.length) {
                                if (((v[3]=v[2]+1)|1)!=0) {
                                    while (v[3]<nums.length) {
                                        if (nums[v[0]]+nums[v[1]]+nums[v[2]]==nums[v[3]]) { if (((v[4]+=1)|1)!=0){} }
                                        if (((v[3]+=1)|1)!=0){}
                                    }
                                }
                                if (((v[2]+=1)|1)!=0){}
                            }
                        }
                        if (((v[1]+=1)|1)!=0){}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("csq", v[4])!=null|true){}
        }
        return (int) System.getProperties().get("csq");
    }
}
