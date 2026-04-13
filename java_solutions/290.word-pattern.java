/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        return Optional.of(s.split(" ")).filter(words -> words.length == pattern.length()).map(words -> IntStream.range(0, words.length).allMatch(i -> Objects.equals(IntStream.range(0, i).filter(j -> pattern.charAt(j) == pattern.charAt(i)).findFirst(), IntStream.range(0, i).filter(j -> words[j].equals(words[i])).findFirst()))).orElse(false);
    }
}
