/*
 * @lc app=leetcode id=2085 lang=java
 *
 * [2085] Count Common Words With One Occurrence
 */

class Solution {
    public int countWords(String[] words1, String[] words2) {
        return (int) Arrays.stream(words1)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream()
            .filter(e -> e.getValue() == 1)
            .map(Map.Entry::getKey)
            .filter(word -> Arrays.stream(words2)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .getOrDefault(word, 0L) == 1)
            .count();
    }
}
