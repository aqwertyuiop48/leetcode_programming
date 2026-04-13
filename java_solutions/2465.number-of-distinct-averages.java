/*
 * @lc app=leetcode id=2465 lang=java
 *
 * [2465] Number of Distinct Averages
 */

class Solution {
    public int distinctAverages(int[] nums) {
        return Optional.of(Arrays.stream(nums).sorted().toArray())
            .map(s -> IntStream.range(0, s.length / 2)
                .mapToDouble(i -> (s[i] + s[s.length - 1 - i]) / 2.0)
                .distinct()
                .count())
            .get().intValue();
    }
}
