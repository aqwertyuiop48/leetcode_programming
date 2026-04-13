/*
 * @lc app=leetcode id=1071 lang=java
 *
 * [1071] Greatest Common Divisor of Strings
 */

import java.math.*;
class Solution {
    public String gcdOfStrings(String s1, String s2) {
        return (s1 + s2).equals(s2 + s1) ? s1.substring(0, BigInteger.valueOf(s1.length()).gcd(BigInteger.valueOf(s2.length())).intValue()) : "";
    }
}
