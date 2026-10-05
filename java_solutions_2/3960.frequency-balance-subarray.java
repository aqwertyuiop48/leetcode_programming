/*
 * @lc app=leetcode id=3960 lang=java
 *
 * [3960] Frequency Balance Subarray
 */

class Solution {
public int getLength(int[] nums) {
    return Stream.of(Arrays.stream(nums).distinct().sorted().toArray()).map(u -> Arrays.stream(nums).map(v -> Arrays.binarySearch(u, v)).toArray()).mapToInt(id -> IntStream.range(0, nums.length).map(i -> Stream.<int[][]>of(new int[][]{new int[nums.length + 2], new int[nums.length]}).mapToInt(h -> IntStream.range(i, nums.length).collect(() -> new int[]{0, 0, 0, 1}, (st, j) -> IntStream.of(h[1][id[j]]++).peek(old -> st[2] += old == 0 ? 1 : 0).peek(old -> st[0] -= old > 0 && --h[0][old] == 0 ? 1 : 0).peek(old -> st[0] += h[0][old + 1]++ == 0 ? 1 : 0).peek(old -> st[1] = Math.max(st[1], old + 1)).forEach(old -> st[3] = Math.max(st[3], (st[0] == 1 && st[2] == 1) || (st[0] == 2 && st[1] % 2 == 0 && h[0][st[1] / 2] > 0) ? j - i + 1 : 0)), (a, b) -> {})[3]).sum()).max().getAsInt()).sum();
}
}
