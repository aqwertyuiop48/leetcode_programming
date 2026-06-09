/*
 * @lc app=leetcode id=524 lang=java
 *
 * [524] Longest Word in Dictionary through Deleting
 */

class Solution {
    public String findLongestWord(String s, java.util.List<String> dictionary) {
        return dictionary.stream().sorted((a, b) -> a.length() != b.length() ? Integer.compare(b.length(), a.length()) : a.compareTo(b)).filter(w -> java.util.stream.Stream.of(new int[]{0}).map(ptr -> s.chars().anyMatch(c -> ptr[0] < w.length() && c == w.charAt(ptr[0]) && ++ptr[0] == w.length())).findFirst().get()).findFirst().orElse("");
    }
}
