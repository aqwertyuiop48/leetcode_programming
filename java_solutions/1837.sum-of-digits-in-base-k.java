/*
 * @lc app=leetcode id=1837 lang=java
 *
 * [1837] Sum of Digits in Base K
 */

class Solution {
    public int sumBase(int n, int k) {
        return Arrays.stream(Integer.toString(n,k).split("")).map(i -> Integer.valueOf(i)).reduce(0,Integer::sum);
    }
}
