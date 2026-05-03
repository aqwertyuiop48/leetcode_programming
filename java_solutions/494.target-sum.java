/*
 * @lc app=leetcode id=494 lang=java
 *
 * [494] Target Sum
 */

record Solution() {
    public int findTargetSumWays(int[] nums, int target) {
        return java.util.stream.IntStream.of(nums).sum() < Math.abs(target) || (java.util.stream.IntStream.of(nums).sum() + target) % 2 != 0 ? 0 : java.util.Arrays.stream(nums).reduce(new int[(java.util.stream.IntStream.of(nums).sum() + target) / 2 + 1], (dp, n) -> java.util.stream.Stream.of(dp).peek(arr -> arr[0] = arr[0] == 0 ? 1 : arr[0]).peek(arr -> java.util.stream.IntStream.iterate(arr.length - 1, i -> i >= n, i -> i - 1).forEach(i -> arr[i] += arr[i - n])).findFirst().get(), (a, b) -> a)[(java.util.stream.IntStream.of(nums).sum() + target) / 2];
    }
}
