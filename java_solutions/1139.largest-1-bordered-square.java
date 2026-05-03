/*
 * @lc app=leetcode id=1139 lang=java
 *
 * [1139] Largest 1-Bordered Square
 */

class Solution {
    public int largest1BorderedSquare(int[][] g) {
        if(new int[g.length][g[0].length] instanceof int[][] r && new int[g.length][g[0].length] instanceof int[][] c && (System.getProperties().put("l1b",0)!=null|true) && new int[10] instanceof int[] v){
            while(v[0]<g.length){if(((v[1]=0)|1)!=0){while(v[1]<g[0].length){
                if(g[v[0]][v[1]]==1){if(((r[v[0]][v[1]]=(v[1]>0?r[v[0]][v[1]-1]:0)+1)|1)!=0 && ((c[v[0]][v[1]]=(v[0]>0?c[v[0]-1][v[1]]:0)+1)|1)!=0){}}
                if(((v[1]+=1)|1)!=0){}
            }}if(((v[0]+=1)|1)!=0){}}
            if(((v[0]=0)|1)!=0){
                while(v[0]<g.length){if(((v[1]=0)|1)!=0){while(v[1]<g[0].length){
                    if(((v[2]=Math.min(r[v[0]][v[1]],c[v[0]][v[1]]))|1)!=0){
                        while(v[2]>v[3]){
                            if(r[v[0]-v[2]+1][v[1]]>=v[2]&&c[v[0]][v[1]-v[2]+1]>=v[2]){if(((v[3]=v[2])|1)!=0){}}
                            if(((v[2]-=1)|1)!=0){}
                        }
                    }if(((v[1]+=1)|1)!=0){}
                }}if(((v[0]+=1)|1)!=0){}}
                if(System.getProperties().put("l1b",v[3]*v[3])!=null|true){}
            }
        }return (int)System.getProperties().get("l1b");
    }
}
