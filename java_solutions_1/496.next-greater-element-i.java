/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.HashMap<Integer, Integer>(), new java.util.Stack<Integer>()}).peek(a -> java.util.Arrays.stream(nums2).forEach(num -> java.util.stream.Stream.of(0).peek(_x -> java.util.stream.Stream.iterate(0, _y -> !((java.util.Stack<Integer>) a[1]).isEmpty() && ((java.util.Stack<Integer>) a[1]).peek() < num, _y -> _y).forEach(_y -> ((java.util.Map<Integer, Integer>) a[0]).put(((java.util.Stack<Integer>) a[1]).pop(), num))).forEach(_x -> ((java.util.Stack<Integer>) a[1]).push(num)))).map(a -> java.util.Arrays.stream(nums1).map(num -> ((java.util.Map<Integer, Integer>) a[0]).getOrDefault(num, -1)).toArray()).findFirst().get();
    }
}
