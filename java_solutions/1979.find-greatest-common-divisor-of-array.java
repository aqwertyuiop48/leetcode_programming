/*
 * @lc app=leetcode id=1979 lang=java
 *
 * [1979] Find Greatest Common Divisor of Array
 */

import java.math.BigInteger;

class Solution {
    public int findGCD(int[] nums) {
        return BigInteger.valueOf(Arrays.stream(nums).min().getAsInt())
            .gcd(BigInteger.valueOf(Arrays.stream(nums).max().getAsInt()))
            .intValue();
    }
}
