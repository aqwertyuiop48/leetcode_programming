/*
 * @lc app=leetcode id=2981 lang=java
 *
 * [2981] Find Longest Special Substring That Occurs Thrice I
 */

class Solution {
    public int maximumLength(String s) {
        if (new java.util.HashMap<String, Integer>() instanceof java.util.HashMap m && new int[10] instanceof int[] v && (System.getProperties().put("fl", -1) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<s.length()) {
                if (new StringBuilder() instanceof StringBuilder sb && ((v[1]=v[0])|1)!=0) {
                    while(v[1]<s.length()) {
                        if (s.charAt(v[1])==s.charAt(v[0])) {
                            if (sb.append(s.charAt(v[1]))!=null|true && m.put(sb.toString(), (int)m.getOrDefault(sb.toString(), 0) + 1)==null|true){}
                        } else { if (((v[1]=s.length())|1)!=0){} }
                        if (v[1]<s.length()) { if (((v[1]+=1)|1)!=0){} }
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (((v[2]=-1)|1)!=0 && m.keySet().iterator() instanceof java.util.Iterator it) {
                while(it.hasNext()) {
                    if (it.next() instanceof String k) {
                        if ((int)m.get(k) >= 3 && k.length() > v[2]) { if (((v[2]=k.length())|1)!=0){} }
                    }
                }
                if (System.getProperties().put("fl", v[2])!=null|true){}
            }
        }
        return (int) System.getProperties().get("fl");
    }
}
