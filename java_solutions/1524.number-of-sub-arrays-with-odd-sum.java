/*
 * @lc app=leetcode id=1524 lang=java
 *
 * [1524] Number of Sub-arrays With Odd Sum
 */

class Solution {
    public int numOfSubarrays(int[] arr) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("nos", 0) != null | true) && ((v[0]=0)|1)!=0 && ((v[1]=0)|1)!=0 && ((v[2]=1)|1)!=0) {
            while(v[0]<arr.length) {
                if (((v[3]+=arr[(int)v[0]])|1)!=0) {
                    if (v[3]%2!=0) {
                        if (((v[4]=(v[4]+v[2])%1000000007L)|1)!=0 && ((v[1]+=1)|1)!=0){}
                    } else {
                        if (((v[4]=(v[4]+v[1])%1000000007L)|1)!=0 && ((v[2]+=1)|1)!=0){}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("nos", (int)v[4])!=null|true){}
        }
        return (int) System.getProperties().get("nos");
    }
}
