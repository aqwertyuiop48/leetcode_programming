/*
 * @lc app=leetcode id=1281 lang=java
 *
 * [1281] Subtract the Product and Sum of Digits of an Integer
 */

class Solution {
    public int subtractProductAndSum(int n) {
        return Optional.of(String.valueOf(n).chars()
            .map(c -> c - '0')
            .boxed()
            .reduce(new int[]{1, 0}, 
                    (a, d) -> new int[]{a[0] * d, a[1] + d}, 
                    (a, b) -> new int[]{a[0] * b[0], a[1] + b[1]}))
            .map(res -> res[0] - res[1])
            .get();
    }
}
