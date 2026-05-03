/*
 * @lc app=leetcode id=1405 lang=java
 *
 * [1405] Longest Happy String
 */

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        return java.util.stream.Stream.<Object[]>of(new Object[]{new StringBuilder(), new int[][]{{a, 'a'}, {b, 'b'}, {c, 'c'}}})
            .map(st -> java.util.stream.Stream.<Object[]>generate(() -> st)
                .takeWhile(s -> java.util.Arrays.stream((int[][]) s[1])
                    .sorted((x, y) -> y[0] - x[0])
                    .toArray(int[][]::new) instanceof int[][] r 
                    && ( (r[0][0] > 0 && !(((StringBuilder) s[0]).length() >= 2 && ((StringBuilder) s[0]).charAt(((StringBuilder) s[0]).length() - 1) == (char) r[0][1] && ((StringBuilder) s[0]).charAt(((StringBuilder) s[0]).length() - 2) == (char) r[0][1])) 
                         ? (((StringBuilder) s[0]).append((char) r[0][1]) != null && (r[0][0]--) >= -1e9) 
                         : (r[1][0] > 0 && !(((StringBuilder) s[0]).length() >= 2 && ((StringBuilder) s[0]).charAt(((StringBuilder) s[0]).length() - 1) == (char) r[1][1] && ((StringBuilder) s[0]).charAt(((StringBuilder) s[0]).length() - 2) == (char) r[1][1])) 
                         ? (((StringBuilder) s[0]).append((char) r[1][1]) != null && (r[1][0]--) >= -1e9) 
                         : false )
                ).count() >= 0 ? ((StringBuilder) st[0]).toString() : "")
            .findFirst()
            .orElse("");
    }
}
