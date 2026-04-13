/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()).limit(k).mapToInt(Map.Entry::getKey).toArray();
    }
}
