/*
 * @lc app=leetcode id=2035 lang=java
 *
 * [2035] Partition Array Into Two Arrays to Minimize Sum Difference
 */

class Solution {
    public int minimumDifference(int[] nums) {
        return ((Function<int[][], Function<int[][], Function<int[], Function<int[], Integer>>>>) lSum -> rSum -> lSz -> rSz -> ((ToIntFunction<int[]>) state -> 
            IntStream.range(0, 1 << (nums.length / 2)).reduce(0, (acc, mask) -> (state[0] = Integer.bitCount(mask)) * 0 + (lSum[state[0]][lSz[state[0]]++] = IntStream.range(0, nums.length / 2).filter(j -> (mask & (1 << j)) != 0).map(j -> nums[j]).sum()) * 0 + (rSum[state[0]][rSz[state[0]]++] = IntStream.range(0, nums.length / 2).filter(j -> (mask & (1 << j)) != 0).map(j -> nums[j + nums.length / 2]).sum()) * 0) * 0 == 0 &&
            IntStream.rangeClosed(0, nums.length / 2).reduce(0, (acc, i) -> ((Function<int[], Integer>) arr -> (lSum[i] = arr).hashCode() * 0).apply(IntStream.of(lSum[i]).limit(lSz[i]).sorted().toArray()) + ((Function<int[], Integer>) arr -> (rSum[i] = arr).hashCode() * 0).apply(IntStream.of(rSum[i]).limit(rSz[i]).sorted().toArray())) * 0 == 0 &&
            (state[1] = IntStream.of(nums).sum()) * 0 == 0 && (state[2] = Integer.MAX_VALUE) * 0 == 0 ?
            IntStream.rangeClosed(0, nums.length / 2).reduce(0, (acc, i) -> (state[3] = 0) * 0 + (state[4] = rSz[nums.length / 2 - i] - 1) * 0 + IntStream.iterate(0, d -> state[3] < lSz[i] && state[4] >= 0, d -> d + 1).reduce(0, (a, d) -> (state[5] = lSum[i][state[3]] + rSum[nums.length / 2 - i][state[4]]) * 0 + (state[2] = Math.min(state[2], Math.abs(state[1] - 2 * state[5]))) * 0 + (2 * state[5] < state[1] ? (state[3]++) * 0 : (state[4]--) * 0)) * 0) * 0 == 0 ? state[2] : 0 : 0
        ).applyAsInt(new int[6])).apply(new int[nums.length / 2 + 1][1 << (nums.length / 2)]).apply(new int[nums.length / 2 + 1][1 << (nums.length / 2)]).apply(new int[nums.length / 2 + 1]).apply(new int[nums.length / 2 + 1]);
    }
}
