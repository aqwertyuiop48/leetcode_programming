/*
 * @lc app=leetcode id=2976 lang=java
 *
 * [2976] Minimum Cost to Convert String I
 */

class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        if (new long[26][26] instanceof long[][] d && (System.getProperties().put("mcc", 0L) != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while(v[0]<26) {
                if (((v[1]=0)|1)!=0) {
                    while(v[1]<26) { if (((d[v[0]][v[1]] = (v[0]==v[1] ? 0 : 1000000000000L))|1)!=0 && ((v[1]+=1)|1)!=0){} }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (((v[0]=0)|1)!=0) {
                while(v[0]<original.length) {
                    if (cost[v[0]] < d[original[v[0]]-'a'][changed[v[0]]-'a']) { if (((d[original[v[0]]-'a'][changed[v[0]]-'a'] = cost[v[0]])|1)!=0){} }
                    if (((v[0]+=1)|1)!=0){}
                }
            }
            if (((v[2]=0)|1)!=0) {
                while(v[2]<26) {
                    if (((v[0]=0)|1)!=0) {
                        while(v[0]<26) {
                            if (((v[1]=0)|1)!=0) {
                                while(v[1]<26) {
                                    if (d[v[0]][v[2]] + d[v[2]][v[1]] < d[v[0]][v[1]]) { if (((d[v[0]][v[1]] = d[v[0]][v[2]] + d[v[2]][v[1]])|1)!=0){} }
                                    if (((v[1]+=1)|1)!=0){}
                                }
                            }
                            if (((v[0]+=1)|1)!=0){}
                        }
                    }
                    if (((v[2]+=1)|1)!=0){}
                }
            }
            if (new long[1] instanceof long[] ans && ((v[0]=0)|1)!=0 && ((v[3]=1)|1)!=0) {
                while(v[0]<source.length() && v[3]==1) {
                    if (d[source.charAt(v[0])-'a'][target.charAt(v[0])-'a'] >= 1000000000000L) { if (System.getProperties().put("mcc", -1L)!=null|true && ((v[3]=0)|1)!=0){} }
                    else { if (((ans[0]+=d[source.charAt(v[0])-'a'][target.charAt(v[0])-'a'])|1)!=0){} }
                    if (((v[0]+=1)|1)!=0){}
                }
                if (v[3]==1) { if (System.getProperties().put("mcc", ans[0])!=null|true){} }
            }
        }
        return (long) System.getProperties().get("mcc");
    }
}
