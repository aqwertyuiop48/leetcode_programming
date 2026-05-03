/*
 * @lc app=leetcode id=166 lang=java
 *
 * [166] Fraction to Recurring Decimal
 */

class Solution {
    public String fractionToDecimal(int numerator, int divisor) {
        return numerator == 0 ? "0" : (numerator < 0 ^ divisor < 0 ? "-" : "") + Math.abs((long)numerator) / Math.abs((long)divisor) + (Math.abs((long)numerator) % Math.abs((long)divisor) == 0 ? "" : "." + java.util.stream.Stream.of(new Object[]{new java.util.HashMap<Long, Integer>(), new StringBuilder(), Math.abs((long)numerator) % Math.abs((long)divisor)}).map(arr -> java.util.stream.Stream.iterate(arr, a -> (long)a[2] != 0 && !((java.util.Map<Long, Integer>)a[0]).containsKey((long)a[2]), a -> new Object[]{((java.util.Map<Long, Integer>)a[0]).put((long)a[2], ((StringBuilder)a[1]).length()) == null ? a[0] : a[0], ((StringBuilder)a[1]).append(((long)a[2] * 10) / Math.abs((long)divisor)), ((long)a[2] * 10) % Math.abs((long)divisor)}).reduce((x, y) -> y).map(a -> (long)a[2] == 0 ? ((StringBuilder)a[1]).toString() : ((StringBuilder)a[1]).insert(((java.util.Map<Long, Integer>)a[0]).get((long)a[2]), "(").append(")").toString()).get()).findFirst().get());
    }
}
