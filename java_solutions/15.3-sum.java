/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
// semicolons : 1
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        return IntStream.range(0, Stream.of(nums).peek(n -> Arrays.sort(n)).findFirst().get().length).filter(i -> i == 0 || nums[i] != nums[i - 1]).boxed().flatMap(i -> Stream.iterate(new int[]{i + 1, nums.length - 1}, state -> state[0] < state[1], state -> nums[i] + nums[state[0]] + nums[state[1]] > 0 ? new int[]{state[0], state[1] - 1} : nums[i] + nums[state[0]] + nums[state[1]] < 0 ? new int[]{state[0] + 1, state[1]} : new int[]{IntStream.range(state[0] + 1, state[1] + 1).filter(j -> j >= state[1] || nums[j] != nums[state[0]]).findFirst().orElse(state[1]), state[1]}).filter(state -> nums[i] + nums[state[0]] + nums[state[1]] == 0).map(state -> Arrays.asList(nums[i], nums[state[0]], nums[state[1]]))).collect(Collectors.toList());
    }
}
// @lc code=end

