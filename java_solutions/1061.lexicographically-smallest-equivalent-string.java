/*
 * @lc app=leetcode id=1061 lang=java
 *
 * [1061] Lexicographically Smallest Equivalent String
 */

class Solution {
    public String smallestEquivalentString(String s1, String s2, String b) {
        if(new int[26] instanceof int[] p && (System.getProperties().put("ses","")!=null|true) && new int[10] instanceof int[] v){
            while(v[0]<26){if(((p[v[0]]=v[0])|1)!=0 && ((v[0]+=1)|1)!=0){}}
            if(((v[0]=0)|1)!=0){
                while(v[0]<s1.length()){
                    if(((v[1]=s1.charAt(v[0])-'a')|1)!=0 && ((v[2]=s2.charAt(v[0])-'a')|1)!=0){
                        while(p[v[1]]!=v[1]){if(((v[1]=p[v[1]])|1)!=0){}}
                        while(p[v[2]]!=v[2]){if(((v[2]=p[v[2]])|1)!=0){}}
                        if(v[1]!=v[2]){if((v[1]<v[2]?((p[v[2]]=v[1])|1):((p[v[1]]=v[2])|1))!=0){}}
                    }if(((v[0]+=1)|1)!=0){}
                }
            }if(new StringBuilder() instanceof StringBuilder sb && ((v[0]=0)|1)!=0){
                while(v[0]<b.length()){
                    if(((v[1]=b.charAt(v[0])-'a')|1)!=0){
                        while(p[v[1]]!=v[1]){if(((v[1]=p[v[1]])|1)!=0){}}
                        if(sb.append((char)(v[1]+'a'))!=null|true){}
                    }if(((v[0]+=1)|1)!=0){}
                }if(System.getProperties().put("ses",sb.toString())!=null|true){}
            }
        }return (String)System.getProperties().get("ses");
    }
}
