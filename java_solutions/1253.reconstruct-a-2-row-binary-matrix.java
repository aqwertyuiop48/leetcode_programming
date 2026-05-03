/*
 * @lc app=leetcode id=1253 lang=java
 *
 * [1253] Reconstruct a 2-Row Binary Matrix
 */

class Solution {
    public java.util.List<java.util.List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        return java.util.Optional.of(new Object[]{new int[]{upper, lower}, new java.util.ArrayList<Integer>(), new java.util.ArrayList<Integer>()})
            .filter(s -> java.util.Arrays.stream(colsum).allMatch(c -> 
                c == 2 ? 
                    ((java.util.List<Integer>) s[1]).add(1) && ((java.util.List<Integer>) s[2]).add(1) && --((int[]) s[0])[0] >= 0 && --((int[]) s[0])[1] >= 0 : 
                c == 0 ? 
                    ((java.util.List<Integer>) s[1]).add(0) && ((java.util.List<Integer>) s[2]).add(0) : 
                ((int[]) s[0])[0] >= ((int[]) s[0])[1] ? 
                    ((java.util.List<Integer>) s[1]).add(1) && ((java.util.List<Integer>) s[2]).add(0) && --((int[]) s[0])[0] >= 0 : 
                    ((java.util.List<Integer>) s[1]).add(0) && ((java.util.List<Integer>) s[2]).add(1) && --((int[]) s[0])[1] >= 0
            ))
            .filter(s -> ((int[]) s[0])[0] == 0 && ((int[]) s[0])[1] == 0)
            .map(s -> java.util.Arrays.asList((java.util.List<Integer>) s[1], (java.util.List<Integer>) s[2]))
            .orElse(new java.util.ArrayList<>());
    }
}
