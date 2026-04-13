/*
 * @lc app=leetcode id=1859 lang=java
 *
 * [1859] Sorting the Sentence
 */

class Solution {
    public String sortSentence(String s) {
        return Arrays.stream(s.split(" "))
            .sorted(Comparator.comparingInt(word -> word.charAt(word.length() - 1)))
            .map(word -> word.substring(0, word.length() - 1))
            .collect(Collectors.joining(" "));
    }
}
