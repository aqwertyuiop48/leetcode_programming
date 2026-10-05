/*
 * @lc app=leetcode id=3934 lang=java
 *
 * [3934] Smallest Unique Subarray
 */

class Solution {
public int smallestUniqueSubarray(int[] nums) {
    return Stream.<long[][]>of(new long[4][nums.length + 1]).peek(H -> H[2][0] = H[3][0] = 1).peek(H -> IntStream.range(0, nums.length).forEach(i -> H[0][i + 1] = (H[0][i] * 31 + nums[i]) % 1_000_000_007L)).peek(H -> IntStream.range(0, nums.length).forEach(i -> H[1][i + 1] = (H[1][i] * 37 + nums[i]) % 1_000_000_009L)).peek(H -> IntStream.range(0, nums.length).forEach(i -> H[2][i + 1] = H[2][i] * 31 % 1_000_000_007L)).peek(H -> IntStream.range(0, nums.length).forEach(i -> H[3][i + 1] = H[3][i] * 37 % 1_000_000_009L)).mapToInt(H -> Stream.iterate(new int[]{1, nums.length, nums.length}, s -> IntStream.of(s[0] + (s[1] - s[0]) / 2).mapToObj(mid -> IntStream.rangeClosed(0, nums.length - mid).mapToObj(i -> ((H[0][i + mid] - H[0][i] * H[2][mid] % 1_000_000_007L + 1_000_000_007L) % 1_000_000_007L) * 1_000_000_009L + (H[1][i + mid] - H[1][i] * H[3][mid] % 1_000_000_009L + 1_000_000_009L) % 1_000_000_009L).collect(Collectors.groupingBy(key -> key, Collectors.counting())).values().stream().noneMatch(c -> c == 1) ? new int[]{mid + 1, s[1], s[2]} : new int[]{s[0], mid - 1, mid}).findFirst().get()).dropWhile(s -> s[0] <= s[1]).findFirst().get()[2]).sum();
}
}
