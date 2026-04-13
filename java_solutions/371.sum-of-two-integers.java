/*
 * @lc app=leetcode id=371 lang=java
 *
 * [371] Sum of Two Integers
 */

import java.math.*;
class Solution {
    public int getSum(int a, int b) {
        return BigInteger.valueOf(a).add(BigInteger.valueOf(b)).intValue();
    }
}
