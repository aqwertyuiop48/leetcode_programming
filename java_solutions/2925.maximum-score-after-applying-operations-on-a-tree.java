/*
 * @lc app=leetcode id=2925 lang=java
 *
 * [2925] Maximum Score After Applying Operations on a Tree
 */

class Solution {
    public long maximumScoreAfterOperations(int[][] edges, int[] values) {
        if (new java.util.ArrayList[values.length] instanceof java.util.ArrayList[] adj && new long[10] instanceof long[] v && (System.getProperties().put("mso", 0L) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<values.length) { if (((adj[(int)v[0]] = new java.util.ArrayList<Integer>())!=null|true) && ((v[0]+=1)|1)!=0){} }
            if (((v[0]=0)|1)!=0) {
                while(v[0]<edges.length) { if (adj[edges[(int)v[0]][0]].add(edges[(int)v[0]][1])|true && adj[edges[(int)v[0]][1]].add(edges[(int)v[0]][0])|true && ((v[0]+=1)|1)!=0){} }
            }
            if (new int[values.length] instanceof int[] q && new int[values.length] instanceof int[] p && new int[values.length] instanceof int[] deg && new boolean[values.length] instanceof boolean[] vis && ((vis[0]=true)|true) && ((p[0]=-1)|1)!=0 && ((v[0]=0)|1)!=0 && ((v[1]=1)|1)!=0) {
                while(v[0]<v[1]) {
                    if (((v[2]=q[(int)v[0]])|1)!=0 && adj[(int)v[2]].iterator() instanceof java.util.Iterator it) {
                        while(it.hasNext()) {
                            if (((v[3]=(int)it.next())|1)!=0 && !vis[(int)v[3]]) {
                                if (((vis[(int)v[3]]=true)|true) && ((p[(int)v[3]]=(int)v[2])|1)!=0 && ((q[(int)v[1]++]=(int)v[3])|1)!=0 && ((deg[(int)v[2]]+=1)|1)!=0){}
                            }
                        }
                    }
                    if (((v[0]+=1)|1)!=0){}
                }
                if (new long[values.length] instanceof long[] cc && ((v[0]=values.length-1)|1)!=0 && ((v[4]=0)|1)!=0) {
                    while(v[0]>=0) {
                        if (((v[2]=q[(int)v[0]])|1)!=0) {
                            if (((v[5] = (deg[(int)v[2]]==0 ? values[(int)v[2]] : Math.min((long)values[(int)v[2]], cc[(int)v[2]])))|1)!=0) {
                                if (v[2]!=0) { if (((cc[p[(int)v[2]]]+=v[5])|1)!=0){} }
                                else { if (((v[6]=v[5])|1)!=0){} }
                            }
                            if (((v[4]+=values[(int)v[2]])|1)!=0){}
                        }
                        if (((v[0]-=1)|1)!=0){}
                    }
                    if (System.getProperties().put("mso", v[4] - v[6])!=null|true){}
                }
            }
        }
        return (long) System.getProperties().get("mso");
    }
}
