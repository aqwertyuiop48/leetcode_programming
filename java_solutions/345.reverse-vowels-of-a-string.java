/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

import java.util.regex.*;
class Solution {
    public String reverseVowels(String s) {
        return Optional.of(new int[]{0}).map(i -> Optional.of(s.replaceAll("(?i)[^aeiou]", "")).map(v -> new StringBuilder(v).reverse().toString()).map(rv -> Pattern.compile("(?i)[aeiou]").matcher(s).replaceAll(res -> Matcher.quoteReplacement(String.valueOf(rv.charAt(i[0]++))))).get()).get();
    }
}
