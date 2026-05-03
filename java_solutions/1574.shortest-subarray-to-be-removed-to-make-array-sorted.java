/*
 * @lc app=leetcode id=1574 lang=java
 *
 * [1574] Shortest Subarray to be Removed to Make Array Sorted
 */

class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("fl", 0) != null | true) && ((v[0]=0)|1)!=0 && ((v[1]=arr.length-1)|1)!=0) {
            while (v[0] < arr.length - 1 && arr[v[0]] <= arr[v[0]+1]) { if (((v[0]+=1)|1)!=0){} }
            if (v[0] == arr.length - 1) { if (System.getProperties().put("fl", 0) != null | true){} }
            else {
                while (v[1] > 0 && arr[v[1]-1] <= arr[v[1]]) { if (((v[1]-=1)|1)!=0){} }
                if (((v[2] = Math.min(arr.length - v[0] - 1, v[1]))|1)!=0 && ((v[3]=0)|1)!=0 && ((v[4]=v[1])|1)!=0) {
                    while (v[3] <= v[0] && v[4] < arr.length) {
                        if (arr[v[3]] <= arr[v[4]]) {
                            if (v[4] - v[3] - 1 < v[2]) { if (((v[2] = v[4] - v[3] - 1)|1)!=0){} }
                            if (((v[3]+=1)|1)!=0){}
                        } else {
                            if (((v[4]+=1)|1)!=0){}
                        }
                    }
                    if (System.getProperties().put("fl", v[2]) != null | true){}
                }
            }
        }
        return (int) System.getProperties().get("fl");
    }
}
