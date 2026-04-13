/*
 * @lc app=leetcode id=372 lang=java
 *
 * [372] Super Pow
 */

import java.math.*;
class Solution {
    public int superPow(int a, int[] b) {
        return (BigInteger.valueOf(a).modPow(new BigInteger(String.join("",Arrays.stream(b).boxed().map(i->String.valueOf(i)).collect(Collectors.toList()))),BigInteger.valueOf(1337))).intValue();
    }
}
