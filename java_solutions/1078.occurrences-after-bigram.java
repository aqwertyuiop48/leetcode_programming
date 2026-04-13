/*
 * @lc app=leetcode id=1078 lang=java
 *
 * [1078] Occurrences After Bigram
 */

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        return Optional.of(text.split(" ")).map(words -> IntStream.range(0, words.length - 2).filter(i -> words[i].equals(first) && words[i + 1].equals(second)).mapToObj(i -> words[i + 2]).toArray(String[]::new)).get();
    }
}
