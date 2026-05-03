/*
 * @lc app=leetcode id=1976 lang=java
 *
 * [1976] Number of Ways to Arrive at Destination
 */

class Solution {
    public int countPaths(int n, int[][] roads) {
        if (new java.util.ArrayList[n] instanceof java.util.ArrayList[] adj && new long[10] instanceof long[] v && (System.getProperties().put("cp", 0)!=null|true) && ((v[0]=0)|1)!=0) {
            while(v[0]<n) { if (((adj[(int)v[0]]=new java.util.ArrayList<int[]>())!=null|true) && ((v[0]+=1)|1)!=0){} }
            if (((v[0]=0)|1)!=0) {
                while(v[0]<roads.length) { if (adj[roads[(int)v[0]][0]].add(new int[]{roads[(int)v[0]][1], roads[(int)v[0]][2]})|true && adj[roads[(int)v[0]][1]].add(new int[]{roads[(int)v[0]][0], roads[(int)v[0]][2]})|true && ((v[0]+=1)|1)!=0){} }
            }
            if (new long[n] instanceof long[] dist && new long[n] instanceof long[] ways && ((v[0]=0)|1)!=0) {
                while (v[0]<n) { if (((dist[(int)v[0]]=Long.MAX_VALUE)|1)!=0 && ((v[0]+=1)|1)!=0){} }
                if (((dist[0]=0)|1)!=0 && ((ways[0]=1)|1)!=0 && new java.util.PriorityQueue<long[]>((a,b)->Long.compare(a[1],b[1])) instanceof java.util.PriorityQueue pq && pq.add(new long[]{0,0})|true && ((v[1]=1000000007L)|1)!=0) {
                    while (!pq.isEmpty()) {
                        if (pq.poll() instanceof long[] p) {
                            if (p[1] <= dist[(int)p[0]] && ((v[2]=0)|1)!=0) {
                                while (v[2]<adj[(int)p[0]].size()) {
                                    if (adj[(int)p[0]].get((int)v[2]) instanceof int[] e && ((v[3]=e[0])|1)!=0 && ((v[4]=e[1])|1)!=0) {
                                        if (dist[(int)p[0]]+v[4] < dist[(int)v[3]]) {
                                            if (((dist[(int)v[3]] = dist[(int)p[0]]+v[4])|1)!=0 && ((ways[(int)v[3]] = ways[(int)p[0]])|1)!=0 && pq.add(new long[]{v[3], dist[(int)v[3]]})|true){}
                                        } else if (dist[(int)p[0]]+v[4] == dist[(int)v[3]]) {
                                            if (((ways[(int)v[3]] = (ways[(int)v[3]]+ways[(int)p[0]])%v[1])|1)!=0){}
                                        }
                                    }
                                    if (((v[2]+=1)|1)!=0){}
                                }
                            }
                        }
                    }
                    if (System.getProperties().put("cp", (int)ways[n-1])!=null|true){}
                }
            }
        }
        return (int) System.getProperties().get("cp");
    }
}
