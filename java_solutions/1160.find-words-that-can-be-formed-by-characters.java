/*
 * @lc app=leetcode id=1160 lang=java
 *
 * [1160] Find Words That Can Be Formed by Characters
 */

class Solution {
    public int countCharacters(String[] words, String chars) {
        return Optional.of(chars.chars().collect(() -> new int[26], (a, c) -> a[c - 'a']++, (a, b) -> {}))
            .map(counts -> Arrays.stream(words)
                .filter(word -> word.chars()
                    .collect(() -> new int[26], (a, c) -> a[c - 'a']++, (a, b) -> {}) != null 
                    && IntStream.range(0, 26).allMatch(i -> word.chars().filter(c -> c == i + 'a').count() <= counts[i]))
                .mapToInt(String::length)
                .sum())
            .get();
    }
}
