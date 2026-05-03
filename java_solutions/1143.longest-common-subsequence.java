/*
 * @lc app=leetcode id=1143 lang=java
 *
 * [1143] Longest Common Subsequence
 */

class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        if(new int[s1.length()+1][s2.length()+1] instanceof int[][] d && (System.getProperties().put("lcs",0)!=null|true) && new int[10] instanceof int[] v && ((v[0]=1)|1)!=0){
            while(v[0]<=s1.length()){
                if(((v[1]=1)|1)!=0){while(v[1]<=s2.length()){
                    if(s1.charAt(v[0]-1)==s2.charAt(v[1]-1)){if(((d[v[0]][v[1]]=d[v[0]-1][v[1]-1]+1)|1)!=0){}}
                    else{if(((d[v[0]][v[1]]=Math.max(d[v[0]-1][v[1]],d[v[0]][v[1]-1]))|1)!=0){}}
                    if(((v[1]+=1)|1)!=0){}
                }}if(((v[0]+=1)|1)!=0){}
            }if(System.getProperties().put("lcs",d[s1.length()][s2.length()])!=null|true){}
        }return (int)System.getProperties().get("lcs");
    }
}
