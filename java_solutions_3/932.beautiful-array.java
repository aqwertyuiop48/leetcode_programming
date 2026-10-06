/*
 * @lc app=leetcode id=932 lang=java
 *
 * [932] Beautiful Array
 */

class Solution {
    public int[] beautifulArray(int n) {
        return n == 1 ? new int[]{1} : java.util.stream.IntStream.concat(java.util.Arrays.stream(beautifulArray((n + 1) / 2)).map(x -> 2 * x - 1), java.util.Arrays.stream(beautifulArray(n / 2)).map(x -> 2 * x)).toArray();
    }
}
