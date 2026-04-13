/*
 * @lc app=leetcode id=744 lang=java
 *
 * [744] Find Smallest Letter Greater Than Target
 */

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return (char) IntStream.range(0, letters.length)
            .map(i -> letters[i])
            .filter(c -> c > target)
            .findFirst()
            .orElse(letters[0]);
    }
}
