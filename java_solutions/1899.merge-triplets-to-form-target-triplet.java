/*
 * @lc app=leetcode id=1899 lang=java
 *
 * [1899] Merge Triplets to Form Target Triplet
 */

class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mt", false) != null | true) && ((v[0]=0)|1)!=0) {
            while (v[0]<triplets.length) {
                if (triplets[v[0]][0]<=target[0] && triplets[v[0]][1]<=target[1] && triplets[v[0]][2]<=target[2]) {
                    if (((v[1]=Math.max(v[1], triplets[v[0]][0]))|1)!=0 && ((v[2]=Math.max(v[2], triplets[v[0]][1]))|1)!=0 && ((v[3]=Math.max(v[3], triplets[v[0]][2]))|1)!=0){}
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (v[1]==target[0] && v[2]==target[1] && v[3]==target[2]) { if (System.getProperties().put("mt", true)!=null|true){} }
        }
        return (boolean) System.getProperties().get("mt");
    }
}
