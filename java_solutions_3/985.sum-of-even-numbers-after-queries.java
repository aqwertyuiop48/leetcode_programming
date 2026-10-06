/*
 * @lc app=leetcode id=985 lang=java
 *
 * [985] Sum of Even Numbers After Queries
 */

class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        return nums.clone() instanceof int[] a && new int[]{java.util.Arrays.stream(nums).filter(x -> x % 2 == 0).sum()} instanceof int[] s
            ? java.util.Arrays.stream(queries).mapToInt(q -> (s[0] -= a[q[1]] % 2 == 0 ? a[q[1]] : 0) * 0 + ((a[q[1]] += q[0]) % 2 == 0 ? (s[0] += a[q[1]]) : s[0])).toArray() : null;
    }
}
