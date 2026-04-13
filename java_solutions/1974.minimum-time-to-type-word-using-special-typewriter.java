/*
 * @lc app=leetcode id=1974 lang=java
 *
 * [1974] Minimum Time to Type Word Using Special Typewriter
 */

class Solution {
    public int minTimeToType(String word) {
        return word.length() + IntStream.range(0, word.length())
            .map(i -> Math.abs((i == 0 ? 'a' : word.charAt(i - 1)) - word.charAt(i)))
            .map(diff -> Math.min(diff, 26 - diff))
            .sum();
    }
}
