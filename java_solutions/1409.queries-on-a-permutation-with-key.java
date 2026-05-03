/*
 * @lc app=leetcode id=1409 lang=java
 *
 * [1409] Queries on a Permutation With Key
 */

class Solution {
    public int[] processQueries(int[] queries, int m) {
        return java.util.stream.IntStream.of(queries).map(q -> (System.getProperties().putIfAbsent(this, java.util.stream.IntStream.rangeClosed(1, m).boxed().collect(java.util.stream.Collectors.toCollection(java.util.LinkedList::new))) == null ? 0 : 0) | ((java.util.LinkedList<Integer>)System.getProperties().get(this)).indexOf(q)).peek(idx -> ((java.util.LinkedList<Integer>)System.getProperties().get(this)).addFirst(((java.util.LinkedList<Integer>)System.getProperties().get(this)).remove((int)idx))).toArray();
    }
}
