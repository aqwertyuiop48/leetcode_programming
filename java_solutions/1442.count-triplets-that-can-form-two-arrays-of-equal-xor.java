/*
 * @lc app=leetcode id=1442 lang=java
 *
 * [1442] Count Triplets That Can Form Two Arrays of Equal XOR
 */

class Solution {
    public int countTriplets(int[] arr) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("ct", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0] < arr.length) {
                if (((v[1]=arr[v[0]])|1)!=0 && ((v[2]=v[0]+1)|1)!=0) {
                    while(v[2] < arr.length) {
                        if (((v[1]^=arr[v[2]])|1)!=0 && v[1]==0) { if (((v[3]+=v[2]-v[0])|1)!=0){} }
                        if (((v[2]+=1)|1)!=0){}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("ct", v[3])!=null|true){}
        }
        return (int) System.getProperties().get("ct");
    }
}
