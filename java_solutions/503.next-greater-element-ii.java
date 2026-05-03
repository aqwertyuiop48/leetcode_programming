/*
 * @lc app=leetcode id=503 lang=java
 *
 * [503] Next Greater Element II
 */

record Solution() {
    public int[] nextGreaterElements(int[] nums) {
        return (int[]) java.util.stream.IntStream.range(0, nums.length * 2).boxed().reduce(new Object[]{java.util.stream.IntStream.generate(() -> -1).limit(nums.length).toArray(), new java.util.Stack<Integer>()}, (s, i) -> java.util.stream.Stream.of(s).peek(arr -> java.util.stream.Stream.iterate(0, d -> !((java.util.Stack<Integer>)arr[1]).isEmpty() && nums[((java.util.Stack<Integer>)arr[1]).peek()] < nums[i % nums.length], d -> (((int[])arr[0])[((java.util.Stack<Integer>)arr[1]).pop()] = nums[i % nums.length]) * 0).count()).peek(arr -> ((java.util.Stack<Integer>)arr[1]).push(i % nums.length)).findFirst().get(), (a, b) -> a)[0];
    }
}
