/*
 * @lc app=leetcode id=540 lang=java
 *
 * [540] Single Element in a Sorted Array
 */

record Solution() {
    public int singleNonDuplicate(int[] nums) {
        return java.util.stream.Stream.iterate(new int[]{0, nums.length - 1}, b -> b[0] < b[1], b -> java.util.Optional.of(b[0] + (b[1] - b[0]) / 4 * 2).map(m -> nums[m] == nums[m + 1] ? new int[]{m + 2, b[1]} : new int[]{b[0], m}).get()).reduce((a, b) -> b).get()[0];
    }
}
