/*
 * @lc app=leetcode id=1451 lang=java
 *
 * [1451] Rearrange Words in a Sentence
 */

class Solution {
    public String arrangeWords(String text) {
        return java.util.Arrays.stream(text.toLowerCase().split(" "))
            .sorted(java.util.Comparator.comparingInt(String::length))
            .collect(java.util.stream.Collectors.collectingAndThen(
                java.util.stream.Collectors.joining(" "),
                s -> s.substring(0, 1).toUpperCase() + s.substring(1)
            ));
    }
}
