/*
 * @lc app=leetcode id=1742 lang=java
 *
 * [1742] Maximum Number of Balls in a Box
 */

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        return IntStream.rangeClosed(lowLimit, highLimit)
            .map(n -> Stream.iterate(n, i -> i > 0, i -> i / 10).mapToInt(i -> i % 10).sum())
            .boxed()
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
            .values().stream()
            .mapToInt(Long::intValue)
            .max()
            .orElse(0);
    }
}
