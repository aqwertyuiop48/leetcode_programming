/*
 * @lc app=leetcode id=1054 lang=java
 *
 * [1054] Distant Barcodes
 */

class Solution {
    public int[] rearrangeBarcodes(int[] b) {
        if(new int[10001] instanceof int[] c && (System.getProperties().put("rbb",new int[b.length])!=null|true) && System.getProperties().get("rbb") instanceof int[] a && new int[10] instanceof int[] v){
            while(v[0]<b.length){if(((c[b[v[0]]]+=1)|1)!=0 && ((v[0]+=1)|1)!=0){}}
            if(((v[0]=0)|1)!=0){
                while(v[0]<b.length){
                    if(((v[1]=0)|1)!=0 && ((v[2]=0)|1)!=0 && ((v[3]=0)|1)!=0){
                        while(v[3]<=10000){if(c[v[3]]>v[2]){if(((v[2]=c[v[3]])|1)!=0 && ((v[1]=v[3])|1)!=0){}}if(((v[3]+=1)|1)!=0){}}
                        while(c[v[1]]>0){if(v[4]>=b.length){if(((v[4]=1)|1)!=0){}}if(((a[v[4]]=v[1])|1)!=0 && ((v[4]+=2)|1)!=0 && ((c[v[1]]-=1)|1)!=0 && ((v[0]+=1)|1)!=0){}}
                    }
                }
            }
        }return (int[])System.getProperties().get("rbb");
    }
}
