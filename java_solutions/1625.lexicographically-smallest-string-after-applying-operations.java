/*
 * @lc app=leetcode id=1625 lang=java
 *
 * [1625] Lexicographically Smallest String After Applying Operations
 */

class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        return new java.util.TreeSet<String>() instanceof java.util.Set set && new java.util.function.Function[1] instanceof java.util.function.Function[] dfs && (dfs[0] = str -> set.add((String)str) ? (boolean)dfs[0].apply(((String)str).substring(((String)str).length() - b) + ((String)str).substring(0, ((String)str).length() - b)) | (boolean)dfs[0].apply(java.util.stream.IntStream.range(0, ((String)str).length()).mapToObj(i -> String.valueOf((char)(i % 2 == 1 ? ((((String)str).charAt(i) - '0' + a) % 10) + '0' : ((String)str).charAt(i)))).collect(java.util.stream.Collectors.joining())) : true) != null && (boolean)dfs[0].apply(s) | true ? (String)((java.util.TreeSet)set).first() : "";
    }
}
