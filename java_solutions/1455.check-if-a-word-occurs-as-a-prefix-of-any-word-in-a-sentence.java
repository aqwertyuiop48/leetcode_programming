/*
 * @lc app=leetcode id=1455 lang=java
 *
 * [1455] Check If a Word Occurs As a Prefix of Any Word in a Sentence
 */

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        return Optional.of(sentence.split(" "))
            .map(words -> IntStream.range(0, words.length)
                .filter(i -> words[i].startsWith(searchWord))
                .map(i -> i + 1)
                .findFirst()
                .orElse(-1))
            .get();
    }
}
