/*
 * @lc app=leetcode id=1519 lang=java
 *
 * [1519] Number of Nodes in the Sub-Tree With the Same Label
 */

class Solution {
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        if (new int[n] instanceof int[] ans && new java.util.ArrayList[n] instanceof java.util.ArrayList[] adj && (System.getProperties().put("cst", ans) != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while(v[0]<n) { if (((adj[v[0]]=new java.util.ArrayList<Integer>())!=null|true) && ((v[0]+=1)|1)!=0){} }
            if (((v[0]=0)|1)!=0) {
                while(v[0]<edges.length) { if (adj[edges[v[0]][0]].add(edges[v[0]][1])|true && adj[edges[v[0]][1]].add(edges[v[0]][0])|true && ((v[0]+=1)|1)!=0){} }
            }
            if (new int[n] instanceof int[] order && new int[n] instanceof int[] parent && new boolean[n] instanceof boolean[] vis && ((vis[0]=true)|true) && ((v[0]=0)|1)!=0 && ((v[1]=1)|1)!=0) {
                while(v[0]<v[1]) {
                    if (((v[2]=order[v[0]])|1)!=0 && adj[v[2]].iterator() instanceof java.util.Iterator it) {
                        while(it.hasNext()) {
                            if (((v[3]=(int)it.next())|1)!=0 && !vis[v[3]]) {
                                if (((vis[v[3]]=true)|true) && ((parent[v[3]]=v[2])|1)!=0 && ((order[v[1]++]=v[3])|1)!=0){}
                            }
                        }
                    }
                    if (((v[0]+=1)|1)!=0){}
                }
                if (new int[n][26] instanceof int[][] counts && ((v[0]=n-1)|1)!=0) {
                    while(v[0]>=0) {
                        if (((v[2]=order[v[0]])|1)!=0 && ((counts[v[2]][labels.charAt(v[2])-'a']+=1)|1)!=0) {
                            if (v[2]!=0 && ((v[3]=0)|1)!=0) {
                                while(v[3]<26) { if (((counts[parent[v[2]]][v[3]]+=counts[v[2]][v[3]])|1)!=0 && ((v[3]+=1)|1)!=0){} }
                            }
                            if (((ans[v[2]]=counts[v[2]][labels.charAt(v[2])-'a'])|1)!=0){}
                        }
                        if (((v[0]-=1)|1)!=0){}
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("cst");
    }
}
