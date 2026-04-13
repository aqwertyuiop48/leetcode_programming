/*
 * @lc app=leetcode id=41 lang=java
 *
 * [41] First Missing Positive
 */

class Solution { public int firstMissingPositive(int[] nums) { if (new int[]{0, 0} instanceof int[] s) while (s[0] < nums.length ? true : ((s[1] = 1) < 0)) if (nums[s[0]] > 0 && nums[s[0]] <= nums.length && nums[nums[s[0]] - 1] != nums[s[0]]) if (((s[1] = nums[s[0]]) | 1) != 0 && ((nums[s[0]] = nums[s[1] - 1]) | 1) != 0 && ((nums[s[1] - 1] = s[1]) | 1) != 0) {} else {} else if (((s[0] += 1) | 1) != 0) {} else {} if (new int[]{0, 0} instanceof int[] s) while (s[0] < nums.length ? true : ((nums[0] = s[1] == 0 ? nums.length + 1 : s[1]) < 0)) if (nums[s[0]] != s[0] + 1) if (((s[1] = s[0] + 1) | 1) != 0 && ((s[0] = nums.length + 1) | 1) != 0) {} else {} else if (((s[0] += 1) | 1) != 0) {} else {} return nums.length > 0 ? nums[0] : 1; } }
