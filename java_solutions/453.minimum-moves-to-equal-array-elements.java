/*
 * @lc app=leetcode id=453 lang=java
 *
 * [453] Minimum Moves to Equal Array Elements
 */

record Solution() {
    public int minMoves(int[] nums) {
        return java.util.stream.IntStream.of(nums).sum() - java.util.stream.IntStream.of(nums).min().getAsInt() * nums.length;
    }
}
