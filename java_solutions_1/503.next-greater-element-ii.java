/*
 * @lc app=leetcode id=503 lang=java
 *
 * [503] Next Greater Element II
 */

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new int[nums.length], new java.util.Stack<Integer>()}).peek(a -> java.util.Arrays.fill((int[]) a[0], -1)).peek(a -> java.util.stream.IntStream.range(0, nums.length * 2).forEach(i -> java.util.stream.Stream.of(i % nums.length).peek(idx -> java.util.stream.Stream.iterate(0, _y -> !((java.util.Stack<Integer>) a[1]).isEmpty() && nums[((java.util.Stack<Integer>) a[1]).peek()] < nums[idx], _y -> _y).forEach(_y -> ((int[]) a[0])[((java.util.Stack<Integer>) a[1]).pop()] = nums[idx])).forEach(idx -> java.util.stream.Stream.of(0).filter(_x -> i < nums.length).forEach(_x -> ((java.util.Stack<Integer>) a[1]).push(idx))))).map(a -> (int[]) a[0]).findFirst().get();
    }
}
