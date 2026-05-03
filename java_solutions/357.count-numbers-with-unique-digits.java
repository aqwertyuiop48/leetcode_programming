/*
 * @lc app=leetcode id=357 lang=java
 *
 * [357] Count Numbers with Unique Digits
 */

class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        return n == 0 ? 1 : java.util.stream.IntStream.rangeClosed(1, n).map(i -> i == 1 ? 10 : 9 * java.util.stream.IntStream.rangeClosed(1, i - 1).reduce(1, (acc, val) -> acc * (10 - val))).sum();
    }
}
