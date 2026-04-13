/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        return Arrays.stream(nums1).boxed().collect(Collectors.toSet()).stream().filter(i -> Arrays.stream(nums2).boxed().collect(Collectors.toSet()).contains(i)).mapToInt(Integer::intValue).toArray();
    }
}
