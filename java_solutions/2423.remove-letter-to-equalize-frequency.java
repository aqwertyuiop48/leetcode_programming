/*
 * @lc app=leetcode id=2423 lang=java
 *
 * [2423] Remove Letter To Equalize Frequency
 */

class Solution {
    public boolean equalFrequency(String word) {
        return IntStream.range(0, word.length())
            .anyMatch(i -> Optional.of(word.substring(0, i) + word.substring(i + 1))
                .map(s -> s.chars().boxed()
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                    .values().stream().distinct().count() == 1)
                .get());
    }
}
