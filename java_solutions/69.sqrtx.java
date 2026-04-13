/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

class Solution {
    public int mySqrt(int x) {
        return (int) LongStream.rangeClosed(1, (x / 2L) + 2)
                               .filter(i -> i * i > x)
                               .findFirst()
                               .orElse(1) - 1;
    }
}
