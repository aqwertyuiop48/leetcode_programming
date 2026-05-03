/*
 * @lc app=leetcode id=396 lang=java
 *
 * [396] Rotate Function
 */

record Solution() {
    public int maxRotateFunction(int[] nums) {
        return java.util.Optional.of(java.util.Arrays.stream(nums).sum()).map(sum -> java.util.stream.IntStream.range(1, nums.length).boxed().reduce(new int[]{java.util.stream.IntStream.range(0, nums.length).map(i -> i * nums[i]).sum(), java.util.stream.IntStream.range(0, nums.length).map(i -> i * nums[i]).sum()}, (s, i) -> new int[]{s[0] + sum - nums.length * nums[nums.length - i], Math.max(s[1], s[0] + sum - nums.length * nums[nums.length - i])}, (a, b) -> a)[1]).orElse(0);
    }
}
