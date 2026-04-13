/*
 * @lc app=leetcode id=2160 lang=java
 *
 * [2160] Minimum Sum of Four Digit Number After Splitting Digits
 */

class Solution {
    public int minimumSum(int num) {
        return Stream.of(String.valueOf(num).chars().map(c -> c - '0').sorted().toArray())
            .mapToInt(d -> 10 * (d[0] + d[1]) + d[2] + d[3])
            .findFirst()
            .getAsInt();
    }
}
