/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        return java.util.Optional.of(new java.util.ArrayDeque<Integer>())
            .map(dq -> java.util.stream.IntStream.range(0, nums.length)
                .filter(i -> java.util.stream.Stream.generate(dq::peekLast)
                    .takeWhile(last -> !dq.isEmpty() && nums[last] < nums[i])
                    .peek(last -> dq.pollLast())
                    .count() >= 0
                    && dq.offerLast(i) 
                    && (dq.peekFirst() > i - k || dq.pollFirst() != -1) 
                    && i >= k - 1)
                .map(i -> nums[dq.peekFirst()])
                .toArray())
            .get();
    }
}
