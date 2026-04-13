/*
 * @lc app=leetcode id=2215 lang=java
 *
 * [2215] Find the Difference of Two Arrays
 */

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Optional.of(List.of(
            Arrays.stream(nums1).boxed().collect(Collectors.toSet()),
            Arrays.stream(nums2).boxed().collect(Collectors.toSet())
        )).map(sets -> List.of(
            sets.get(0).stream().filter(n -> !sets.get(1).contains(n)).collect(Collectors.toList()),
            sets.get(1).stream().filter(n -> !sets.get(0).contains(n)).collect(Collectors.toList())
        )).get();
    }
}
