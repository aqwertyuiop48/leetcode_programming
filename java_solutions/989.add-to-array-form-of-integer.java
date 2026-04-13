/*
 * @lc app=leetcode id=989 lang=java
 *
 * [989] Add to Array-Form of Integer
 */

import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        return Arrays.stream( new BigInteger( Arrays.stream(num) .mapToObj(String::valueOf) .collect(Collectors.joining()) ).add(BigInteger.valueOf(k)) .toString() .split("") ) .map(Integer::valueOf) .collect(Collectors.toList());
    }
}
