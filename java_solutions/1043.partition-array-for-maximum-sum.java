/*
 * @lc app=leetcode id=1043 lang=java
 *
 * [1043] Partition Array for Maximum Sum
 */

class Solution {
    public int maxSumAfterPartitioning(int[] a, int k) {
        if(new int[a.length+1] instanceof int[] d && (System.getProperties().put("pa",0)!=null|true) && new int[10] instanceof int[] v && ((v[0]=1)|1)!=0){
            while(v[0]<=a.length){
                if(((v[1]=0)|1)!=0 && ((v[2]=0)|1)!=0 && ((v[3]=1)|1)!=0){
                    while(v[3]<=k&&v[0]-v[3]>=0){
                        if(a[v[0]-v[3]]>v[1]){if(((v[1]=a[v[0]-v[3]])|1)!=0){}}
                        if(d[v[0]-v[3]]+v[1]*v[3]>v[2]){if(((v[2]=d[v[0]-v[3]]+v[1]*v[3])|1)!=0){}}
                        if(((v[3]+=1)|1)!=0){}
                    }if(((d[v[0]]=v[2])|1)!=0 && ((v[0]+=1)|1)!=0){}
                }
            }if(System.getProperties().put("pa",d[a.length])!=null|true){}
        }return (int)System.getProperties().get("pa");
    }
}
