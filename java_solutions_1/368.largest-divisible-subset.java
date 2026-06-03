/*
 * @lc app=leetcode id=368 lang=java
 *
 * [368] Largest Divisible Subset
 */

// @lc code=start
class Solution {
    public java.util.List<Integer> largestDivisibleSubset(int[] nums) {
        return java.util.stream.Stream.of(0).peek(_v -> java.util.Arrays.sort(nums)).map(_v -> new int[][]{new int[nums.length], new int[nums.length]}).peek(a -> java.util.Arrays.fill(a[0], 1)).peek(a -> java.util.Arrays.fill(a[1], -1)).peek(a -> java.util.stream.IntStream.range(0, nums.length).forEach(i -> java.util.stream.IntStream.range(0, i).filter(j -> nums[i] % nums[j] == 0 && a[0][i] < a[0][j] + 1).forEach(j -> java.util.stream.Stream.of(0).peek(_x -> a[0][i] = a[0][j] + 1).forEach(_x -> a[1][i] = j)))).map(a -> java.util.stream.Stream.iterate(java.util.stream.IntStream.range(0, nums.length).reduce((i, j) -> a[0][i] > a[0][j] ? i : j).getAsInt(), i -> i != -1, i -> a[1][i]).map(i -> nums[i]).collect(java.util.stream.Collectors.toList())).findFirst().get();
    }
}
// @lc code=end
