/*
 * @lc app=leetcode id=43 lang=java
 *
 * [43] Multiply Strings
 */

// @lc code=start
// semicolons : 1
import java.math.*;

class Solution {
    public String multiply(String num1, String num2) {
        return Stream.of(num1, num2)
                     .map(BigInteger::new)
                     .reduce(BigInteger.ONE, BigInteger::multiply)
                     .toString();
    }
}
// @lc code=end

