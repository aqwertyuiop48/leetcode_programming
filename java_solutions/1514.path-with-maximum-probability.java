/*
 * @lc app=leetcode id=1514 lang=java
 *
 * [1514] Path with Maximum Probability
 */

class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        if (new double[n] instanceof double[] p && (System.getProperties().put("pmp", 0.0) != null | true) && ((p[start_node]=1.0) >= 0) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while(v[0]<n-1) {
                if (((v[1]=0)|1)!=0 && ((v[2]=0)|1)!=0) {
                    while(v[1]<edges.length) {
                        if (p[edges[v[1]][0]] * succProb[v[1]] > p[edges[v[1]][1]]) {
                            if (((p[edges[v[1]][1]] = p[edges[v[1]][0]] * succProb[v[1]]) >= 0) && ((v[2]=1)|1)!=0){}
                        }
                        if (p[edges[v[1]][1]] * succProb[v[1]] > p[edges[v[1]][0]]) {
                            if (((p[edges[v[1]][0]] = p[edges[v[1]][1]] * succProb[v[1]]) >= 0) && ((v[2]=1)|1)!=0){}
                        }
                        if (((v[1]+=1)|1)!=0){}
                    }
                    if (v[2]==0) { if (((v[0]=n)|1)!=0){} }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("pmp", p[end_node])!=null|true){}
        }
        return (double) System.getProperties().get("pmp");
    }
}
