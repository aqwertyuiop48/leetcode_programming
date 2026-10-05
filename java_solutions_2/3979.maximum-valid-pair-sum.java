/*
 * @lc app=leetcode id=3979 lang=java
 *
 * [3979] Maximum Valid Pair Sum
 */

class Solution {
public int maxValidPairSum(int[] a, int k) {
    return Stream.of(new int[a.length + 1]).peek(sf -> IntStream.range(0, a.length).map(i -> a.length - 1 - i).forEach(i -> sf[i] = Math.max(a[i], sf[i + 1]))).mapToInt(sf -> IntStream.concat(IntStream.of(0), IntStream.range(0, a.length - k).map(i -> a[i] + sf[i + k])).max().getAsInt()).sum();
}
}
