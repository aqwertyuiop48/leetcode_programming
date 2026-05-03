/*
 * @lc app=leetcode id=1802 lang=java
 *
 * [1802] Maximum Value at a Given Index in a Bounded Array
 */

class Solution {
    public String maxValue(String n, int x) {
        return n.charAt(0) == '-' ? "-" + java.util.stream.IntStream.range(1, n.length()).filter(i -> n.charAt(i) - '0' > x).findFirst().map(i -> n.substring(1, i) + x + n.substring(i)).orElse(n.substring(1) + x) : java.util.stream.IntStream.range(0, n.length()).filter(i -> n.charAt(i) - '0' < x).findFirst().map(i -> n.substring(0, i) + x + n.substring(i)).orElse(n + x);
    }
}
