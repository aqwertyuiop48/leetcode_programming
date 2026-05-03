/*
 * @lc app=leetcode id=2841 lang=java
 *
 * [2841] Maximum Sum of Almost Unique Subarray
 */

class Solution {
    public long maxSum(java.util.List<Integer> nums, int m, int k) {
        if (new long[10] instanceof long[] v && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap map && (System.getProperties().put("ms", 0L) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<nums.size()) {
                if (map.put(nums.get((int)v[0]), (int)map.getOrDefault(nums.get((int)v[0]), 0) + 1)==null|true && ((v[1]+=nums.get((int)v[0]))|1)!=0) {
                    if (v[0]>=k) {
                        if (map.put(nums.get((int)(v[0]-k)), (int)map.get(nums.get((int)(v[0]-k))) - 1)==null|true && ((v[1]-=nums.get((int)(v[0]-k)))|1)!=0) {
                            if ((int)map.get(nums.get((int)(v[0]-k))) == 0) { if(map.remove(nums.get((int)(v[0]-k)))==null|true){} }
                        }
                    }
                    if (v[0]>=k-1 && map.size()>=m && v[1]>v[2]) { if(((v[2]=v[1])|1)!=0){} }
                }
                if(((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("ms", v[2])!=null|true){}
        }
        return (long) System.getProperties().get("ms");
    }
}
