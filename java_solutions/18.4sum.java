/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

class Solution {
    public java.util.List<java.util.List<Integer>> fourSum(int[] nums, int target) {
        return java.util.stream.Stream.of(java.util.Arrays.stream(nums).sorted().toArray()).flatMap(arr -> java.util.stream.IntStream.range(0, arr.length - 3).filter(i -> i == 0 || arr[i] != arr[i - 1]).boxed().flatMap(i -> java.util.stream.IntStream.range(i + 1, arr.length - 2).filter(j -> j == i + 1 || arr[j] != arr[j - 1]).boxed().flatMap(j -> java.util.stream.Stream.iterate(new int[]{j + 1, arr.length - 1}, s -> s[0] < s[1], s -> new int[]{arr[i] + arr[j] + arr[s[0]] + arr[s[1]] <= target ? java.util.stream.IntStream.iterate(s[0] + 1, k -> k < s[1] && arr[k] == arr[k - 1], k -> k + 1).filter(k -> k >= s[1] || arr[k] != arr[k - 1]).findFirst().orElse(s[0] + 1) : s[0], arr[i] + arr[j] + arr[s[0]] + arr[s[1]] >= target ? java.util.stream.IntStream.iterate(s[1] - 1, k -> k > s[0] && arr[k] == arr[k + 1], k -> k - 1).filter(k -> k <= s[0] || arr[k] != arr[k + 1]).findFirst().orElse(s[1] - 1) : s[1]}).filter(s -> s[0] < s[1] && (long)arr[i] + arr[j] + arr[s[0]] + arr[s[1]] == target).map(s -> java.util.Arrays.asList(arr[i], arr[j], arr[s[0]], arr[s[1]]))))).distinct().collect(java.util.stream.Collectors.toList());
    }
}
