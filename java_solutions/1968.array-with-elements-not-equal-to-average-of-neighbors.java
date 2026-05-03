/*
 * @lc app=leetcode id=1968 lang=java
 *
 * [1968] Array With Elements Not Equal to Average of Neighbors
 */

class Solution {
    public int[] rearrangeArray(int[] nums) {
        if (new int[nums.length] instanceof int[] a && (System.getProperties().put("ra", a)!=null|true) && (System.getProperties().put("na", java.util.Arrays.stream(nums).sorted().toArray())!=null|true) && System.getProperties().get("na") instanceof int[] s && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0 && ((v[1]=nums.length-1)|1)!=0 && ((v[2]=0)|1)!=0) {
            while (v[2]<nums.length) {
                if (v[2]%2==0) { if (((a[v[2]]=s[v[0]++])|1)!=0){} }
                else { if (((a[v[2]]=s[v[1]--])|1)!=0){} }
                if (((v[2]+=1)|1)!=0){}
            }
        }
        return (int[]) System.getProperties().get("ra");
    }
}
