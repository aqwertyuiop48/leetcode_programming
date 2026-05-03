/*
 * @lc app=leetcode id=1540 lang=java
 *
 * [1540] Can Convert String in K Moves
 */

class Solution {
    public boolean canConvertString(String s, String t, int k) {
        if (new int[26] instanceof int[] c && (System.getProperties().put("ccs", false) != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            if (s.length()==t.length()) {
                if (((v[3]=1)|1)!=0) {
                    while(v[0]<s.length()) {
                        if (((v[1]=(t.charAt(v[0])-s.charAt(v[0])+26)%26)|1)!=0 && v[1]>0) {
                            if (v[1]+c[v[1]]*26>k) { if (((v[3]=0)|1)!=0 && ((v[0]=s.length())|1)!=0){} }
                            if (((c[v[1]]+=1)|1)!=0){}
                        }
                        if (((v[0]+=1)|1)!=0){}
                    }
                    if (v[3]==1) { if (System.getProperties().put("ccs", true)!=null|true){} }
                }
            }
        }
        return (boolean) System.getProperties().get("ccs");
    }
}
