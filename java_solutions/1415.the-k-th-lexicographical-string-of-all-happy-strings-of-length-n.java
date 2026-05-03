/*
 * @lc app=leetcode id=1415 lang=java
 *
 * [1415] The k-th Lexicographical String of All Happy Strings of Length n
 */

class Solution {
    public String getHappyString(int n, int k) {
        return new java.util.ArrayList<String>() instanceof java.util.List l && new java.util.function.Function[1] instanceof java.util.function.Function[] f && (f[0] = p -> ((String)p).length() == n ? l.add((String)p) | true : java.util.stream.Stream.of('a', 'b', 'c').filter(c -> ((String)p).isEmpty() || ((String)p).charAt(((String)p).length() - 1) != c).allMatch(c -> (boolean)f[0].apply((String)p + c))) != null && (boolean)f[0].apply("") | true ? (k <= l.size() ? (String)l.get(k - 1) : "") : "";
    }
}
