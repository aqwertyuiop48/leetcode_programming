/*
 * @lc app=leetcode id=592 lang=java
 *
 * [592] Fraction Addition and Subtraction
 */

class Solution {
    public String fractionAddition(String expression) {
        return java.util.regex.Pattern.compile("[+-]?\\d+/\\d+").matcher(expression).results().map(m -> m.group().split("/"))
            .map(p -> new long[]{Long.parseLong(p[0]), Long.parseLong(p[1])})
            .reduce(new long[]{0, 1}, (x, y) -> new long[]{x[0] * y[1] + y[0] * x[1], x[1] * y[1]}) instanceof long[] r
            ? r[0] / java.math.BigInteger.valueOf(r[0]).gcd(java.math.BigInteger.valueOf(r[1])).longValue() + "/" + r[1] / java.math.BigInteger.valueOf(r[0]).gcd(java.math.BigInteger.valueOf(r[1])).longValue()
            : "";
    }
}
