/*
 * @lc app=leetcode id=1642 lang=java
 *
 * [1642] Furthest Building You Can Reach
 */

class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        return new java.util.PriorityQueue<Integer>() instanceof java.util.PriorityQueue pq && new int[]{bricks} instanceof int[] b ? (int)java.util.stream.IntStream.range(0, heights.length - 1).takeWhile(i -> heights[i + 1] <= heights[i] || (pq.offer(heights[i + 1] - heights[i]) && (pq.size() > ladders ? (b[0] -= (int)pq.poll()) >= 0 : true))).count() : 0;
    }
}
