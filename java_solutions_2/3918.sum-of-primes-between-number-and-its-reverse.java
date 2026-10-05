/*
 * @lc app=leetcode id=3918 lang=java
 *
 * [3918] Sum of Primes Between Number and Its Reverse
 */

class Solution {
public int sumOfPrimesInRange(int n) {
    return IntStream.of(Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString())).map(rev -> IntStream.rangeClosed(Math.min(n, rev), Math.max(n, rev)).filter(i -> i > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(i)).noneMatch(d -> i % d == 0)).sum()).sum();
}
}
