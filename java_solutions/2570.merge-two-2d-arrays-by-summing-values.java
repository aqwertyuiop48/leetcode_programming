/*
 * @lc app=leetcode id=2570 lang=java
 *
 * [2570] Merge Two 2D Arrays by Summing Values
 */

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        return Stream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
            .collect(Collectors.toMap(pair -> pair[0], pair -> pair[1], Integer::sum, TreeMap::new))
            .entrySet().stream()
            .map(e -> new int[]{e.getKey(), e.getValue()})
            .toArray(int[][]::new);
    }
}
