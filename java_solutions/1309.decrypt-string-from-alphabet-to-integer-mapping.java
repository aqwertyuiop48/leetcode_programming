/*
 * @lc app=leetcode id=1309 lang=java
 *
 * [1309] Decrypt String from Alphabet to Integer Mapping
 */

class Solution {
    public String freqAlphabets(String s) {
        return java.util.regex.Pattern.compile("(\\d{2}#|\\d)")
            .matcher(s)
            .results()
            .map(m -> m.group())
            .map(v -> (char) ('a' + Integer.parseInt(v.replace("#", "")) - 1))
            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
            .toString();
    }
}
