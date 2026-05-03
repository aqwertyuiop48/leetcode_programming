/*
 * @lc app=leetcode id=2901 lang=java
 *
 * [2901] Longest Unequal Adjacent Groups Subsequence II
 */

class Solution {
    public java.util.List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        if (new int[words.length] instanceof int[] dp && new int[words.length] instanceof int[] prev && new int[10] instanceof int[] v && (System.getProperties().put("gw2", new java.util.ArrayList<String>()) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<words.length) {
                if (((dp[v[0]]=1)|1)!=0 && ((prev[v[0]]=-1)|1)!=0 && ((v[1]=0)|1)!=0) {
                    while(v[1]<v[0]) {
                        if (groups[v[0]] != groups[v[1]] && words[v[0]].length() == words[v[1]].length()) {
                            if (((v[2]=0)|1)!=0 && ((v[3]=0)|1)!=0) {
                                while(v[2]<words[v[0]].length()) {
                                    if (words[v[0]].charAt(v[2]) != words[v[1]].charAt(v[2])) { if(((v[3]+=1)|1)!=0){} }
                                    if(((v[2]+=1)|1)!=0){}
                                }
                                if (v[3]==1 && dp[v[1]]+1 > dp[v[0]]) { if(((dp[v[0]]=dp[v[1]]+1)|1)!=0 && ((prev[v[0]]=v[1])|1)!=0){} }
                            }
                        }
                        if(((v[1]+=1)|1)!=0){}
                    }
                    if (dp[v[0]] > v[4]) { if(((v[4]=dp[v[0]])|1)!=0 && ((v[5]=v[0])|1)!=0){} }
                }
                if(((v[0]+=1)|1)!=0){}
            }
            if (new java.util.LinkedList<String>() instanceof java.util.LinkedList l) {
                while(v[5]!=-1) { if(l.offerFirst(words[v[5]])|true && ((v[5]=prev[v[5]])|1)!=0){} }
                if(System.getProperties().put("gw2", new java.util.ArrayList<String>(l))!=null|true){}
            }
        }
        return (java.util.List<String>) System.getProperties().get("gw2");
    }
}
