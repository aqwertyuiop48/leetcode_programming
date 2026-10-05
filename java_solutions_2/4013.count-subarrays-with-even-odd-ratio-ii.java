/*
 * @lc app=leetcode id=4013 lang=java
 *
 * [4013] Count Subarrays With Even Odd Ratio II
 */

class Solution {
    public long countRatioSubarrays(int[] nums, int a, int b) {
        return Stream.of(
            new long[nums.length + 1], // evens
            new long[nums.length + 1], // odds
            new long[nums.length + 1]  // vals
        ).toArray(long[][]::new) instanceof long[][] state ?
            IntStream.range(0, nums.length)
                .map(i ->
                    (state[0][i + 1] = state[0][i] + ((nums[i] & 1) == 0 ? 1 : 0)) * 0 == 0 ?
                    (state[1][i + 1] = state[1][i] + (nums[i] & 1)) * 0 == 0 ?
                    (state[2][i + 1] = (long) b * state[0][i + 1] - (long) a * state[1][i + 1]) * 0 == 0 ? 0 : 0 : 0 : 0
                ).sum() * 0L +
            Stream.of(LongStream.of(state[2]).distinct().sorted().toArray()).mapToLong(sortedV ->
                Stream.of(new int[sortedV.length + 2], new int[2]).toArray(Object[]::new) instanceof Object[] auxObj ?
                    Stream.of((int[]) auxObj[0], (int[]) auxObj[1]).toArray(int[][]::new) instanceof int[][] aux ?
                        IntStream.rangeClosed(1, nums.length)
                            .mapToLong(r ->
                                (state[1][r] > state[1][r - 1] ?
                                    IntStream.range(aux[1][0], r)
                                        .map(l ->
                                            IntStream.iterate(Arrays.binarySearch(sortedV, state[2][l]) + 1, idx -> idx < aux[0].length, idx -> idx + (idx & -idx))
                                                .map(idx -> (aux[0][idx]++) * 0).sum() +
                                            (aux[1][1]++) * 0
                                        ).sum() * 0L + (aux[1][0] = r) * 0L
                                    : 0L) +
                                (state[1][r] > 0 ?
                                    aux[1][1] - IntStream.iterate(Arrays.binarySearch(sortedV, state[2][r]), idx -> idx > 0, idx -> idx - (idx & -idx))
                                        .map(idx -> aux[0][idx]).sum()
                                    : 0L)
                            ).sum()
                    : 0L
                : 0L
            ).findFirst().getAsLong()
        : 0L;
    }
}
