/*
 * @lc app=leetcode id=1456 lang=java
 *
 * [1456] Maximum Number of Vowels in a Substring of Given Length
 */

class Solution {
    public int maxVowels(String s, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mv", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<s.length()) {
                if ("aeiou".indexOf(s.charAt(v[0])) != -1) { if (((v[1]+=1)|1)!=0){} }
                if (v[0]>=k && "aeiou".indexOf(s.charAt(v[0]-k)) != -1) { if (((v[1]-=1)|1)!=0){} }
                if (v[1] > v[2]) { if (((v[2]=v[1])|1)!=0){} }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("mv", v[2])!=null|true){}
        }
        return (int) System.getProperties().get("mv");
    }
}
