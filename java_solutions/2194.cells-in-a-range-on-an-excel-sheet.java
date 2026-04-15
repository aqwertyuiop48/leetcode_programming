/*
 * @lc app=leetcode id=2194 lang=java
 *
 * [2194] Cells in a Range on an Excel Sheet
 */

class Solution{public List<String> cellsInRange(String s){return java.util.stream.IntStream.rangeClosed(s.charAt(0),s.charAt(3)).boxed().flatMap(c->java.util.stream.IntStream.rangeClosed(s.charAt(1),s.charAt(4)).mapToObj(r->""+(char)c.intValue()+(char)r)).toList();}}
