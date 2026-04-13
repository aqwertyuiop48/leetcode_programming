/*
 * @lc app=leetcode id=524 lang=java
 *
 * [524] Longest Word in Dictionary through Deleting
 */

class Solution {
    public String findLongestWord(String s, List<String> d) {
        return d.stream().filter(word -> s.chars().reduce(0, (pos, c) -> pos < word.length() && c == word.charAt(pos) ? pos + 1 : pos) == word.length()).min(Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder())).orElse("");
    }
}
