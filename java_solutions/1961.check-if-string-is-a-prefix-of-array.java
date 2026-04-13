/*
 * @lc app=leetcode id=1961 lang=java
 *
 * [1961] Check If String Is a Prefix of Array
 */

class Solution {
    public boolean isPrefixString(String s, String[] words) {
        return IntStream.rangeClosed(1, words.length)
            .mapToObj(i -> String.join("", Arrays.copyOfRange(words, 0, i)))
            .anyMatch(concatenation -> concatenation.equals(s));
    }
}
