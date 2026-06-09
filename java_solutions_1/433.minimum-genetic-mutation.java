/*
 * @lc app=leetcode id=433 lang=java
 *
 * [433] Minimum Genetic Mutation
 */

class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.HashSet<>(java.util.Arrays.asList(bank)), new java.util.HashSet<String>(), new java.util.LinkedList<String>()}).peek(a -> ((java.util.Queue<String>) a[2]).offer(startGene)).peek(a -> ((java.util.Set<String>) a[1]).add(startGene)).map(a -> java.util.stream.Stream.iterate(0, steps -> !((java.util.Queue<String>) a[2]).isEmpty(), steps -> steps + 1).filter(steps -> java.util.stream.IntStream.range(0, ((java.util.Queue<String>) a[2]).size()).mapToObj(_i -> ((java.util.Queue<String>) a[2]).poll()).anyMatch(curr -> curr.equals(endGene) || java.util.stream.Stream.of(0).peek(_v -> java.util.stream.IntStream.range(0, 8).forEach(j -> java.util.Arrays.asList('A', 'C', 'G', 'T').forEach(cChar -> java.util.stream.Stream.of(curr.substring(0, j) + cChar + curr.substring(j + 1)).filter(mut -> ((java.util.Set<String>) a[0]).contains(mut) && ((java.util.Set<String>) a[1]).add(mut)).forEach(((java.util.Queue<String>) a[2])::offer)))).anyMatch(_v -> false))).findFirst().orElse(-1)).findFirst().get();
    }
}
