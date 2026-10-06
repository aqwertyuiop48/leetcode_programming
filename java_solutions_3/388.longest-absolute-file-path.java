/*
 * @lc app=leetcode id=388 lang=java
 *
 * [388] Longest Absolute File Path
 */

class Solution {
    public int lengthLongestPath(String input) {
        return new int[input.length() + 2] instanceof int[] len
            ? java.util.Arrays.stream(input.split("\n"))
                .mapToInt(l -> ((java.util.function.IntUnaryOperator) d -> l.indexOf('.') >= 0 ? len[d] + l.length() - d : (len[d + 1] = len[d] + l.length() - d + 1) * 0)
                    .applyAsInt(l.lastIndexOf('\t') + 1))
                .max().orElse(0)
            : 0;
    }
}
