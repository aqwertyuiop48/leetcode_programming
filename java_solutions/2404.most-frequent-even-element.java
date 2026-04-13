/*
 * @lc app=leetcode id=2404 lang=java
 *
 * [2404] Most Frequent Even Element
 */

class Solution {
    public int mostFrequentEven(int[] nums) {
        return Arrays.stream(nums)
            .filter(n -> n % 2 == 0)
            .boxed()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
            .entrySet().stream()
            .max(Comparator.<Map.Entry<Integer, Long>, Long>comparing(Map.Entry::getValue)
                .thenComparing(Map.Entry::getKey, Comparator.reverseOrder()))
            .map(Map.Entry::getKey)
            .orElse(-1);
    }
}
