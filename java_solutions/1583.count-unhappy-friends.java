/*
 * @lc app=leetcode id=1583 lang=java
 *
 * [1583] Count Unhappy Friends
 */

class Solution {
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        if (new int[n][n] instanceof int[][] r && new int[n] instanceof int[] p && new int[10] instanceof int[] v && (System.getProperties().put("uf", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while (v[0] < n) {
                if (((v[1]=0)|1)!=0) {
                    while (v[1] < n - 1) { if (((r[v[0]][preferences[v[0]][v[1]]] = v[1])|1)!=0 && ((v[1]+=1)|1)!=0){} }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (((v[0]=0)|1)!=0) {
                while (v[0] < pairs.length) {
                    if (((p[pairs[v[0]][0]] = pairs[v[0]][1])|1)!=0 && ((p[pairs[v[0]][1]] = pairs[v[0]][0])|1)!=0 && ((v[0]+=1)|1)!=0){}
                }
                if (((v[0]=0)|1)!=0) {
                    while (v[0] < n) {
                        if (((v[1]=0)|1)!=0 && ((v[2]=0)|1)!=0) {
                            while (v[1] < n) {
                                if (v[0] != v[1] && r[v[0]][v[1]] < r[v[0]][p[v[0]]] && r[v[1]][v[0]] < r[v[1]][p[v[1]]]) { if (((v[2]=1)|1)!=0){} }
                                if (((v[1]+=1)|1)!=0){}
                            }
                            if (v[2] == 1) { if (((v[3]+=1)|1)!=0){} }
                        }
                        if (((v[0]+=1)|1)!=0){}
                    }
                    if (System.getProperties().put("uf", v[3]) != null | true){}
                }
            }
        }
        return (int) System.getProperties().get("uf");
    }
}
