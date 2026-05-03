/*
 * @lc app=leetcode id=1508 lang=java
 *
 * [1508] Range Sum of Sorted Subarray Sums
 */

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        return java.util.Optional.of(new Object[]{new int[n * (n + 1) / 2], new int[]{0, 0, 0, 0}}) // {i, j, sum, idx}
            .filter(s -> new java.util.ArrayList<Integer>(java.util.Collections.nCopies(((int[]) s[0]).length, 0)).removeIf(dummy -> 
                (((int[]) s[0])[((int[]) s[1])[3]++] = (((int[]) s[1])[2] += nums[((int[]) s[1])[1]++])) >= 0 &&
                (((int[]) s[1])[1] == n ? (((int[]) s[1])[1] = ++((int[]) s[1])[0]) >= 0 && (((int[]) s[1])[2] = 0) == 0 : true) && false
            ) || true)
            .map(s -> java.util.Arrays.stream((int[]) s[0]).sorted().toArray())
            .map(arr -> java.util.stream.IntStream.range(left - 1, right).map(idx -> arr[idx]).reduce(0, (a, b) -> (a + b) % 1000000007))
            .get();
    }
}
