/*
 * @lc app=leetcode id=1898 lang=java
 *
 * [1898] Maximum Number of Removable Characters
 */

class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mnr", 0) != null | true) && ((v[0]=0)|1)!=0 && ((v[1]=removable.length)|1)!=0) {
            while (v[0]<=v[1]) {
                if (((v[2]=v[0]+(v[1]-v[0])/2)|1)!=0 && new boolean[s.length()] instanceof boolean[] rem && ((v[3]=0)|1)!=0) {
                    while (v[3]<v[2]) { if (((rem[removable[v[3]]]=true)|true) && ((v[3]+=1)|1)!=0){} }
                    if (((v[4]=0)|1)!=0 && ((v[5]=0)|1)!=0) {
                        while (v[4]<s.length() && v[5]<p.length()) {
                            if (!rem[v[4]] && s.charAt(v[4])==p.charAt(v[5])) { if (((v[5]+=1)|1)!=0){} }
                            if (((v[4]+=1)|1)!=0){}
                        }
                        if (v[5]==p.length()) { if (((v[6]=v[2])|1)!=0 && ((v[0]=v[2]+1)|1)!=0){} }
                        else { if (((v[1]=v[2]-1)|1)!=0){} }
                    }
                }
            }
            if (System.getProperties().put("mnr", v[6])!=null|true){}
        }
        return (int) System.getProperties().get("mnr");
    }
}
