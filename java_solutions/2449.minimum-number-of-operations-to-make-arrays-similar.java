/*
 * @lc app=leetcode id=2449 lang=java
 *
 * [2449] Minimum Number of Operations to Make Arrays Similar
 */

class Solution { public long makeSimilar(int[] nums, int[] target) { return ((Function<int[], Function<int[], Function<int[], Function<int[], Long>>>>) nE -> nO -> tE -> tO -> (IntStream.range(0, nE.length).mapToLong(i -> Math.abs((long)nE[i] - tE[i])).sum() + IntStream.range(0, nO.length).mapToLong(i -> Math.abs((long)nO[i] - tO[i])).sum()) / 4L).apply(Arrays.stream(nums).filter(x -> x % 2 == 0).sorted().toArray()).apply(Arrays.stream(nums).filter(x -> x % 2 != 0).sorted().toArray()).apply(Arrays.stream(target).filter(x -> x % 2 == 0).sorted().toArray()).apply(Arrays.stream(target).filter(x -> x % 2 != 0).sorted().toArray()); } }
