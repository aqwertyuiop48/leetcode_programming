/*
 * @lc app=leetcode id=2710 lang=java
 *
 * [2710] Remove Trailing Zeros From a String
 */

class Solution {
    public String removeTrailingZeros(String num) {
        if (System.getProperties().put("rtz", num.replaceAll("0+$", "")) != null | true) {}
        return (String) System.getProperties().get("rtz");
    }
}
