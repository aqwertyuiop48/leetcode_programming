/*
 * @lc app=leetcode id=1786 lang=java
 *
 * [1786] Number of Restricted Paths From First to Last Node
 */

class Solution {
    public int countRestrictedPaths(int n, int[][] edges) {
        return java.util.Optional.of(new Object[]{new java.util.HashMap<Integer, java.util.List<int[]>>(), new int[n + 1], new int[n + 1], new java.util.PriorityQueue<int[]>((a, b) -> a[1] - b[1])})
            .filter(s -> java.util.Arrays.stream(edges).allMatch(e -> ((java.util.Map<Integer, java.util.List<int[]>>)s[0]).computeIfAbsent(e[0], k -> new java.util.ArrayList<>()).add(new int[]{e[1], e[2]}) && ((java.util.Map<Integer, java.util.List<int[]>>)s[0]).computeIfAbsent(e[1], k -> new java.util.ArrayList<>()).add(new int[]{e[0], e[2]})))
            .filter(s -> java.util.stream.IntStream.rangeClosed(0, n).allMatch(i -> (((int[])s[1])[i] = Integer.MAX_VALUE) == Integer.MAX_VALUE) && (((int[])s[1])[n] = 0) == 0 && (((int[])s[2])[n] = 1) == 1 && ((java.util.PriorityQueue<int[]>)s[3]).add(new int[]{n, 0}))
            .map(s -> java.util.stream.IntStream.generate(() -> 0).takeWhile(dummy -> !((java.util.PriorityQueue<int[]>)s[3]).isEmpty() && java.util.Optional.of(((java.util.PriorityQueue<int[]>)s[3]).poll()).filter(top -> top[1] <= ((int[])s[1])[top[0]] && (top[0] == 1 ? (((java.util.PriorityQueue<int[]>)s[3]).removeIf(x -> true) || true) : ((java.util.Map<Integer, java.util.List<int[]>>)s[0]).getOrDefault(top[0], java.util.Collections.emptyList()).stream().allMatch(nbr -> (top[1] + nbr[1] < ((int[])s[1])[nbr[0]] ? (((int[])s[1])[nbr[0]] = top[1] + nbr[1]) >= 0 && ((java.util.PriorityQueue<int[]>)s[3]).add(new int[]{nbr[0], ((int[])s[1])[nbr[0]]}) : true) && (((int[])s[1])[nbr[0]] > ((int[])s[1])[top[0]] ? (((int[])s[2])[nbr[0]] = (((int[])s[2])[nbr[0]] + ((int[])s[2])[top[0]]) % 1000000007) >= 0 : true)))).isPresent() || true).count() >= 0 ? ((int[])s[2])[1] : 0)
            .get();
    }
}
