/*
 * @lc app=leetcode id=4063 lang=java
 *
 * [4063] Longest Subarray Divisible by K with At Most One Negation I
 */

class Solution {
    public int longestSubarray(int[] A, int k) {
        return java.util.stream.IntStream.range(0, A.length).map(i -> java.util.stream.Stream.of((Object) new Object[]{ new int[]{0}, new int[k] }).mapToInt(st -> java.util.stream.IntStream.range(i, A.length).map(j -> new int[]{ ((int[])((Object[])st)[0])[0] = (((((int[])((Object[])st)[0])[0] + A[j]) % k) + k) % k, (((int[])((Object[])st)[1])[(((A[j] * 2) % k) + k) % k] = 1) * 0, (((int[])((Object[])st)[0])[0] == 0 || ((int[])((Object[])st)[1])[((int[])((Object[])st)[0])[0]] == 1) ? j - i + 1 : 0 }[2]).max().orElse(0)).findFirst().getAsInt()).max().orElse(0);
    }
}
