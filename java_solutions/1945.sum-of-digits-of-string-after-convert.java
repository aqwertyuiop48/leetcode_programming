/*
 * @lc app=leetcode id=1945 lang=java
 *
 * [1945] Sum of Digits of String After Convert
 */

class Solution {
    public int getLucky(String s, int k) {
        return IntStream.range(0, k).reduce(
            s.chars()
             .mapToObj(c -> String.valueOf(c - 'a' + 1))
             .collect(Collectors.joining())
             .chars()
             .map(c -> c - '0')
             .sum(),
            (res, i) -> i == 0 ? res : String.valueOf(res).chars().map(c -> c - '0').sum()
        );
    }
}
