/*
 * @lc app=leetcode id=2306 lang=java
 *
 * [2306] Naming a Company
 */

class Solution { public long distinctNames(String[] ideas) { return ((Function<List<Set<String>>, Long>) sets -> Arrays.stream(ideas).mapToLong(s -> sets.get(s.charAt(0) - 'a').add(s.substring(1)) ? 0L : 0L).sum() * 0L + IntStream.range(0, 26).mapToLong(i -> IntStream.range(i + 1, 26).mapToLong(j -> ((LongUnaryOperator) intersect -> (sets.get(i).size() - intersect) * (sets.get(j).size() - intersect) * 2L).applyAsLong(sets.get(i).stream().filter(sets.get(j)::contains).count())).sum()).sum()).apply(IntStream.range(0, 26).mapToObj(i -> (Set<String>) new HashSet<String>()).collect(Collectors.toList())); } }
