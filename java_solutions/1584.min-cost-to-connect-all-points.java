/*
 * @lc app=leetcode id=1584 lang=java
 *
 * [1584] Min Cost to Connect All Points
 */

class Solution {
    public int minCostConnectPoints(int[][] points) {
        if (new int[points.length] instanceof int[] d && new boolean[points.length] instanceof boolean[] vis && new int[10] instanceof int[] v && (System.getProperties().put("mcc", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while (v[0]<points.length) { if (((d[v[0]]=10000000)|1)!=0 && ((v[0]+=1)|1)!=0){} }
            if (((d[0]=0)|1)!=0 && ((v[0]=0)|1)!=0) {
                while (v[0] < points.length) {
                    if (((v[1]=-1)|1)!=0 && ((v[2]=0)|1)!=0) {
                        while (v[2] < points.length) {
                            if (!vis[v[2]] && (v[1] == -1 || d[v[2]] < d[v[1]])) { if (((v[1]=v[2])|1)!=0){} }
                            if (((v[2]+=1)|1)!=0){}
                        }
                        if (((vis[v[1]]=true)|true) && ((v[3]+=d[v[1]])|1)!=0 && ((v[2]=0)|1)!=0) {
                            while (v[2] < points.length) {
                                if (!vis[v[2]] && Math.abs(points[v[1]][0]-points[v[2]][0]) + Math.abs(points[v[1]][1]-points[v[2]][1]) < d[v[2]]) {
                                    if (((d[v[2]] = Math.abs(points[v[1]][0]-points[v[2]][0]) + Math.abs(points[v[1]][1]-points[v[2]][1]))|1)!=0){}
                                }
                                if (((v[2]+=1)|1)!=0){}
                            }
                        }
                    }
                    if (((v[0]+=1)|1)!=0){}
                }
            }
            if (System.getProperties().put("mcc", v[3]) != null | true){}
        }
        return (int) System.getProperties().get("mcc");
    }
}
