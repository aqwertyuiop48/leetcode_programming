/*
 * @lc app=leetcode id=2475 lang=java
 *
 * [2475] Number of Unequal Triplets in Array
 */

class Solution {
    public int unequalTriplets(int[] nums) {
        return Optional.of(Arrays.stream(nums).boxed()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
            .values().stream().mapToInt(Long::intValue).toArray())
            .map(counts -> IntStream.range(0, counts.length)
                .map(i -> IntStream.range(i + 1, counts.length)
                    .map(j -> IntStream.range(j + 1, counts.length)
                        .map(k -> counts[i] * counts[j] * counts[k])
                        .sum())
                    .sum())
                .sum())
            .get();
    }
}
