/*
 * @lc app=leetcode id=3959 lang=java
 *
 * [3959] Check Good Integer
 */

class Solution {
public boolean checkGoodInteger(int n) {
    return String.valueOf(n).chars().map(c -> c - '0').map(d -> d * d - d).sum() >= 50;
}
}
