/*
 * @lc app=leetcode id=4072 lang=java
 *
 * [4072] Maximum Alternating Subarray Sum With One Deletion
 */

class Solution {
    public long maxAlternatingSum(int[] nums) {
        return java.util.Arrays.stream(nums).boxed().reduce(new long[]{Long.MIN_VALUE / 4, Long.MIN_VALUE / 4, Long.MIN_VALUE / 4, Long.MIN_VALUE / 4, Long.MIN_VALUE / 4, Long.MIN_VALUE / 4, Long.MIN_VALUE / 4},
            (s, x) -> java.util.stream.Stream.of(new long[]{Math.max(x, s[1] + x), s[0] - x, Math.max(s[5] + x, s[3] + x), Math.max(s[4] - x, s[2] - x)})
                .map(t -> new long[]{t[0], t[1], t[2], t[3], s[0], s[1], Math.max(s[6], Math.max(Math.max(t[0], t[1]), Math.max(t[2], t[3])))}).findFirst().get(), (a, b) -> a)[6];
    }
}
