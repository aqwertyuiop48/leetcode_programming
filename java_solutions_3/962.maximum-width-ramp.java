/*
 * @lc app=leetcode id=962 lang=java
 *
 * [962] Maximum Width Ramp
 */

class Solution {
    public int maxWidthRamp(int[] nums) {
        return new java.util.ArrayDeque<Integer>() instanceof java.util.ArrayDeque<Integer> st && new int[]{0} instanceof int[] b
            && java.util.stream.IntStream.range(0, nums.length).filter(i -> st.isEmpty() || nums[st.peekFirst()] > nums[i]).peek(i -> st.offerFirst(i)).allMatch(x -> true)
            && java.util.stream.IntStream.iterate(nums.length - 1, j -> j >= 0, j -> j - 1).peek(j -> {
                while (!st.isEmpty() && nums[st.peekFirst()] <= nums[j] && (b[0] = Math.max(b[0], j - st.pollFirst())) >= 0) {}
            }).allMatch(x -> true)
            ? b[0] : 0;
    }
}
