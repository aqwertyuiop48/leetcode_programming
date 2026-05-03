/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        return java.util.stream.Stream.of(java.util.Arrays.stream(nums).sorted().toArray()).map(arr -> java.util.stream.IntStream.range(0, arr.length - 2).map(i -> java.util.stream.Stream.iterate(new int[]{i + 1, arr.length - 1}, s -> s[0] < s[1], s -> new int[]{arr[i] + arr[s[0]] + arr[s[1]] <= target ? s[0] + 1 : s[0], arr[i] + arr[s[0]] + arr[s[1]] > target ? s[1] - 1 : s[1]}).mapToInt(s -> arr[i] + arr[s[0]] + arr[s[1]]).reduce((a, b) -> Math.abs(a - target) < Math.abs(b - target) ? a : b).getAsInt()).reduce((a, b) -> Math.abs(a - target) < Math.abs(b - target) ? a : b).getAsInt()).findFirst().get();
    }
}
