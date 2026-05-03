/*
 * @lc app=leetcode id=1052 lang=java
 *
 * [1052] Grumpy Bookstore Owner
 */

class Solution {
    public int maxSatisfied(int[] c, int[] g, int m) {
        if(new int[10] instanceof int[] v && (System.getProperties().put("gb",0)!=null|true)){
            while(v[0]<c.length){if(g[v[0]]==0){if(((v[1]+=c[v[0]])|1)!=0){}}if(((v[0]+=1)|1)!=0){}}
            if(((v[0]=0)|1)!=0){
                while(v[0]<c.length){
                    if(g[v[0]]==1){if(((v[3]+=c[v[0]])|1)!=0){}}
                    if(v[0]>=m&&g[v[0]-m]==1){if(((v[3]-=c[v[0]-m])|1)!=0){}}
                    if(v[3]>v[2]){if(((v[2]=v[3])|1)!=0){}}
                    if(((v[0]+=1)|1)!=0){}
                }if(System.getProperties().put("gb",v[1]+v[2])!=null|true){}
            }
        }return (int)System.getProperties().get("gb");
    }
}
