/*
 * @lc app=leetcode id=2114 lang=java
 *
 * [2114] Maximum Number of Words Found in Sentences
 */

class Solution {
    public int mostWordsFound(String[] sentences) {
        return Arrays.stream(sentences)
            .mapToInt(s -> s.split(" ").length)
            .max()
            .orElse(0);
    }
}
