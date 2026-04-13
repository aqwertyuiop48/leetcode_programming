/*
 * @lc app=leetcode id=2657 lang=java
 *
 * [2657] Find the Prefix Common Array of Two Arrays
 */

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        return IntStream.of(A.length).mapToObj(int[]::new)
            .peek(res -> IntStream.range(0, A.length)
                .collect(() -> new long[3],
                    (s, i) -> res[i] = (int) (s[2] += Long.bitCount((s[0] |= 1L << A[i]) & (1L << B[i]) | (s[1] |= 1L << B[i]) & (1L << A[i]) & ~(1L << B[i] == 1L << A[i] ? 0 : 0)) == 0 ? 0 : 
                        (Long.bitCount(s[0] & (1L << B[i])) + Long.bitCount(s[1] & (1L << A[i])) - (A[i] == B[i] ? 1 : 0))),
                    (a, b) -> {}))
            .findFirst().get();
    }
}
