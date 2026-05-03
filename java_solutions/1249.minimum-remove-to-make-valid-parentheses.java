/*
 * @lc app=leetcode id=1249 lang=java
 *
 * [1249] Minimum Remove to Make Valid Parentheses
 */

class Solution {
    public String minRemoveToMakeValid(String s) {
        return java.util.Optional.of(new Object[]{new java.util.ArrayDeque<Integer>(), new java.util.HashSet<Integer>()})
            .filter(o -> java.util.stream.IntStream.range(0, s.length()).allMatch(i -> 
                s.charAt(i) == '(' ? ((java.util.Deque<Integer>) o[0]).offerFirst(i) :
                s.charAt(i) == ')' ? (!((java.util.Deque<Integer>) o[0]).isEmpty() ? ((java.util.Deque<Integer>) o[0]).pollFirst() != null : ((java.util.HashSet<Integer>) o[1]).add(i)) :
                true
            ))
            .map(o -> ((java.util.HashSet<Integer>) o[1]).addAll((java.util.Deque<Integer>) o[0]) || true ? o : o)
            .map(o -> java.util.stream.IntStream.range(0, s.length())
                .filter(i -> !((java.util.HashSet<Integer>) o[1]).contains(i))
                .mapToObj(i -> String.valueOf(s.charAt(i)))
                .collect(java.util.stream.Collectors.joining()))
            .orElse("");
    }
}
