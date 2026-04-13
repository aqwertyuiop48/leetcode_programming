/*
 * @lc app=leetcode id=2575 lang=java
 *
 * [2575] Find the Divisibility Array of a String
 */

class Solution {
    public int[] divisibilityArray(String word, int m) {
        return Stream.of(new long[1])
            .flatMapToInt(rem -> IntStream.range(0, word.length())
                .map(i -> (int) (rem[0] = (rem[0] * 10 + (word.charAt(i) - '0')) % m) == 0 ? 1 : 0))
            .toArray();
    }
}
