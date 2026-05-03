/*
 * @lc app=leetcode id=1410 lang=java
 *
 * [1410] HTML Entity Parser
 */

class Solution {
    public String entityParser(String text) {
        return text.replace("&quot;", "\"").replace("&apos;", "'").replace("&gt;", ">").replace("&lt;", "<").replace("&frasl;", "/").replace("&amp;", "&");
    }
}
