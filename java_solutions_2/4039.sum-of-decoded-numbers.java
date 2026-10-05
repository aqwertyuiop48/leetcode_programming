/*
 * @lc app=leetcode id=4039 lang=java
 *
 * [4039] Sum of Decoded Numbers
 */

import java.math.BigInteger;
class Solution {
public int sumDecoded(long[] nums) {
    return (int) (Arrays.stream(nums)
        .map(c -> Stream.of(Long.toString(c / 10))
            .mapToLong(dec -> new BigInteger(dec.substring(0, (int) (c % 10)))
                .modPow(new BigInteger(dec.substring((int) (c % 10))), BigInteger.valueOf(1_000_000_007L))
                .longValue())
            .sum())
        .sum() % 1_000_000_007L);
}
}
