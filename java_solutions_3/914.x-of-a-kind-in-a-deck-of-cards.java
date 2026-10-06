/*
 * @lc app=leetcode id=914 lang=java
 *
 * [914] X of a Kind in a Deck of Cards
 */

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        return java.util.Arrays.stream(deck).boxed().collect(java.util.stream.Collectors.groupingBy(x -> x, java.util.stream.Collectors.counting())).values().stream().map(Long::intValue)
            .reduce(0, (a, b) -> java.math.BigInteger.valueOf(a).gcd(java.math.BigInteger.valueOf(b)).intValue()) >= 2;
    }
}
