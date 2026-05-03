/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */

class Solution {
    public java.util.List<java.util.List<String>> partition(String s) {
        return java.util.stream.Stream.<java.util.function.Function<Object[], Boolean>[]>of(new java.util.function.Function[1]).map(f -> java.util.stream.Stream.of(f[0] = (java.util.function.Function<Object[], Boolean>) (a -> (int)a[1] == s.length() ? ((java.util.List<java.util.List<String>>)a[3]).add(new java.util.ArrayList<>((java.util.List<String>)a[2])) : java.util.stream.IntStream.range((int)a[1], s.length()).filter(i -> java.util.stream.IntStream.rangeClosed(0, (i - (int)a[1]) / 2).allMatch(j -> s.charAt((int)a[1] + j) == s.charAt(i - j))).peek(i -> java.util.stream.Stream.of(((java.util.List<String>)a[2]).add(s.substring((int)a[1], i + 1))).peek(dummy -> f[0].apply(new Object[]{s, i + 1, a[2], a[3]})).forEach(dummy -> ((java.util.List<String>)a[2]).remove(((java.util.List<String>)a[2]).size() - 1))).count() > -1)).findFirst().get()).map(func -> java.util.stream.Stream.of(new java.util.ArrayList<java.util.List<String>>()).peek(res -> func.apply(new Object[]{s, 0, new java.util.ArrayList<String>(), res})).findFirst().get()).findFirst().get();
    }
}
