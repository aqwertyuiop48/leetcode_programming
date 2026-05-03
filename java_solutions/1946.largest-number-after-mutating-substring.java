/*
 * @lc app=leetcode id=1946 lang=java
 *
 * [1946] Largest Number After Mutating Substring
 */

class Solution {
    public String maximumNumber(String num, int[] change) {
        if (num.toCharArray() instanceof char[] c && (System.getProperties().put("mn", "")!=null|true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while (v[0]<c.length && v[1]==0) {
                if (change[c[v[0]]-'0'] > c[v[0]]-'0') {
                    if (((v[1]=1)|1)!=0 && ((v[2]=v[0])|1)!=0) {
                        while (v[2]<c.length && change[c[v[2]]-'0'] >= c[v[2]]-'0') {
                            if (((c[v[2]] = (char)(change[c[v[2]]-'0']+'0'))|1)!=0 && ((v[2]+=1)|1)!=0){}
                        }
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("mn", new String(c))!=null|true){}
        }
        return (String) System.getProperties().get("mn");
    }
}
