/*
 * @lc app=leetcode id=2309 lang=java
 *
 * [2309] Greatest English Letter in Upper and Lower Case
 */

class Solution {
    public String greatestLetter(String s) {
        return Optional.of(s.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()))
            .map(set -> IntStream.rangeClosed(0, 25).map(i -> 'Z' - i)
                .filter(c -> set.contains((char) c) && set.contains((char) (c + 32)))
                .mapToObj(c -> String.valueOf((char) c))
                .findFirst().orElse(""))
            .get();
    }
}
