/*
 * @lc app=leetcode id=3781 lang=java
 *
 * [3781] Maximum Score After Binary Swaps
 */

class Solution {
    public long maximumScore(int[] nums, String s) {
        return new Object[]{new java.util.PriorityQueue<Integer>(java.util.Collections.reverseOrder()), new long[1]} instanceof Object[] pq 
            ? java.util.stream.IntStream.range(0, nums.length)
                .map(i -> ((java.util.PriorityQueue<Integer>)pq[0]).offer(nums[i]) 
                          && s.charAt(i) == '1' 
                          && (((long[])pq[1])[0] += (long) (Integer) ((java.util.PriorityQueue<Integer>)pq[0]).poll()) > -1L
                          ? 0 : 0)
                .toArray().length > -1 
                ? ((long[])pq[1])[0] 
                : 0L
            : 0L;
    }
}

