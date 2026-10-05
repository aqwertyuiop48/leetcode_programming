/*
 * @lc app=leetcode id=4011 lang=java
 *
 * [4011] Count Subarrays With Even Odd Ratio I
 */

class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        return IntStream.range(0, nums.length)
            .map(i ->
                Stream.of(new int[2]) // state[0] = even, state[1] = odd
                    .mapToInt(state ->
                        IntStream.range(i, nums.length)
                            .map(j ->
                                ((nums[j] & 1) == 0 ? state[0]++ : state[1]++) * 0 +
                                (state[1] > 0 && (long) state[0] * b <= (long) state[1] * a ? 1 : 0)
                            ).sum()
                    ).findFirst().getAsInt()
            ).sum();
    }
}
