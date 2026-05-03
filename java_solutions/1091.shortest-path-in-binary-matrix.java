/*
 * @lc app=leetcode id=1091 lang=java
 *
 * [1091] Shortest Path in Binary Matrix
 */

class Solution {
    public int shortestPathBinaryMatrix(int[][] g) {
        if(new java.util.LinkedList<int[]>() instanceof java.util.LinkedList q && (System.getProperties().put("spb",-1)!=null|true) && new int[10] instanceof int[] v && ((v[0]=g.length)|1)!=0){
            if(g[0][0]==0 && q.add(new int[]{0,0,1})|true && ((g[0][0]=1)|1)!=0 && new int[]{-1,-1,-1,0,-1,1,0,-1,0,1,1,-1,1,0,1,1} instanceof int[] d){
                while(!q.isEmpty()&&((int)System.getProperties().get("spb")==-1)){
                    if(q.poll() instanceof int[] p){
                        if(p[0]==v[0]-1&&p[1]==v[0]-1){if(System.getProperties().put("spb",p[2])!=null|true){}}
                        else{if(((v[1]=0)|1)!=0){
                            while(v[1]<8){
                                if(((v[2]=p[0]+d[v[1]*2])|1)!=0 && ((v[3]=p[1]+d[v[1]*2+1])|1)!=0 && v[2]>=0&&v[2]<v[0]&&v[3]>=0&&v[3]<v[0]&&g[v[2]][v[3]]==0){if(((g[v[2]][v[3]]=1)|1)!=0 && q.add(new int[]{v[2],v[3],p[2]+1})|true){}}
                                if(((v[1]+=1)|1)!=0){}
                            }
                        }}
                    }
                }
            }
        }return (int)System.getProperties().get("spb");
    }
}
