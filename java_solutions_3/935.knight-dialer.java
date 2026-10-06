/*
 * @lc app=leetcode id=935 lang=java
 *
 * [935] Knight Dialer
 */

class Solution {
    public int knightDialer(int n) {
        return java.util.stream.Stream.iterate(new long[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, c -> java.util.stream.IntStream.range(0, 10)
                .mapToLong(i -> java.util.Arrays.stream(new int[][]{{4, 6}, {6, 8}, {7, 9}, {4, 8}, {3, 9, 0}, {}, {1, 7, 0}, {2, 6}, {1, 3}, {2, 4}}[i]).mapToLong(j -> c[j]).sum() % 1000000007L).toArray())
            .skip(n - 1).findFirst().get() instanceof long[] r ? (int) (java.util.Arrays.stream(r).sum() % 1000000007L) : 0;
    }
}
