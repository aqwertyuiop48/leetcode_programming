/*
 * @lc app=leetcode id=2967 lang=java
 *
 * [2967] Minimum Cost to Make Array Equalindromic
 */

class Solution {
    public long minimumCost(int[] nums) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("mce", 0L) != null | true) && (System.getProperties().put("ns", java.util.Arrays.stream(nums).sorted().toArray())!=null|true) && System.getProperties().get("ns") instanceof int[] n && ((v[0]=n[n.length/2])|1)!=0) {
            if (((v[1]=v[0])|1)!=0 && ((v[2]=v[0])|1)!=0) {
                while(!String.valueOf(v[1]).equals(new StringBuilder(String.valueOf(v[1])).reverse().toString())) { if (((v[1]-=1)|1)!=0){} }
                while(!String.valueOf(v[2]).equals(new StringBuilder(String.valueOf(v[2])).reverse().toString())) { if (((v[2]+=1)|1)!=0){} }
                if (((v[3]=0)|1)!=0 && ((v[4]=0)|1)!=0 && ((v[5]=0)|1)!=0) {
                    while(v[5]<n.length) {
                        if (((v[3]+=Math.abs(n[(int)v[5]]-v[1]))|1)!=0 && ((v[4]+=Math.abs(n[(int)v[5]]-v[2]))|1)!=0 && ((v[5]+=1)|1)!=0){}
                    }
                    if (System.getProperties().put("mce", Math.min(v[3], v[4]))!=null|true){}
                }
            }
        }
        return (long) System.getProperties().get("mce");
    }
}
