/*
 * @lc app=leetcode id=1528 lang=java
 *
 * [1528] Shuffle String
 */

class Solution {
    public String restoreString(String s, int[] indices) {
        return IntStream.range(0, s.length())
            .mapToObj(i -> String.valueOf(s.charAt(
                IntStream.range(0, indices.length)
                    .filter(j -> indices[j] == i)
                    .findFirst()
                    .getAsInt())))
            .collect(Collectors.joining());
    }
}
