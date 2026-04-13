/*
 * @lc app=leetcode id=1880 lang=java
 *
 * [1880] Check if Word Equals Summation of Two Words
 */

class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return Stream.of(firstWord, secondWord, targetWord)
            .map(word -> word.chars().reduce(0, (val, c) -> val * 10 + (c - 'a')))
            .collect(Collectors.collectingAndThen(
                Collectors.toList(), 
                list -> list.get(0) + list.get(1) == list.get(2)
            ));
    }
}
