/*
 * @lc app=leetcode id=916 lang=java
 *
 * [916] Word Subsets
 */

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        return java.util.stream.IntStream.range(0, 26).map(c -> java.util.Arrays.stream(words2).mapToInt(w -> (int) w.chars().filter(x -> x == 'a' + c).count()).max().orElse(0)).toArray() instanceof int[] need
            ? java.util.Arrays.stream(words1).filter(w -> java.util.stream.IntStream.range(0, 26).allMatch(c -> w.chars().filter(x -> x == 'a' + c).count() >= need[c])).toList() : null;
    }
}
