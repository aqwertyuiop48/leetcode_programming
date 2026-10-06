/*
 * @lc app=leetcode id=907 lang=java
 *
 * [907] Sum of Subarray Minimums
 */

class Solution {
    public int sumSubarrayMins(int[] arr) {
        return new int[arr.length] instanceof int[] L && new int[arr.length] instanceof int[] R
            && new java.util.ArrayDeque<Integer>() instanceof java.util.ArrayDeque<Integer> s1 && new java.util.ArrayDeque<Integer>() instanceof java.util.ArrayDeque<Integer> s2
            && java.util.stream.IntStream.range(0, arr.length).peek(i -> {
                while (!s1.isEmpty() && arr[s1.peekFirst()] >= arr[i] && s1.pollFirst() != null) {}
                if ((L[i] = i - (s1.isEmpty() ? -1 : s1.peekFirst())) > 0 && s1.offerFirst(i)) {}
            }).allMatch(x -> true)
            && java.util.stream.IntStream.iterate(arr.length - 1, i -> i >= 0, i -> i - 1).peek(i -> {
                while (!s2.isEmpty() && arr[s2.peekFirst()] > arr[i] && s2.pollFirst() != null) {}
                if ((R[i] = (s2.isEmpty() ? arr.length : s2.peekFirst()) - i) > 0 && s2.offerFirst(i)) {}
            }).allMatch(x -> true)
            ? (int) (java.util.stream.IntStream.range(0, arr.length).mapToLong(i -> (long) arr[i] * L[i] % 1000000007L * R[i] % 1000000007L).sum() % 1000000007L) : 0;
    }
}
