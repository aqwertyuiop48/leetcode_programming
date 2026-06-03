/*
 * @lc app=leetcode id=373 lang=java
 *
 * [373] Find K Pairs with Smallest Sums
 */

// @lc code=start
class Solution {
    public java.util.List<java.util.List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        return java.util.stream.Stream.of(new java.util.PriorityQueue<int[]>((a, b) -> nums1[a[0]] + nums2[a[1]] - nums1[b[0]] - nums2[b[1]])).peek(pq -> java.util.stream.IntStream.range(0, Math.min(nums1.length, k)).forEach(i -> pq.offer(new int[]{i, 0}))).map(pq -> java.util.stream.Stream.generate(() -> java.util.stream.Stream.of(pq.poll()).peek(p -> java.util.stream.Stream.of(0).filter(_v -> p[1] + 1 < nums2.length).forEach(_v -> pq.offer(new int[]{p[0], p[1] + 1}))).map(p -> java.util.Arrays.asList(nums1[p[0]], nums2[p[1]])).findFirst().get()).limit(Math.min((long)k, (long)nums1.length * nums2.length)).collect(java.util.stream.Collectors.toList())).findFirst().get();
    }
}
// @lc code=end
