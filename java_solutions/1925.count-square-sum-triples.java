/*
 * @lc app=leetcode id=1925 lang=java
 *
 * [1925] Count Square Sum Triples
 */

class Solution {
    public int countTriples(int n) {
        return (int) IntStream.rangeClosed(1, n)
            .mapToLong(a -> IntStream.rangeClosed(1, n)
                .filter(b -> Math.sqrt(a * a + b * b) <= n && Math.sqrt(a * a + b * b) % 1 == 0)
                .count())
            .sum();
    }
}
