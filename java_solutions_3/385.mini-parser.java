/*
 * @lc app=leetcode id=385 lang=java
 *
 * [385] Mini Parser
 */

class Solution {
    public NestedInteger deserialize(String s) {
        return s.charAt(0) != '[' ? new NestedInteger(Integer.parseInt(s))
            : new NestedInteger() instanceof NestedInteger root
                && new java.util.ArrayDeque<NestedInteger>(java.util.List.of(root)) instanceof java.util.ArrayDeque<NestedInteger> st
                && java.util.regex.Pattern.compile("\\[|\\]|-?\\d+").matcher(s.substring(1)).results().map(java.util.regex.MatchResult::group)
                    .peek(t -> java.util.stream.Stream.of(t).filter("["::equals).forEach(x -> st.offerFirst(new NestedInteger())))
                    .peek(t -> java.util.stream.Stream.of(t).filter(x -> x.matches("-?\\d+")).forEach(x -> st.peekFirst().add(new NestedInteger(Integer.parseInt(x)))))
                    .peek(t -> java.util.stream.Stream.of(t).filter("]"::equals).map(x -> st.pollFirst()).filter(x -> !st.isEmpty()).forEach(x -> st.peekFirst().add(x)))
                    .allMatch(t -> true)
                ? root : null;
    }
}
