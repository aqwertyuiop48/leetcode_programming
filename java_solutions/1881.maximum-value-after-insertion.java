/*
 * @lc app=leetcode id=1881 lang=java
 *
 * [1881] Maximum Value after Insertion
 */

class Solution {
    public String maxValue(String n, int x) {
        return n.charAt(0) == '-' ? "-" + java.util.stream.IntStream.range(1, n.length()).filter(i -> n.charAt(i) - '0' > x).findFirst().map(i -> n.substring(1, i) + x + n.substring(i)).orElse(n.substring(1) + x) : java.util.stream.IntStream.range(0, n.length()).filter(i -> n.charAt(i) - '0' < x).findFirst().map(i -> n.substring(0, i) + x + n.substring(i)).orElse(n + x);
    }
}
