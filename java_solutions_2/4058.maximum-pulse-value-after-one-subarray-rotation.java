/*
 * @lc app=leetcode id=4058 lang=java
 *
 * [4058] Maximum Pulse Value After One Subarray Rotation
 */

class Solution {
    public long maxValue(int[] A) {
        return java.util.stream.Stream.of(java.util.stream.IntStream.range(0, A.length).boxed().reduce(new long[]{0L, 0L, -1000000000000000000L, 0L}, (s, i) -> (long[]) new Object[]{0L, s[0] += ((i & 1) == 1 ? -A[i] : A[i]), s[1] = Math.min(s[1], s[0] - s[2 + (i & 1)]), s[2 + (i & 1)] = Math.max(s[2 + (i & 1)], s[0]), s}[4], (a, b) -> a)).mapToLong(res -> res[0] - res[1] - res[1]).findFirst().getAsLong();
    }
}
