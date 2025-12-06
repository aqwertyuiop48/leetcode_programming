/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
// semicolons : 1
class Solution {
    public void nextPermutation(int[] nums) {IntStream.range(0, 1).forEach(x -> Optional.of(IntStream.rangeClosed(0, nums.length - 2).map(i -> nums.length - 2 - i).filter(i -> nums[i] < nums[i + 1]).findFirst().orElse(-1)).ifPresentOrElse(ind1 -> Optional.of(ind1 == -1 ? -1 : IntStream.rangeClosed(0, nums.length - 1).map(i -> nums.length - 1 - i).filter(i -> nums[i] > nums[ind1]).findFirst().orElse(-1)).ifPresent(ind2 -> Stream.of(ind1 == -1 ? 0 : ind1 + 1).peek(start -> Optional.of(ind2).filter(i -> i != -1).ifPresent(i -> IntStream.of(0).peek(z -> Stream.of(nums[ind1]).peek(temp -> Stream.of(nums[ind1]).peek(dummy -> nums[ind1] = nums[i]).forEach(dummy -> nums[i] = temp)).forEach(t -> {})).forEach(z -> {}))).forEach(start -> IntStream.range(0, (nums.length - start) / 2).forEach(i -> IntStream.of(0).peek(z -> Stream.of(nums[start + i]).peek(temp -> Stream.of(nums[start + i]).peek(dummy -> nums[start + i] = nums[nums.length - 1 - i]).forEach(dummy -> nums[nums.length - 1 - i] = temp)).forEach(t -> {})).forEach(z -> {})))), () -> IntStream.range(0, nums.length / 2).forEach(i -> IntStream.of(0).peek(z -> Stream.of(nums[i]).peek(temp -> Stream.of(nums[i]).peek(dummy -> nums[i] = nums[nums.length - 1 - i]).forEach(dummy -> nums[nums.length - 1 - i] = temp)).forEach(t -> {})).forEach(z -> {}))));}
}
// @lc code=end

