/*
 * @lc app=leetcode id=858 lang=java
 *
 * [858] Mirror Reflection
 */

class Solution {
    public int mirrorReflection(int p, int q) {
        return java.util.stream.IntStream.of(java.math.BigInteger.valueOf(p).gcd(java.math.BigInteger.valueOf(q)).intValue()).map(g -> (q / g) % 2 == 0 ? 0 : (p / g) % 2 == 0 ? 2 : 1).findFirst().getAsInt();
    }
}
