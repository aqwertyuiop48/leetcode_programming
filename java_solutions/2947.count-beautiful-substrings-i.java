/*
 * @lc app=leetcode id=2947 lang=java
 *
 * [2947] Count Beautiful Substrings I
 */

class Solution {
    public int beautifulSubstrings(String s, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("bs", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<s.length()) {
                if (((v[1]=0)|1)!=0 && ((v[2]=0)|1)!=0 && ((v[3]=v[0])|1)!=0) {
                    while(v[3]<s.length()) {
                        if ("aeiou".indexOf(s.charAt(v[3])) != -1) { if (((v[1]+=1)|1)!=0){} }
                        else { if (((v[2]+=1)|1)!=0){} }
                        if (v[1]==v[2] && (v[1]*v[2])%k==0) { if (((v[4]+=1)|1)!=0){} }
                        if (((v[3]+=1)|1)!=0){}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("bs", v[4])!=null|true){}
        }
        return (int) System.getProperties().get("bs");
    }
}
