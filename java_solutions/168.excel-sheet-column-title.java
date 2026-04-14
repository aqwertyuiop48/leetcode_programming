/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

class Solution {
    public String convertToTitle(int col) {
        return Stream.iterate(col, c -> c > 0, c -> (c - 1) / 26) .map(c -> String.valueOf((char) ('A' + (c - 1) % 26))) .collect(Collectors.collectingAndThen( Collectors.joining(), sb -> new StringBuilder(sb).reverse().toString()));
    }
}