/*
 * @lc app=leetcode id=1718 lang=java
 *
 * [1718] Construct the Lexicographically Largest Valid Sequence
 */

class Solution {
    public int[] constructDistancedSequence(int n) {
        return java.util.Optional.of(new Object[]{new int[2 * n - 1], new boolean[n + 1], new java.util.function.Function[1]})
            .filter(s -> (((java.util.function.Function[]) s[2])[0] = (java.util.function.Function<Integer, Boolean>) (idx) -> 
                idx == ((int[]) s[0]).length ? true : 
                ((int[]) s[0])[idx] != 0 ? ((java.util.function.Function<Integer, Boolean>) ((java.util.function.Function[]) s[2])[0]).apply(idx + 1) :
                java.util.stream.IntStream.range(0, n).map(i -> n - i).anyMatch(v -> 
                    !((boolean[]) s[1])[v] && (v == 1 || (idx + v < ((int[]) s[0]).length && ((int[]) s[0])[idx + v] == 0)) &&
                    (((int[]) s[0])[idx] = v) > 0 && (v == 1 || (((int[]) s[0])[idx + v] = v) > 0) && (((boolean[]) s[1])[v] = true) &&
                    (((java.util.function.Function<Integer, Boolean>) ((java.util.function.Function[]) s[2])[0]).apply(idx + 1) ||
                    ((((boolean[]) s[1])[v] = false) || true) && (((int[]) s[0])[idx] = 0) == 0 && (v == 1 || (((int[]) s[0])[idx + v] = 0) == 0) && false)
                )) != null)
            .map(s -> (boolean) ((java.util.function.Function<Integer, Boolean>) ((java.util.function.Function[]) s[2])[0]).apply(0) ? (int[]) s[0] : new int[0])
            .get();
    }
}
