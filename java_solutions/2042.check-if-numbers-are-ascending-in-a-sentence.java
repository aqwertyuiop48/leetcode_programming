/*
 * @lc app=leetcode id=2042 lang=java
 *
 * [2042] Check if Numbers Are Ascending in a Sentence
 */

import java.util.stream.Collectors;

class Solution {
    public boolean areNumbersAscending(String s) {
        return Arrays.stream(s.split(" "))
            .filter(w -> w.codePoints().allMatch(Character::isDigit))
            .map(Integer::parseInt)
            .collect(Collectors.collectingAndThen(
                Collectors.toList(),
                l -> java.util.stream.IntStream.range(0, l.size() - 1)
                    .allMatch(i -> l.get(i) < l.get(i + 1))
            ));
    }
}
