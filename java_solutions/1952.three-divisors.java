/*
 * @lc app=leetcode id=1952 lang=java
 *
 * [1952] Three Divisors
 */

class Solution {
    public boolean isThree(int n) {
        return IntStream.rangeClosed(1, n)
            .filter(i -> n % i == 0)
            .count() == 3;
    }
}
