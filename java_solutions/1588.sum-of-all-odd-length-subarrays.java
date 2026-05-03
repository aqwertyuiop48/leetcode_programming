/*
 * @lc app=leetcode id=1588 lang=java
 *
 * [1588] Sum of All Odd Length Subarrays
 */

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("so", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0] < arr.length) {
                if (((v[1] += (((v[0] + 1) * (arr.length - v[0]) + 1) / 2) * arr[v[0]])|1)!=0 && ((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("so", v[1]) != null | true){}
        }
        return (int) System.getProperties().get("so");
    }
}
