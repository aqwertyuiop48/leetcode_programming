/*
 * @lc app=leetcode id=950 lang=java
 *
 * [950] Reveal Cards In Increasing Order
 */

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        return java.util.Arrays.stream(deck).sorted().toArray() instanceof int[] a && new int[deck.length] instanceof int[] r
            && new java.util.ArrayDeque<Integer>(java.util.stream.IntStream.range(0, deck.length).boxed().toList()) instanceof java.util.ArrayDeque<Integer> q
            && java.util.Arrays.stream(a).allMatch(x -> (r[q.pollFirst()] = x) == x && (q.isEmpty() || q.offerLast(q.pollFirst())))
            ? r : null;
    }
}
