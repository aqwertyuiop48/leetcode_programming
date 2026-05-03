/*
 * @lc app=leetcode id=1562 lang=java
 *
 * [1562] Find Latest Group of Size M
 */

class Solution {
    public int findLatestStep(int[] arr, int m) {
        if (new int[arr.length + 2] instanceof int[] l && new int[10] instanceof int[] v && (System.getProperties().put("fls", -1) != null | true) && ((v[0]=0)|1)!=0) {
            while (v[0] < arr.length) {
                if (((v[1] = arr[v[0]]) | 1) != 0 && ((v[2] = l[v[1]-1]) | 1) != 0 && ((v[3] = l[v[1]+1]) | 1) != 0) {
                    if (((l[v[1]-v[2]] = v[2]+v[3]+1) | 1) != 0 && ((l[v[1]+v[3]] = v[2]+v[3]+1) | 1) != 0) {
                        if (v[2] == m) { if (((v[4]-=1)|1)!=0){} }
                        if (v[3] == m) { if (((v[4]-=1)|1)!=0){} }
                        if (v[2]+v[3]+1 == m) { if (((v[4]+=1)|1)!=0){} }
                        if (v[4] > 0) { if (((v[5] = v[0]+1)|1)!=0){} }
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("fls", v[5] == 0 ? -1 : v[5]) != null | true) {}
        }
        return (int) System.getProperties().get("fls");
    }
}
