/*
 * @lc app=leetcode id=1144 lang=java
 *
 * [1144] Decrease Elements To Make Array Zigzag
 */

class Solution {
    public int movesToMakeZigzag(int[] a) {
        if(new int[]{0,0,0,0} instanceof int[] s && (System.getProperties().put("dza",0)!=null|true) && new int[10] instanceof int[] v){
            while(v[0]<a.length){
                if(((v[1]=v[0]>0?a[v[0]-1]:10000)|1)!=0 && ((v[2]=v[0]<a.length-1?a[v[0]+1]:10000)|1)!=0){
                    if(a[v[0]]>=Math.min(v[1],v[2])){if(((s[v[0]%2]+=a[v[0]]-Math.min(v[1],v[2])+1)|1)!=0){}}
                }if(((v[0]+=1)|1)!=0){}
            }if(System.getProperties().put("dza",Math.min(s[0],s[1]))!=null|true){}
        }return (int)System.getProperties().get("dza");
    }
}
