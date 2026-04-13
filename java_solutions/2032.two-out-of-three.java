/*
 * @lc app=leetcode id=2032 lang=java
 *
 * [2032] Two Out of Three
 */

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        return IntStream.concat(IntStream.concat(Arrays.stream(nums1).distinct(), Arrays.stream(nums2).distinct()), Arrays.stream(nums3).distinct())
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream()
            .filter(e -> e.getValue() >= 2)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }
}
