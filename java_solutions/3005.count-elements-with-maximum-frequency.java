/*
 * @lc app=leetcode id=3005 lang=java
 *
 * [3005] Count Elements With Maximum Frequency
 */

class Solution {
    public int maxFrequencyElements(int[] nums) {
        return Arrays.stream(nums).boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .values().stream()
            .collect(Collectors.collectingAndThen(
                Collectors.toList(),
                counts -> counts.stream()
                    .filter(f -> f.equals(Collections.max(counts)))
                    .mapToInt(Long::intValue)
                    .sum()
            ));
    }
}
