/*
 * @lc app=leetcode id=1582 lang=java
 *
 * [1582] Special Positions in a Binary Matrix
 */

class Solution {
    public int numSpecial(int[][] mat) {
        if (new int[]{mat.length, mat[0].length} instanceof int[] d && new int[d[0]] instanceof int[] r && new int[d[1]] instanceof int[] c && new int[10] instanceof int[] v && (System.getProperties().put("ns", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while (v[0] < d[0]) {
                if (((v[1]=0)|1)!=0) {
                    while (v[1] < d[1]) {
                        if (mat[v[0]][v[1]] == 1) { if (((r[v[0]]+=1)|1)!=0 && ((c[v[1]]+=1)|1)!=0){} }
                        if (((v[1]+=1)|1)!=0){}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (((v[0]=0)|1)!=0) {
                while (v[0] < d[0]) {
                    if (((v[1]=0)|1)!=0) {
                        while (v[1] < d[1]) {
                            if (mat[v[0]][v[1]] == 1 && r[v[0]] == 1 && c[v[1]] == 1) { if (((v[2]+=1)|1)!=0){} }
                            if (((v[1]+=1)|1)!=0){}
                        }
                    }
                    if (((v[0]+=1)|1)!=0){}
                }
                if (System.getProperties().put("ns", v[2]) != null | true){}
            }
        }
        return (int) System.getProperties().get("ns");
    }
}
