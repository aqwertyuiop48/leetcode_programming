/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        return Stream.of(a, b)
                     .map(s -> new BigInteger(s, 2))
                     .reduce(BigInteger.ZERO, BigInteger::add)
                     .toString(2);
    }
}
