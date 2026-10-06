/*
 * @lc app=leetcode id=3897 lang=java
 *
 * [3897] Maximum Value of Concatenated Binary Segments
 */

class Solution {
    public int maxValue(int[] nums1, int[] nums0) {
        return java.util.stream.IntStream.range(0, nums1.length).boxed()
            .sorted(java.util.Comparator.comparingInt((Integer i) -> nums0[i] == 0 ? 0 : 1).thenComparingInt(i -> nums0[i] == 0 ? 0 : -nums1[i]).thenComparingInt(i -> nums0[i]))
            .reduce(java.math.BigInteger.ZERO, (acc, i) -> acc.multiply(java.math.BigInteger.TWO.modPow(java.math.BigInteger.valueOf(nums1[i] + nums0[i]), java.math.BigInteger.valueOf(1000000007L)))
                .add(java.math.BigInteger.TWO.modPow(java.math.BigInteger.valueOf(nums1[i]), java.math.BigInteger.valueOf(1000000007L)).subtract(java.math.BigInteger.ONE)
                    .multiply(java.math.BigInteger.TWO.modPow(java.math.BigInteger.valueOf(nums0[i]), java.math.BigInteger.valueOf(1000000007L)))).mod(java.math.BigInteger.valueOf(1000000007L)), (a, b) -> a).intValue();
    }
}
