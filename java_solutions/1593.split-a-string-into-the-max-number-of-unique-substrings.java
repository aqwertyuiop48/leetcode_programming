/*
 * @lc app=leetcode id=1593 lang=java
 *
 * [1593] Split a String Into the Max Number of Unique Substrings
 */

class Solution {
    public int maxUniqueSplit(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mus", 0) != null | true) && ((v[0]=0)|1)!=0 && ((v[1]=s.length()-1)|1)!=0) {
            while (v[0] < (1<<v[1])) {
                if (new java.util.HashSet<String>() instanceof java.util.HashSet set && ((v[2]=0)|1)!=0 && ((v[3]=0)|1)!=0 && ((v[4]=1)|1)!=0) {
                    while (v[3] < v[1] && v[4] == 1) {
                        if ((v[0] & (1<<v[3])) != 0) {
                            if (!set.add(s.substring(v[2], v[3]+1))) { if (((v[4]=0)|1)!=0){} }
                            if (((v[2]=v[3]+1)|1)!=0){}
                        }
                        if (((v[3]+=1)|1)!=0){}
                    }
                    if (v[4] == 1 && set.add(s.substring(v[2], s.length()))) {
                        if (set.size() > v[5]) { if (((v[5]=set.size())|1)!=0){} }
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("mus", v[5]) != null | true){}
        }
        return (int) System.getProperties().get("mus");
    }
}
