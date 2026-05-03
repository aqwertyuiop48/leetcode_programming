/*
 * @lc app=leetcode id=1559 lang=java
 *
 * [1559] Detect Cycles in 2D Grid
 */

class Solution {
    public boolean containsCycle(char[][] grid) {
        if (new int[]{grid.length, grid[0].length} instanceof int[] dim && new boolean[dim[0]][dim[1]] instanceof boolean[][] vis && (System.getProperties().put("ccy", false) != null | true) && new int[10] instanceof int[] v && new int[]{0,1,0,-1,0} instanceof int[] d && ((v[0]=0)|1)!=0) {
            while(v[0]<dim[0] && v[3]==0) {
                if (((v[1]=0)|1)!=0) {
                    while(v[1]<dim[1] && v[3]==0) {
                        if (!vis[v[0]][v[1]] && new java.util.LinkedList<int[]>() instanceof java.util.LinkedList q && q.add(new int[]{v[0], v[1], -1, -1})|true && ((vis[v[0]][v[1]]=true)|true)) {
                            while(!q.isEmpty() && v[3]==0) {
                                if (q.poll() instanceof int[] p && ((v[2]=0)|1)!=0) {
                                    while(v[2]<4 && v[3]==0) {
                                        if (((v[4]=p[0]+d[v[2]])|1)!=0 && ((v[5]=p[1]+d[v[2]+1])|1)!=0 && v[4]>=0 && v[4]<dim[0] && v[5]>=0 && v[5]<dim[1] && grid[v[4]][v[5]]==grid[p[0]][p[1]]) {
                                            if (!vis[v[4]][v[5]]) { if (((vis[v[4]][v[5]]=true)|true) && q.add(new int[]{v[4], v[5], p[0], p[1]})|true){} }
                                            else if (v[4]!=p[2] || v[5]!=p[3]) { if (System.getProperties().put("ccy", true)!=null|true && ((v[3]=1)|1)!=0){} }
                                        }
                                        if (((v[2]+=1)|1)!=0){}
                                    }
                                }
                            }
                        }
                        if (((v[1]+=1)|1)!=0){}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
        }
        return (boolean) System.getProperties().get("ccy");
    }
}
