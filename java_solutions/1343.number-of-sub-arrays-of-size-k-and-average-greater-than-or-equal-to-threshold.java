/*
 * @lc app=leetcode id=1343 lang=java
 *
 * [1343] Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 */

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("nos", 0) != null | true) && ((v[0]=0)|1)!=0 && ((v[1]=0)|1)!=0) {
            while(v[0] < k) { if (((v[1] += arr[v[0]++])|1)!=0){} }
            if (((v[2] = v[1] >= k * threshold ? 1 : 0)|1)!=0 && ((v[0]=k)|1)!=0) {
                while(v[0] < arr.length) {
                    if (((v[1] += arr[v[0]] - arr[v[0]-k])|1)!=0 && v[1] >= k * threshold) { if (((v[2]+=1)|1)!=0){} }
                    if (((v[0]+=1)|1)!=0){}
                }
                if (System.getProperties().put("nos", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("nos");
    }
}
