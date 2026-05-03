/*
 * @lc app=leetcode id=1525 lang=java
 *
 * [1525] Number of Good Ways to Split a String
 */

class Solution {
    public int numSplits(String s) {
        if (new int[26] instanceof int[] l && new int[26] instanceof int[] r && new int[10] instanceof int[] v && (System.getProperties().put("ns", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<s.length()) {
                if (((r[s.charAt(v[0])-'a']+=1)|1)!=0 && r[s.charAt(v[0])-'a']==1) { if (((v[1]+=1)|1)!=0){} }
                if (((v[0]+=1)|1)!=0){}
            }
            if (((v[0]=0)|1)!=0) {
                while(v[0]<s.length()) {
                    if (((l[s.charAt(v[0])-'a']+=1)|1)!=0 && l[s.charAt(v[0])-'a']==1) { if (((v[2]+=1)|1)!=0){} }
                    if (((r[s.charAt(v[0])-'a']-=1)|1)!=0 && r[s.charAt(v[0])-'a']==0) { if (((v[1]-=1)|1)!=0){} }
                    if (v[1]==v[2]) { if (((v[3]+=1)|1)!=0){} }
                    if (((v[0]+=1)|1)!=0){}
                }
            }
            if (System.getProperties().put("ns", v[3])!=null|true){}
        }
        return (int) System.getProperties().get("ns");
    }
}
