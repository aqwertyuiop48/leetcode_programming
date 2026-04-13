/*
 * @lc app=leetcode id=3681 lang=java
 *
 * [3681] Maximum XOR of Subsequences
 */

class Solution {
    public int maxXorSubsequences(int[] nums) {
        return Stream.<int[][]>of(new int[1][32])
            .peek(st -> IntStream.of(nums).allMatch(num -> Stream.of(new int[]{num}).allMatch(x -> 
                IntStream.iterate(31, i -> i >= 0 && x[0] != 0, i -> i - 1).allMatch(i -> 
                    ((x[0] & (1 << i)) == 0) || (
                        st[0][i] == 0 ? (st[0][i] = x[0]) >= 0 && (x[0] = 0) == 0 : (x[0] ^= st[0][i]) >= -1
                    )
                ) || true
            )))
            .mapToInt(st -> IntStream.iterate(31, i -> i >= 0, i -> i - 1).reduce(0, (max, i) -> Math.max(max, max ^ st[0][i])))
            .findFirst().getAsInt();
    }
}
