/*
 * @lc app=leetcode id=3911 lang=java
 *
 * [3911] K-th Smallest Remaining Even Integer in Subarray Queries
 */

class Solution {
    public int[] kthRemainingInteger(int[] nums, int[][] queries) {
        return java.util.stream.IntStream.range(0, nums.length).filter(i -> nums[i] % 2 == 0).map(i -> nums[i] / 2).toArray() instanceof int[] ev
            && new int[nums.length + 1] instanceof int[] pc && java.util.stream.IntStream.range(0, nums.length).peek(i -> pc[i + 1] = pc[i] + (nums[i] % 2 == 0 ? 1 : 0)).allMatch(x -> true)
            ? java.util.Arrays.stream(queries).mapToInt(q -> ((java.util.function.UnaryOperator<int[]>) b -> ev[pc[q[0]] + (b[0] + b[1] + 1) / 2 - 1] - (b[0] + b[1] + 1) / 2 < q[2]
                    ? new int[]{(b[0] + b[1] + 1) / 2, b[1]} : new int[]{b[0], (b[0] + b[1] + 1) / 2 - 1}) instanceof java.util.function.UnaryOperator<int[]> st
                && new int[]{0, pc[q[1] + 1] - pc[q[0]]} instanceof int[] sd
                ? 2 * (q[2] + java.util.stream.Stream.iterate(sd, b -> b[0] < b[1], st).reduce((x, y) -> y).map(st).orElse(sd)[0]) : 0).toArray()
            : null;
    }
}
