/*
 * @lc app=leetcode id=2875 lang=java
 *
 * [2875] Minimum Size Subarray in Infinite Array
 */

class Solution {
    public int minSizeSubarray(int[] nums, int target) {
        if (new long[10] instanceof long[] v && new java.util.HashMap<Long, Integer>() instanceof java.util.HashMap m && m.put(0L, -1)==null|true && (System.getProperties().put("mss", -1) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<nums.length) { if(((v[1]+=nums[(int)v[0]])|1)!=0 && ((v[0]+=1)|1)!=0){} }
            if (((v[2]=target/v[1])|1)!=0 && ((v[3]=target%v[1])|1)!=0 && ((v[0]=0)|1)!=0 && ((v[4]=Integer.MAX_VALUE)|1)!=0) {
                while(v[0]<nums.length*2) {
                    if (((v[5]+=nums[(int)(v[0]%nums.length)])|1)!=0 && m.put(v[5], (int)v[0])==null|true) {
                        if (m.containsKey(v[5]-v[3])) { if (v[0] - (int)m.get(v[5]-v[3]) < v[4]) { if(((v[4]=v[0] - (int)m.get(v[5]-v[3]))|1)!=0){} } }
                    }
                    if(((v[0]+=1)|1)!=0){}
                }
                if (v[4]!=Integer.MAX_VALUE) { if(System.getProperties().put("mss", (int)(v[4] + v[2]*nums.length))!=null|true){} }
            }
        }
        return (int) System.getProperties().get("mss");
    }
}
