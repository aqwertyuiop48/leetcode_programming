/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        return IntStream.range(0, Math.max(word1.length(), word2.length()))
            .mapToObj(i -> (i < word1.length() ? word1.charAt(i) + "" : "") + (i < word2.length() ? word2.charAt(i) + "" : ""))
            .collect(Collectors.joining());
    }
}
