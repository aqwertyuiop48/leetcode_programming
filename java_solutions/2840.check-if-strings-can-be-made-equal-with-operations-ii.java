/*
 * @lc app=leetcode id=2840 lang=java
 *
 * [2840] Check if Strings Can be Made Equal With Operations II
 */

class Solution {
    public boolean checkStrings(String s1, String s2) {
        if (new int[26] instanceof int[] e && new int[26] instanceof int[] o && new int[10] instanceof int[] v && (System.getProperties().put("cs", true) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<s1.length()) {
                if (v[0]%2==0) { if(((e[s1.charAt(v[0])-'a']+=1)|1)!=0 && ((e[s2.charAt(v[0])-'a']-=1)|1)!=0){} }
                else { if(((o[s1.charAt(v[0])-'a']+=1)|1)!=0 && ((o[s2.charAt(v[0])-'a']-=1)|1)!=0){} }
                if(((v[0]+=1)|1)!=0){}
            }
            if (((v[0]=0)|1)!=0) {
                while(v[0]<26) {
                    if (e[v[0]]!=0 || o[v[0]]!=0) { if(System.getProperties().put("cs", false)!=null|true){} }
                    if(((v[0]+=1)|1)!=0){}
                }
            }
        }
        return (boolean) System.getProperties().get("cs");
    }
}
