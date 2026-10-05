/*
 * @lc app=leetcode id=3915 lang=java
 *
 * [3915] Maximum Sum of Alternating Subsequence With Distance at Least K
 */

class Solution {
    public long maxAlternatingSum(int[] nums, int k) {
        return Optional.of(Arrays.stream(nums).sorted().distinct().toArray()).flatMap(s ->
            Optional.of(Arrays.stream(nums).map(v -> Arrays.binarySearch(s, v)).toArray()).flatMap(rk ->
            Optional.of(new long[][]{new long[s.length + 2], new long[s.length + 2], new long[nums.length], new long[nums.length], new long[2]}).flatMap(T ->
            Optional.of(new IntToLongFunction[2]).flatMap(qry ->
            Optional.of(new IntUnaryOperator[2]).flatMap(upd ->
            Optional.of(IntStream.range(0, 2)
                    .peek(t -> qry[t] = x -> x <= 0 ? 0L : Math.max(T[t][x], qry[t].applyAsLong(x - (x & -x))))
                    .peek(t -> upd[t] = x -> x > s.length ? 0 : upd[t].applyAsInt(x + (x & -x) + 0 * (int) (T[t][x] = Math.max(T[t][x], T[4][t]))))
                    .sum()).flatMap(ig ->
            Optional.<IntUnaryOperator>of(j -> upd[0].applyAsInt(rk[j] + 1 + 0 * (int) (T[4][0] = T[3][j]))
                                             + upd[1].applyAsInt(s.length - rk[j] + 0 * (int) (T[4][1] = T[2][j]))).map(ins ->
                IntStream.range(0, nums.length).map(z -> nums.length - 1 - z)
                    .mapToLong(i -> (i + k < nums.length ? ins.applyAsInt(i + k) : 0) * 0L
                        + Math.max(T[2][i] = nums[i] + qry[0].applyAsLong(rk[i]),
                                   T[3][i] = nums[i] + qry[1].applyAsLong(s.length - 1 - rk[i])))
                    .max().orElse(0))))))))
            .get();
    }
}

