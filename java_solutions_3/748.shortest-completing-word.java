/*
 * @lc app=leetcode id=748 lang=java
 *
 * [748] Shortest Completing Word
 */

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        return java.util.Arrays.stream(words).filter(w -> licensePlate.chars().filter(Character::isLetter).map(Character::toLowerCase).boxed()
                .collect(java.util.stream.Collectors.groupingBy(c -> c, java.util.stream.Collectors.counting())).entrySet().stream()
                .allMatch(e -> w.chars().filter(c -> c == e.getKey()).count() >= e.getValue()))
            .min(java.util.Comparator.comparingInt(String::length)).get();
    }
}
