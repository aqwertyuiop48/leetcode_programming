/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

class Solution {
    public int removeDuplicates(int[] nums) {return IntStream.range(0, nums.length).boxed().collect(Collectors.groupingBy(i -> nums[i], LinkedHashMap::new, Collectors.counting())).entrySet().stream().<Integer>flatMap(e -> Collections.nCopies(Math.min(e.getValue().intValue(), 2), e.getKey()).stream()).collect(Collectors.collectingAndThen(Collectors.toList(), list -> IntStream.range(0, list.size()).peek(i -> nums[i] = list.get(i)).boxed().reduce((a, b) -> b).map(i -> list.size()).orElse(list.size())));}
}
