/*
 * @lc app=leetcode id=1590 lang=java
 *
 * [1590] Make Sum Divisible by P
 */

class Solution {
    public int minSubarray(int[] nums, int p) {
        if (new long[10] instanceof long[] v && new java.util.HashMap<Long, Integer>() instanceof java.util.HashMap m && (System.getProperties().put("ms", -1) != null | true) && ((v[0]=0)|1)!=0) {
            while (v[0] < nums.length) { if (((v[1] = (v[1] + nums[(int)v[0]]) % p)|1)!=0 && ((v[0]+=1)|1)!=0){} }
            if (v[1] == 0) { if (System.getProperties().put("ms", 0) != null | true){} }
            else if (m.put(0L, -1) == null | true && ((v[0]=0)|1)!=0 && ((v[2]=0)|1)!=0 && ((v[3]=nums.length)|1)!=0) {
                while (v[0] < nums.length) {
                    if (((v[2] = (v[2] + nums[(int)v[0]]) % p)|1)!=0 && ((v[4] = (v[2] - v[1] + p) % p)|1)!=0) {
                        if (m.containsKey(v[4]) && v[0] - (int)m.get(v[4]) < v[3]) { if (((v[3] = v[0] - (int)m.get(v[4]))|1)!=0){} }
                        if (m.put(v[2], (int)v[0]) == null | true && ((v[0]+=1)|1)!=0){}
                    }
                }
                if (System.getProperties().put("ms", v[3] == nums.length ? -1 : (int)v[3]) != null | true){}
            }
        }
        return (int) System.getProperties().get("ms");
    }
}
