/*
 * @lc app=leetcode id=697 lang=java
 *
 * [697] Degree of an Array
 */

class Solution {
    public int findShortestSubArray(int[] nums) {
       return Optional.of(IntStream.range(0, nums.length).boxed() .collect(Collectors.groupingBy(i -> nums[i]))) .map(map -> map.values().stream() .collect(Collectors.groupingBy(List::size))) .map(groupedByFreq -> groupedByFreq.get(Collections.max(groupedByFreq.keySet())).stream() .mapToInt(list -> list.get(list.size() - 1) - list.get(0) + 1) .min().getAsInt()) .get();
    }
}
