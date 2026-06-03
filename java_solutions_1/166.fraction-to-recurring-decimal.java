/*
 * @lc app=leetcode id=166 lang=java
 *
 * [166] Fraction to Recurring Decimal
 */

// @lc code=start
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        return numerator == 0 ? "0" : java.util.stream.Stream.<Object[]>of(new Object[]{new java.lang.StringBuilder(), new java.util.HashMap<Long, Integer>(), Math.abs((long) numerator), Math.abs((long) denominator)})
            .peek(a -> ((java.lang.StringBuilder) a[0]).append((numerator < 0) ^ (denominator < 0) ? "-" : "").append((long) a[2] / (long) a[3]))
            .peek(a -> a[2] = ((long) a[2] % (long) a[3]) * 10)
            // Fix 1: Explicitly type Stream.<Object[]>of(a)
            .peek(a -> java.util.stream.Stream.<Object[]>of(a).filter(x -> (long) x[2] > 0).forEach(x -> ((java.lang.StringBuilder) x[0]).append(".")))
            // Fix 2: Explicitly type Stream.<Object[]>iterate(...) and the inner Stream.<Object[]>of(x)
            .peek(a -> java.util.stream.Stream.<Object[]>iterate(a, x -> (long) x[2] > 0 && !((java.util.Map<Long, Integer>) x[1]).containsKey((long) x[2]), x -> java.util.stream.Stream.<Object[]>of(x).peek(_v -> ((java.util.Map<Long, Integer>) x[1]).put((long) x[2], ((java.lang.StringBuilder) x[0]).length())).peek(_v -> ((java.lang.StringBuilder) x[0]).append((long) x[2] / (long) x[3])).peek(_v -> x[2] = ((long) x[2] % (long) x[3]) * 10).findFirst().get()).reduce((first, second) -> second).ifPresent(last -> java.util.stream.Stream.<Object[]>of(last).filter(x -> (long) x[2] > 0).forEach(x -> ((java.lang.StringBuilder) x[0]).insert(((java.util.Map<Long, Integer>) x[1]).get((long) x[2]), "(").append(")"))))
            .map(a -> ((java.lang.StringBuilder) a[0]).toString()).findFirst().get();
    }
}
// @lc code=end

