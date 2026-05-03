/*
 * @lc app=leetcode id=1447 lang=java
 *
 * [1447] Simplified Fractions
 */

class Solution {
    public java.util.List<String> simplifiedFractions(int n) {
        return java.util.stream.IntStream.rangeClosed(2, n)
            .boxed()
            .flatMap(b -> java.util.stream.IntStream.range(1, b)
                .filter(a -> java.math.BigInteger.valueOf(a).gcd(java.math.BigInteger.valueOf(b)).intValue() == 1)
                .mapToObj(a -> a + "/" + b))
            .collect(java.util.stream.Collectors.toList());
    }
}
