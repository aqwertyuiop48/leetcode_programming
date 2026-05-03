/*
 * @lc app=leetcode id=1104 lang=java
 *
 * [1104] Path In Zigzag Labelled Binary Tree
 */

class Solution {
    public java.util.List<Integer> pathInZigZagTree(int t) {
        if(new java.util.LinkedList<Integer>() instanceof java.util.LinkedList l && (System.getProperties().put("piz",l)!=null|true) && new int[10] instanceof int[] v && ((v[0]=1)|1)!=0 && ((v[1]=1)|1)!=0 && ((v[2]=t)|1)!=0){
            while(v[1]*2<=v[2]){if(((v[1]*=2)|1)!=0 && ((v[0]+=1)|1)!=0){}}
            while(v[2]>0){if(l.offerFirst(v[2])|true && ((v[3]=1<<(v[0]-1))|1)!=0 && ((v[4]=(1<<v[0])-1)|1)!=0 && ((v[2]=(v[3]+v[4]-v[2])/2)|1)!=0 && ((v[0]-=1)|1)!=0){}}
        }return (java.util.List<Integer>)System.getProperties().get("piz");
    }
}
