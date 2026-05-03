/*
 * @lc app=leetcode id=416 lang=java
 *
 * [416] Partition Equal Subset Sum
 */

record Solution() {
    public boolean canPartition(int[] nums) {
        return java.util.stream.IntStream.of(nums).sum() % 2 == 0 && java.util.Arrays.stream(nums).boxed().reduce(java.math.BigInteger.ONE, (b, n) -> b.or(b.shiftLeft(n)), (a, b) -> a).testBit(java.util.stream.IntStream.of(nums).sum() / 2);
    }
}
