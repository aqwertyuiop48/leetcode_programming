/*
 * @lc app=leetcode id=3006 lang=java
 *
 * [3006] Find Beautiful Indices in the Given Array I
 */

class Solution { public List<Integer> beautifulIndices(String s, String a, String b, int k) { return IntStream.rangeClosed(0, s.length() - a.length()) .filter(i -> s.startsWith(a, i)) .boxed() .collect(Collectors.collectingAndThen( Collectors.toList(), aid -> IntStream.rangeClosed(0, s.length() - b.length()) .filter(j -> s.startsWith(b, j)) .boxed() .collect(Collectors.collectingAndThen( Collectors.toCollection(TreeSet::new), bid -> aid.stream() .filter(i -> !bid.subSet(i - k, true, i + k, true).isEmpty()) .collect(Collectors.toList()) )) )); } }
