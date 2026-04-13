/*
 * @lc app=leetcode id=1805 lang=java
 *
 * [1805] Number of Different Integers in a String
 */

import java.math.*;

class Solution {
    public int numDifferentIntegers(String word) {
        return (Arrays.stream((word.split("[A-za-z]"))).filter(i->i.length()>0).map(i->new BigInteger(i)).collect(Collectors.toSet())).size();
    }
}
