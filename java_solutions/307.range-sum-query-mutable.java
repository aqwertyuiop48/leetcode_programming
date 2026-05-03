/*
 * @lc app=leetcode id=307 lang=java
 *
 * [307] Range Sum Query - Mutable
 */

record NumArray(int[] nums) {
    public NumArray { if (java.util.stream.IntStream.range(0, nums.length).peek(i -> java.util.Optional.of(i | (i + 1)).filter(p -> p < nums.length).ifPresent(p -> nums[p] += nums[i])).count() >= 0) {} }
    public void update(int i, int v) { if (java.util.stream.Stream.of(v - sumRange(i, i)).peek(d -> java.util.stream.Stream.iterate(i, x -> x < nums.length, x -> x | (x + 1)).forEach(x -> nums[x] += d)).count() >= 0) {} }
    public int sum(int i) { return java.util.stream.Stream.iterate(i, x -> x >= 0, x -> (x & (x + 1)) - 1).mapToInt(x -> nums[x]).sum(); }
    public int sumRange(int l, int r) { return sum(r) - sum(l - 1); }
}
