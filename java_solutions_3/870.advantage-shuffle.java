/*
 * @lc app=leetcode id=870 lang=java
 *
 * [870] Advantage Shuffle
 */

class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        return java.util.Arrays.stream(nums1).sorted().toArray() instanceof int[] a && new int[]{0, a.length - 1} instanceof int[] p && new int[a.length] instanceof int[] r
            && java.util.stream.IntStream.range(0, a.length).boxed().sorted(java.util.Comparator.comparingInt((Integer i) -> nums2[i]).reversed())
                .peek(i -> r[i] = a[p[1]] > nums2[i] ? a[p[1]--] : a[p[0]++]).allMatch(x -> true)
            ? r : null;
    }
}
