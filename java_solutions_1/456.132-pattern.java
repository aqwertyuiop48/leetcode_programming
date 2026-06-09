/*
 * @lc app=leetcode id=456 lang=java
 *
 * [456] 132 Pattern
 */

class Solution {
    public boolean find132pattern(int[] nums) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.Stack<Integer>(), new int[]{Integer.MIN_VALUE}}).map(a -> java.util.stream.IntStream.iterate(nums.length - 1, i -> i >= 0, i -> i - 1).anyMatch(i -> nums[i] < ((int[]) a[1])[0] || java.util.stream.Stream.of(0).peek(_v -> java.util.stream.Stream.iterate(0, _x -> !((java.util.Stack<Integer>) a[0]).isEmpty() && nums[i] > ((java.util.Stack<Integer>) a[0]).peek(), _x -> _x).forEach(_x -> ((int[]) a[1])[0] = ((java.util.Stack<Integer>) a[0]).pop())).peek(_v -> ((java.util.Stack<Integer>) a[0]).push(nums[i])).anyMatch(_v -> false))).findFirst().get();
    }
}
