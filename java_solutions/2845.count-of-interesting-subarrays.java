/*
 * @lc app=leetcode id=2845 lang=java
 *
 * [2845] Count of Interesting Subarrays
 */

class Solution {
    public long countInterestingSubarrays(java.util.List<Integer> nums, int modulo, int k) {
        if (new long[10] instanceof long[] v && new java.util.HashMap<Integer, Long>() instanceof java.util.HashMap m && m.put(0, 1L)==null|true && (System.getProperties().put("cis", 0L) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<nums.size()) {
                if (((v[1]=(v[1]+(nums.get((int)v[0])%modulo==k?1:0))%modulo)|1)!=0 && ((v[2]=(v[1]-k+modulo)%modulo)|1)!=0) {
                    if (((v[3]+=(long)m.getOrDefault((int)v[2], 0L))|1)!=0 && m.put((int)v[1], (long)m.getOrDefault((int)v[1], 0L) + 1L)==null|true){}
                }
                if(((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("cis", v[3])!=null|true){}
        }
        return (long) System.getProperties().get("cis");
    }
}
