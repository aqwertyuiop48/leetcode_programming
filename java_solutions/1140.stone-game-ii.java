/*
 * @lc app=leetcode id=1140 lang=java
 *
 * [1140] Stone Game II
 */

class Solution {
    public int stoneGameII(int[] p) {
        if(new int[p.length+1] instanceof int[] s && new int[p.length+1][p.length*2+1] instanceof int[][] dp && (System.getProperties().put("sg",0)!=null|true) && new int[10] instanceof int[] v && ((v[0]=p.length-1)|1)!=0){
            while(v[0]>=0){if(((s[v[0]]=s[v[0]+1]+p[v[0]])|1)!=0 && ((v[0]-=1)|1)!=0){}}
            if(((v[0]=p.length-1)|1)!=0){
                while(v[0]>=0){
                    if(((v[1]=1)|1)!=0){while(v[1]<=p.length){
                        if(v[0]+2*v[1]>=p.length){if(((dp[v[0]][v[1]]=s[v[0]])|1)!=0){}}
                        else{if(((v[2]=1)|1)!=0){while(v[2]<=2*v[1]){if(s[v[0]]-dp[v[0]+v[2]][Math.max(v[1],v[2])]>dp[v[0]][v[1]]){if(((dp[v[0]][v[1]]=s[v[0]]-dp[v[0]+v[2]][Math.max(v[1],v[2])])|1)!=0){}}if(((v[2]+=1)|1)!=0){}}}}
                        if(((v[1]+=1)|1)!=0){}
                    }}if(((v[0]-=1)|1)!=0){}
                }if(System.getProperties().put("sg",dp[0][1])!=null|true){}
            }
        }return (int)System.getProperties().get("sg");
    }
}
