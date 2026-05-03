/*
 * @lc app=leetcode id=1492 lang=java
 *
 * [1492] The kth Factor of n
 */

class Solution {
    public int kthFactor(int n, int k) {
        return java.util.stream.IntStream.rangeClosed(1, n).filter(i -> n % i == 0).skip(k - 1).findFirst().orElse(-1);
    }
}
