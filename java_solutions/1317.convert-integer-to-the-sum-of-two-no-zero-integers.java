/*
 * @lc app=leetcode id=1317 lang=java
 *
 * [1317] Convert Integer to the Sum of Two No-Zero Integers
 */

class Solution {
    public int[] getNoZeroIntegers(int n) {
        return IntStream.range(1, n)
            .filter(i -> !String.valueOf(i).contains("0") && !String.valueOf(n - i).contains("0"))
            .mapToObj(i -> new int[]{i, n - i})
            .findFirst()
            .orElse(new int[]{0, 0});
    }
}
