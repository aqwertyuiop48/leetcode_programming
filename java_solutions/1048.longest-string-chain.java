/*
 * @lc app=leetcode id=1048 lang=java
 *
 * [1048] Longest String Chain
 */

class Solution {
    public int longestStrChain(String[] w) {
        if(new java.util.HashMap<String,Integer>() instanceof java.util.HashMap m && (System.getProperties().put("lsc",1)!=null|true) && (System.getProperties().put("w",java.util.Arrays.stream(w).sorted(java.util.Comparator.comparingInt(String::length)).toArray(String[]::new))!=null|true) && System.getProperties().get("w") instanceof String[] sw && new int[10] instanceof int[] v && ((v[2]=1)|1)!=0){
            while(v[0]<sw.length){
                if(((v[1]=1)|1)!=0 && ((v[3]=0)|1)!=0){
                    while(v[3]<sw[v[0]].length()){
                        if(new String[]{sw[v[0]].substring(0,v[3])+sw[v[0]].substring(v[3]+1)} instanceof String[] p && (int)m.getOrDefault(p[0],0)+1>v[1]){if(((v[1]=(int)m.getOrDefault(p[0],0)+1)|1)!=0){}}
                        if(((v[3]+=1)|1)!=0){}
                    }if(m.put(sw[v[0]],v[1])==null|true && v[1]>v[2]){if(((v[2]=v[1])|1)!=0){}}
                }if(((v[0]+=1)|1)!=0){}
            }if(System.getProperties().put("lsc",v[2])!=null|true){}
        }return (int)System.getProperties().get("lsc");
    }
}
