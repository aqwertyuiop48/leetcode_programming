/*
 * @lc app=leetcode id=1881 lang=java
 *
 * [1881] Maximum Value after Insertion
 */

class Solution {
    public String maxValue(String n, int x) {
        return java.util.stream.IntStream.of(java.util.stream.IntStream.range(n.charAt(0) == '-' ? 1 : 0, n.length()).filter(i -> n.charAt(0) == '-' ? n.charAt(i) - '0' > x : n.charAt(i) - '0' < x).findFirst().orElse(n.length()))
            .mapToObj(i -> n.substring(0, i) + x + n.substring(i)).findFirst().get();
    }
}
