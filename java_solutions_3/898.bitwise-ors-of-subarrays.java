/*
 * @lc app=leetcode id=898 lang=java
 *
 * [898] Bitwise ORs of Subarrays
 */

class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        return new java.util.HashSet<Integer>() instanceof java.util.HashSet<Integer> all && new java.util.concurrent.atomic.AtomicReference<java.util.Set<Integer>>(java.util.Set.of()) instanceof java.util.concurrent.atomic.AtomicReference<java.util.Set<Integer>> cur
            && java.util.Arrays.stream(arr).allMatch(x -> all.addAll(cur.updateAndGet(c -> java.util.stream.Stream.concat(c.stream().map(y -> y | x), java.util.stream.Stream.of(x)).collect(java.util.stream.Collectors.toSet()))) || true)
            ? all.size() : 0;
    }
}
