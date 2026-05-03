/*
 * @lc app=leetcode id=462 lang=java
 *
 * [462] Minimum Moves to Equal Array Elements II
 */

record Solution() {
    public int minMoves2(int[] nums) {
        return java.util.Optional.of(java.util.Arrays.stream(nums).sorted().toArray()).map(arr -> java.util.Arrays.stream(arr).map(n -> Math.abs(n - arr[arr.length / 2])).sum()).get();
    }
}
