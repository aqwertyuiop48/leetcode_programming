/*
 * @lc app=leetcode id=4036 lang=java
 *
 * [4036] Lexicographically Largest String After Pair Transformations
 */

class Solution {
public String[] largestString(int[] A) {
    return Arrays.stream(A)
        .mapToObj(a -> "z".repeat(a >> 25)
            + IntStream.iterate(24, i -> i >= 0, i -> i - 1)
                .filter(i -> ((a >> i) & 1) == 1)
                .mapToObj(i -> String.valueOf((char) ('a' + i)))
                .collect(Collectors.joining()))
        .toArray(String[]::new);
}
}
