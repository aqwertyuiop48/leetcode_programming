/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

class Solution {
    public String reverseWords(String s) {
               return (String.join(" ",Arrays.stream(s.split(" ")).filter(i->i.trim().length()>0).collect(Collectors.toList()).reversed()));
 
    }
}
