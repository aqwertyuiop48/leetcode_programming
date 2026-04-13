/*
 * @lc app=leetcode id=1935 lang=java
 *
 * [1935] Maximum Number of Words You Can Type
 */

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        return (int) Arrays.stream(text.split(" "))
            .filter(word -> word.chars().noneMatch(c -> brokenLetters.indexOf(c) >= 0))
            .count();
    }
}
