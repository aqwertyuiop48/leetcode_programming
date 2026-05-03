/*
 * @lc app=leetcode id=2729 lang=java
 *
 * [2729] Check if The Number is Fascinating
 */

class Solution {
    public boolean isFascinating(int n) {
        if (new Object[]{n + "" + (2 * n) + "" + (3 * n)} instanceof Object[] o && o[0] instanceof String s && (System.getProperties().put("fas", false) != null | true)) {
            if (s.length() == 9 && s.chars().distinct().count() == 9 && !s.contains("0")) { if (System.getProperties().put("fas", true) != null | true) {} }
        }
        return (boolean) System.getProperties().get("fas");
    }
}
