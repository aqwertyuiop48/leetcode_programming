/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

import java.math.*;
class Solution {
    public int[] plusOne(int[] digits) {
        return String.valueOf( new BigInteger( Arrays .stream(digits).boxed().filter(n->n==n).map(n->n.toString()).collect(Collectors.toList()) .stream().filter(n->n==n).map(n->n).collect(Collectors.joining()) ).add(BigInteger.ONE)) .chars() .map(c->c-'0') .toArray();
    }
}
