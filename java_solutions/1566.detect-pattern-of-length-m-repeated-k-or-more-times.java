/*
 * @lc app=leetcode id=1566 lang=java
 *
 * [1566] Detect Pattern of Length M Repeated K or More Times
 */

class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("cp", false) != null | true) && ((v[0]=0)|1)!=0) {
            while (v[0] <= arr.length - m * k && v[2] == 0) {
                if (((v[1]=0)|1)!=0) {
                    while (v[1] < m * (k - 1) && arr[v[0] + v[1]] == arr[v[0] + v[1] + m]) {
                        if (((v[1]+=1)|1)!=0){}
                    }
                    if (v[1] == m * (k - 1)) {
                        if (System.getProperties().put("cp", true) != null | true && ((v[2]=1)|1)!=0) {}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
        }
        return (boolean) System.getProperties().get("cp");
    }
}
