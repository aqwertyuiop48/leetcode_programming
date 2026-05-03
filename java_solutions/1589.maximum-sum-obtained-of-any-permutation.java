/*
 * @lc app=leetcode id=1589 lang=java
 *
 * [1589] Maximum Sum Obtained of Any Permutation
 */

class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        if (new int[nums.length+1] instanceof int[] c && new int[10] instanceof int[] v && (System.getProperties().put("ms", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while (v[0] < requests.length) { if (((c[requests[v[0]][0]]+=1)|1)!=0 && ((c[requests[v[0]][1]+1]-=1)|1)!=0 && ((v[0]+=1)|1)!=0){} }
            if (((v[0]=1)|1)!=0) {
                while (v[0] < nums.length) { if (((c[v[0]]+=c[v[0]-1])|1)!=0 && ((v[0]+=1)|1)!=0){} }
                if ((System.getProperties().put("sc", java.util.Arrays.stream(c).limit(nums.length).sorted().toArray())!=null|true) && (System.getProperties().put("sn", java.util.Arrays.stream(nums).sorted().toArray())!=null|true) && System.getProperties().get("sc") instanceof int[] sc && System.getProperties().get("sn") instanceof int[] sn && ((v[0]=0)|1)!=0) {
                    while (v[0] < nums.length) { if (((v[1] = (int)((v[1] + (long)sc[v[0]] * sn[v[0]]) % 1000000007L))|1)!=0 && ((v[0]+=1)|1)!=0){} }
                    if (System.getProperties().put("ms", v[1]) != null | true){}
                }
            }
        }
        return (int) System.getProperties().get("ms");
    }
}
