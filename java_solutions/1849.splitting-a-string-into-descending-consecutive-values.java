/*
 * @lc app=leetcode id=1849 lang=java
 *
 * [1849] Splitting a String Into Descending Consecutive Values
 */

class Solution {
    public boolean splitString(String s) {
        return java.util.Optional.of(new java.util.function.BiFunction[1])
            .filter(f -> (f[0] = (java.util.function.BiFunction<Integer, java.math.BigInteger, Boolean>) (idx, prev) -> 
                idx == s.length() ? true : 
                java.util.stream.IntStream.range(idx + 1, s.length() + 1)
                    .anyMatch(end -> new java.math.BigInteger(s.substring(idx, end)).equals(prev.subtract(java.math.BigInteger.ONE)) 
                        && ((java.util.function.BiFunction<Integer, java.math.BigInteger, Boolean>) f[0]).apply(end, prev.subtract(java.math.BigInteger.ONE)))
            ) != null)
            .map(f -> java.util.stream.IntStream.range(1, s.length())
                .anyMatch(i -> ((java.util.function.BiFunction<Integer, java.math.BigInteger, Boolean>) f[0]).apply(i, new java.math.BigInteger(s.substring(0, i)))))
            .get();
    }
}
