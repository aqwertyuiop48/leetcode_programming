/*
 * @lc app=leetcode id=649 lang=java
 *
 * [649] Dota2 Senate
 */

class Solution {
    public String predictPartyVictory(String senate) {
        return java.util.stream.IntStream.range(0, senate.length()).boxed().collect(java.util.stream.Collectors.partitioningBy(i -> senate.charAt(i) == 'R')) instanceof java.util.Map<Boolean, java.util.List<Integer>> g
            && new java.util.ArrayDeque<>(g.get(true)) instanceof java.util.ArrayDeque<Integer> r && new java.util.ArrayDeque<>(g.get(false)) instanceof java.util.ArrayDeque<Integer> d
            && java.util.stream.Stream.of(0).peek(z -> {
                while (!r.isEmpty() && !d.isEmpty() && (r.peekFirst() < d.peekFirst() ? r.offerLast(r.peekFirst() + senate.length()) : d.offerLast(d.peekFirst() + senate.length()))
                    && r.pollFirst() != null && d.pollFirst() != null) {}
            }).anyMatch(z -> true)
            ? (r.isEmpty() ? "Dire" : "Radiant") : "";
    }
}
