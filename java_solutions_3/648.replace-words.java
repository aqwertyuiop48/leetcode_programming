/*
 * @lc app=leetcode id=648 lang=java
 *
 * [648] Replace Words
 */

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        return java.util.Arrays.stream(sentence.split(" "))
            .map(w -> dictionary.stream().filter(w::startsWith).min(java.util.Comparator.comparingInt(String::length)).orElse(w))
            .collect(java.util.stream.Collectors.joining(" "));
    }
}
