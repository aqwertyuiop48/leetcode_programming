/*
 * @lc app=leetcode id=2515 lang=java
 *
 * [2515] Shortest Distance to Target String in a Circular Array
 */

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        return IntStream.range(0, words.length)
            .filter(i -> words[i].equals(target))
            .map(i -> Math.min(Math.abs(i - startIndex), words.length - Math.abs(i - startIndex)))
            .min()
            .orElse(-1);
    }
}
