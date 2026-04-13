/*
 * @lc app=leetcode id=2652 lang=java
 *
 * [2652] Sum Multiples
 */

class Solution {
    public int sumOfMultiples(int n) {
        return IntStream.rangeClosed(1, n)
            .filter(i -> i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
            .sum();
    }
}
