/*
 * @lc app=leetcode id=1175 lang=java
 *
 * [1175] Prime Arrangements
 */

class Solution {
    public int numPrimeArrangements(int n) {
        return new java.util.function.IntFunction[1] instanceof java.util.function.IntFunction[] f && (f[0] = num -> java.util.stream.IntStream.rangeClosed(2, num).allMatch(i -> i == num || num % i != 0) ? 1 : 0) != null ? new Object[]{(int)java.util.stream.IntStream.rangeClosed(2, n).map(i -> (int)f[0].apply(i)).sum()} instanceof Object[] p && java.util.stream.LongStream.rangeClosed(1, (int)p[0]).reduce(1L, (a,b)->(a*b)%1000000007) * java.util.stream.LongStream.rangeClosed(1, n - (int)p[0]).reduce(1L, (a,b)->(a*b)%1000000007) % 1000000007 instanceof Long res ? res.intValue() : 0 : 0;
    }
}
