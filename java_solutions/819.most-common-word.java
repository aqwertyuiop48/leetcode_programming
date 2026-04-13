/*
 * @lc app=leetcode id=819 lang=java
 *
 * [819] Most Common Word
 */

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        return Arrays.stream(paragraph.toLowerCase().split("[^a-z]+"))
            .filter(word -> !word.isEmpty() && !Set.of(banned).contains(word))
            .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
            .entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .get().getKey();
    }
}
