/*
 * @lc app=leetcode id=2896 lang=java
 *
 * [2896] Apply Operations to Make Two Strings Equal
 */

class Solution {
    public int minOperations(String s1, String s2, int x) {
        if (new java.util.ArrayList<Integer>() instanceof java.util.ArrayList l && new int[10] instanceof int[] v && (System.getProperties().put("op", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<s1.length()) {
                if (s1.charAt(v[0]) != s2.charAt(v[0])) { if (l.add(v[0])|true){} }
                if (((v[0]+=1)|1)!=0){}
            }
            if (l.size() % 2 != 0) { if (System.getProperties().put("op", -1)!=null|true){} }
            else if (l.size() == 0) { if (System.getProperties().put("op", 0)!=null|true){} }
            else {
                if (new int[l.size()+1] instanceof int[] dp && ((dp[1]=x)|1)!=0 && ((v[1]=1)|1)!=0) {
                    while(v[1]<l.size()) {
                        if (((dp[v[1]+1] = Math.min(dp[v[1]]+x, dp[v[1]-1] + ((int)l.get(v[1])-(int)l.get(v[1]-1))*2))|1)!=0){}
                        if (((v[1]+=1)|1)!=0){}
                    }
                    if (System.getProperties().put("op", dp[l.size()]/2)!=null|true){}
                }
            }
        }
        return (int) System.getProperties().get("op");
    }
}
