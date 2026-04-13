/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

class Solution { public int[] intersect(int[] nums1, int[] nums2) { return Arrays.stream(nums1).boxed().collect(Collectors.toSet()).stream() .flatMap(i -> Collections.nCopies( (int) Math.min(Arrays.stream(nums1).filter(j -> j == i).count(), Arrays.stream(nums2).filter(j -> j == i).count()), i ).stream()) .mapToInt(Integer::intValue) .toArray(); } }
