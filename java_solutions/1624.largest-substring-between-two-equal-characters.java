/*
 * @lc app=leetcode id=1624 lang=java
 *
 * [1624] Largest Substring Between Two Equal Characters
 */

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        return CompletableFuture.supplyAsync(() -> IntStream.range(0, s.length())
                .map(i -> s.lastIndexOf(s.charAt(i)) - s.indexOf(s.charAt(i)) - 1)
                .max()
                .orElse(-1))
            .join();
    }
}
