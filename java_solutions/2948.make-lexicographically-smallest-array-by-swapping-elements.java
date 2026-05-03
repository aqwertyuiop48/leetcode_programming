/*
 * @lc app=leetcode id=2948 lang=java
 *
 * [2948] Make Lexicographically Smallest Array by Swapping Elements
 */

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        if (new int[nums.length][2] instanceof int[][] a && new int[10] instanceof int[] v && (System.getProperties().put("lsa", nums) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<nums.length) { if (((a[v[0]][0]=nums[v[0]])|1)!=0 && ((a[v[0]][1]=v[0])|1)!=0 && ((v[0]+=1)|1)!=0){} }
            if ((System.getProperties().put("sa", java.util.Arrays.stream(a).sorted((x,y)->Integer.compare(x[0],y[0])).toArray(int[][]::new))!=null|true) && System.getProperties().get("sa") instanceof int[][] sa && ((v[0]=0)|1)!=0) {
                while(v[0]<nums.length) {
                    if (((v[1]=v[0]+1)|1)!=0) {
                        while(v[1]<nums.length && sa[v[1]][0]-sa[v[1]-1][0]<=limit) { if (((v[1]+=1)|1)!=0){} }
                        if (new int[v[1]-v[0]] instanceof int[] p && ((v[2]=v[0])|1)!=0) {
                            while(v[2]<v[1]) { if (((p[v[2]-v[0]]=sa[v[2]][1])|1)!=0 && ((v[2]+=1)|1)!=0){} }
                            if ((System.getProperties().put("sp", java.util.Arrays.stream(p).sorted().toArray())!=null|true) && System.getProperties().get("sp") instanceof int[] sp && ((v[2]=v[0])|1)!=0) {
                                while(v[2]<v[1]) { if (((nums[sp[v[2]-v[0]]]=sa[v[2]][0])|1)!=0 && ((v[2]+=1)|1)!=0){} }
                            }
                        }
                        if (((v[0]=v[1])|1)!=0){}
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("lsa");
    }
}
