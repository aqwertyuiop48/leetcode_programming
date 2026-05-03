/*
 * @lc app=leetcode id=477 lang=java
 *
 * [477] Total Hamming Distance
 */

record Solution() {
    public int totalHammingDistance(int[] nums) {
        return java.util.stream.IntStream.range(0, 32).map(i -> java.util.Optional.of((int) java.util.Arrays.stream(nums).filter(n -> ((n >> i) & 1) == 1).count()).map(c -> c * (nums.length - c)).get()).sum();
    }
}
