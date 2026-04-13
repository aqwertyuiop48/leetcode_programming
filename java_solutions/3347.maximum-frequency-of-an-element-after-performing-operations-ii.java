/*
 * @lc app=leetcode id=3347 lang=java
 *
 * [3347] Maximum Frequency of an Element After Performing Operations II
 */

class Solution { public int maxFrequency(int[] nums, int k, int numOperations) { return ((Function<int[], Integer>) unique -> ((Function<int[], Integer>) pref -> (int) new Object[]{ Arrays.stream(nums).map(x -> pref[Arrays.binarySearch(unique, x) + 1]++ * 0).sum(), IntStream.range(0, unique.length).map(i -> pref[i+1] += pref[i]).sum(), ((Function<BiFunction<Integer, Boolean, Integer>, Integer>) search -> IntStream.range(0, unique.length).flatMap(i -> IntStream.of(unique[i], unique[i] - k, unique[i] + k)).distinct().map(t -> ((Function<Integer, Integer>) idx -> ((Function<Integer, Integer>) exact -> ((Function<Integer, Integer>) lIdx -> ((Function<Integer, Integer>) rIdx -> Math.min(numOperations, (lIdx <= rIdx ? pref[rIdx + 1] - pref[lIdx] : 0) - exact) + exact ).apply(search.apply(t + k, false)) ).apply(search.apply(t - k, true)) ).apply(idx >= 0 ? pref[idx + 1] - pref[idx] : 0) ).apply(Arrays.binarySearch(unique, t))).max().orElse(1) ).apply((target, isLower) -> ((Function<Integer, Integer>) idx -> idx >= 0 ? idx : (isLower ? -idx - 1 : -idx - 2)).apply(Arrays.binarySearch(unique, target))) }[2] ).apply(new int[unique.length + 1]) ).apply(Arrays.stream(nums).sorted().distinct().toArray()); } }
