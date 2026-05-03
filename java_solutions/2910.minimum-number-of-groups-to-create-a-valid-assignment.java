/*
 * @lc app=leetcode id=2910 lang=java
 *
 * [2910] Minimum Number of Groups to Create a Valid Assignment
 */

class Solution {
    public int minGroupsForValidAssignment(int[] nums) {
        if (new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap m && new int[10] instanceof int[] v && (System.getProperties().put("mng", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<nums.length) { if (m.put(nums[v[0]], (int)m.getOrDefault(nums[v[0]], 0) + 1)==null|true && ((v[0]+=1)|1)!=0){} }
            if (((v[1]=nums.length)|1)!=0 && m.values().iterator() instanceof java.util.Iterator it1) {
                while(it1.hasNext()) { if (((v[2]=(int)it1.next())|1)!=0 && v[2]<v[1]) { if (((v[1]=v[2])|1)!=0){} } }
                if (((v[3]=0)|1)!=0) {
                    while(v[1]>=1 && v[3]==0) {
                        if (((v[4]=0)|1)!=0 && ((v[5]=1)|1)!=0 && m.values().iterator() instanceof java.util.Iterator it2) {
                            while(it2.hasNext() && v[5]==1) {
                                if (((v[6]=(int)it2.next())|1)!=0 && ((v[7]=v[6]/(v[1]+1))|1)!=0 && ((v[8]=v[6]%(v[1]+1))|1)!=0) {
                                    if (v[8]==0) { if (((v[4]+=v[7])|1)!=0){} }
                                    else if (v[1]-v[8]<=v[7]) { if (((v[4]+=v[7]+1)|1)!=0){} }
                                    else { if (((v[5]=0)|1)!=0){} }
                                }
                            }
                            if (v[5]==1) { if (System.getProperties().put("mng", v[4])!=null|true && ((v[3]=1)|1)!=0){} }
                        }
                        if (((v[1]-=1)|1)!=0){}
                    }
                }
            }
        }
        return (int) System.getProperties().get("mng");
    }
}
