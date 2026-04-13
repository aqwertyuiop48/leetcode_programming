/*
 * @lc app=leetcode id=3743 lang=java
 *
 * [3743] Maximize Cyclic Partition Score
 */

class Solution {
    public long maximumScore(int[] nums, int k) {
        return Stream.<Object[]>of(new Object[]{new int[]{0}, new long[(k + 1) * 3]})
            .peek(s -> IntStream.range(1, nums.length).forEach(i -> ((int[]) s[0])[0] = nums[i] > nums[((int[]) s[0])[0]] ? i : ((int[]) s[0])[0]))
            .mapToLong(s -> Arrays.stream(new int[]{0, 1}).mapToLong(pass -> Stream.of((long[]) s[1])
                .peek(f -> Arrays.fill(f, -1000000000000000L))
                .peek(f -> f[0] = 0L)
                .peek(f -> IntStream.range(((int[]) s[0])[0] + pass, ((int[]) s[0])[0] + pass + nums.length)
                    .forEach(i -> IntStream.iterate(k, j -> j >= 1, j -> j - 1)
                        .forEach(j -> Stream.of(nums[i % nums.length]).forEach(p -> LongStream.of(
                            (f[j * 3] = Math.max(f[j * 3], Math.max(f[j * 3 + 1] + p, f[j * 3 + 2] - p))) |
                            (f[j * 3 + 1] = Math.max(f[j * 3 + 1], f[(j - 1) * 3] - p)) |
                            (f[j * 3 + 2] = Math.max(f[j * 3 + 2], f[(j - 1) * 3] + p))
                        ).forEach(ignored -> {})))))
                .mapToLong(f -> IntStream.rangeClosed(0, k).mapToLong(j -> f[j * 3]).max().getAsLong()).findFirst().getAsLong()).max().getAsLong())
            .findFirst().getAsLong();
    }
}
