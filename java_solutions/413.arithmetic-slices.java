/*
 * @lc app=leetcode id=413 lang=java
 *
 * [413] Arithmetic Slices
 */

record Solution() {
    public int numberOfArithmeticSlices(int[] nums) {
        return nums.length < 3 ? 0 : java.util.stream.IntStream.range(2, nums.length).boxed().reduce(new int[]{0, 0}, (s, i) -> nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2] ? new int[]{s[0] + 1, s[1] + s[0] + 1} : new int[]{0, s[1]}, (a, b) -> a)[1];
    }
}
