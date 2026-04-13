/*
 * @lc app=leetcode id=2122 lang=java
 *
 * [2122] Recover the Original Array
 */

class Solution { public int[] recoverArray(int[] nums) { return ((Function<int[], Function<int[], int[]>>) sorted -> res -> ((Function<Function<int[], int[]>, int[]>) check -> IntStream.range(1, sorted.length).filter(i -> sorted[i] > sorted[0] && (sorted[i] - sorted[0]) % 2 == 0).mapToObj(i -> check.apply(new int[]{(sorted[i] - sorted[0]) / 2})).filter(r -> r != null).findFirst().orElse(null)).apply(k -> ((Function<boolean[], Integer>) used -> ((ToIntFunction<int[]>) ptrs -> IntStream.range(0, sorted.length).reduce(0, (acc, left) -> used[left] || ptrs[2] == 1 ? 0 : (int)((ptrs[0] = Math.max(ptrs[0], left + 1)) * 0L + IntStream.iterate(0, d -> ptrs[0] < sorted.length && (used[ptrs[0]] || sorted[ptrs[0]] < sorted[left] + 2 * k[0]), d -> d + 1).reduce(0, (a, d) -> (ptrs[0]++) * 0) * 0L + (ptrs[0] < sorted.length && sorted[ptrs[0]] == sorted[left] + 2 * k[0] ? ((used[left] = true) ? ((used[ptrs[0]] = true) ? (res[ptrs[1]++] = sorted[left] + k[0]) * 0 + (ptrs[0]++) * 0 : 0) : 0) : (ptrs[2] = 1) * 0))) * 0 == 0 ? (ptrs[2] == 0 && ptrs[1] == sorted.length / 2 ? 1 : 0) : 0).applyAsInt(new int[]{0, 0, 0})).apply(new boolean[sorted.length]) == 1 ? res : null)).apply(IntStream.of(nums).sorted().toArray()).apply(new int[nums.length / 2]); } }
