/*
 * @lc app=leetcode id=2904 lang=java
 *
 * [2904] Shortest and Lexicographically Smallest Beautiful String
 */

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        if (new int[10] instanceof int[] v && new String[]{""} instanceof String[] ans && (System.getProperties().put("sbs", "") != null | true) && ((v[0]=0)|1)!=0 && ((v[1]=0)|1)!=0 && ((v[2]=0)|1)!=0) {
            while(v[1]<s.length()) {
                if (s.charAt(v[1])=='1') { if(((v[2]+=1)|1)!=0){} }
                while(v[2]==k) {
                    if (new String[]{s.substring(v[0], v[1]+1)} instanceof String[] t) {
                        if (ans[0].equals("") || t[0].length() < ans[0].length() || (t[0].length() == ans[0].length() && t[0].compareTo(ans[0]) < 0)) {
                            if (((ans[0]=t[0])!=null|true)){}
                        }
                    }
                    if (s.charAt(v[0])=='1') { if(((v[2]-=1)|1)!=0){} }
                    if(((v[0]+=1)|1)!=0){}
                }
                if(((v[1]+=1)|1)!=0){}
            }
            if (System.getProperties().put("sbs", ans[0])!=null|true){}
        }
        return (String) System.getProperties().get("sbs");
    }
}
