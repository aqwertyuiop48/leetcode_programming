/*
 * @lc app=leetcode id=2559 lang=java
 *
 * [2559] Count Vowel Strings in Ranges
 */

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        return Stream.of(new int[words.length + 1])
            .peek(p -> IntStream.range(0, words.length)
                .forEach(i -> p[i + 1] = p[i] + ("aeiou".indexOf(words[i].charAt(0)) >= 0 && "aeiou".indexOf(words[i].charAt(words[i].length() - 1)) >= 0 ? 1 : 0)))
            .flatMapToInt(p -> Arrays.stream(queries).mapToInt(q -> p[q[1] + 1] - p[q[0]]))
            .toArray();
    }
}
