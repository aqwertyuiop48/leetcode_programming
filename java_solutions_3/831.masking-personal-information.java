/*
 * @lc app=leetcode id=831 lang=java
 *
 * [831] Masking Personal Information
 */

class Solution {
    public String maskPII(String s) {
        return s.contains("@") ? s.toLowerCase().replaceAll("(.)[^@]*(.)@", "$1*****$2@")
            : s.replaceAll("[^0-9]", "") instanceof String d ? (d.length() > 10 ? "+" + "*".repeat(d.length() - 10) + "-" : "") + "***-***-" + d.substring(d.length() - 4) : "";
    }
}
