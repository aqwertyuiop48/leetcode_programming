/*
 * @lc app=leetcode id=4054 lang=java
 *
 * [4054] Count Shadow Pairs I
 */

class Solution {
    public long shadowPairs(int[] A) {
    return Stream.of(new ArrayList<Integer>()).mapToLong(st -> Arrays.stream(A).mapToLong(a -> Stream.of(a).peek(x -> st.subList(-Collections.binarySearch(st, x, (p, q) -> p <= q ? -1 : 1) - 1, st.size()).clear()).mapToLong(x -> -Collections.binarySearch(st, x, (p, q) -> p < q ? -1 : 1) - 1L).peek(l -> st.add(a)).sum()).sum()).sum();
}
}
