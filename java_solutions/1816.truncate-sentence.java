/*
 * @lc app=leetcode id=1816 lang=java
 *
 * [1816] Truncate Sentence
 */

class Solution {
    public String truncateSentence(String s, int k) {
        return String.join(" ",Arrays.copyOfRange(s.split(" "),0,k));
    }
}
