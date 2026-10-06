/*
 * @lc app=leetcode id=636 lang=java
 *
 * [636] Exclusive Time of Functions
 */

class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        return new int[n] instanceof int[] res && new java.util.ArrayDeque<Integer>() instanceof java.util.ArrayDeque<Integer> st && new int[1] instanceof int[] prev
            && logs.stream().map(l -> l.split(":")).peek(p -> {
                if (p[1].equals("start")
                    ? (st.isEmpty() || (res[st.peekFirst()] += Integer.parseInt(p[2]) - prev[0]) >= 0) && st.offerFirst(Integer.parseInt(p[0])) && (prev[0] = Integer.parseInt(p[2])) >= 0
                    : (res[st.pollFirst()] += Integer.parseInt(p[2]) - prev[0] + 1) >= 0 && (prev[0] = Integer.parseInt(p[2]) + 1) >= 0) {}
            }).allMatch(x -> true)
            ? res : null;
    }
}
