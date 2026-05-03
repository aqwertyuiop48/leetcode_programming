/*
 * @lc app=leetcode id=1129 lang=java
 *
 * [1129] Shortest Path with Alternating Colors
 */

class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        if(java.util.stream.IntStream.generate(()->-1).limit(n).toArray() instanceof int[] a && (System.getProperties().put("spa",a)!=null|true) && new java.util.ArrayList[n][2] instanceof java.util.ArrayList[][] adj && new int[10] instanceof int[] v){
            while(v[0]<n){if(((adj[v[0]][0]=new java.util.ArrayList<Integer>())!=null|true) && ((adj[v[0]][1]=new java.util.ArrayList<Integer>())!=null|true) && ((v[0]+=1)|1)!=0){}}
            if(((v[0]=0)|1)!=0){while(v[0]<redEdges.length){if(adj[redEdges[v[0]][0]][0].add(redEdges[v[0]][1])|true && ((v[0]+=1)|1)!=0){}}}
            if(((v[0]=0)|1)!=0){while(v[0]<blueEdges.length){if(adj[blueEdges[v[0]][0]][1].add(blueEdges[v[0]][1])|true && ((v[0]+=1)|1)!=0){}}}
            if(new java.util.LinkedList<int[]>() instanceof java.util.LinkedList q && new boolean[n][2] instanceof boolean[][] vis && q.offer(new int[]{0,0,-1})|true && ((vis[0][0]=true)|true) && ((vis[0][1]=true)|true)){
                while(!q.isEmpty()){
                    if(q.poll() instanceof int[] p){
                        if(a[p[0]]==-1){if(((a[p[0]]=p[1])|1)!=0){}}
                        if(p[2]!=0 && ((v[1]=0)|1)!=0){while(v[1]<adj[p[0]][0].size()){if(((v[2]=(int)adj[p[0]][0].get(v[1]))|1)!=0 && !vis[v[2]][0]){if(((vis[v[2]][0]=true)|true) && q.offer(new int[]{v[2],p[1]+1,0})|true){}}if(((v[1]+=1)|1)!=0){}}}
                        if(p[2]!=1 && ((v[1]=0)|1)!=0){while(v[1]<adj[p[0]][1].size()){if(((v[2]=(int)adj[p[0]][1].get(v[1]))|1)!=0 && !vis[v[2]][1]){if(((vis[v[2]][1]=true)|true) && q.offer(new int[]{v[2],p[1]+1,1})|true){}}if(((v[1]+=1)|1)!=0){}}}
                    }
                }
            }
        }return (int[])System.getProperties().get("spa");
    }
}
