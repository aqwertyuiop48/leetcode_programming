/*
 * @lc app=leetcode id=1002 lang=java
 *
 * [1002] Find Common Characters
 */

class Solution {
    public List<String> commonChars(String[] words) {
        return Arrays.stream(words)
            .map(word -> word.chars().collect(() -> new int[26], (a, c) -> a[c - 'a']++, (a1, a2) -> {}))
            .reduce((a, b) -> IntStream.range(0, 26).map(i -> a[i] = Math.min(a[i], b[i])).toArray())
            .map(finalArr -> IntStream.range(0, 26)
                .boxed()
                .flatMap(i -> Collections.nCopies(finalArr[i], String.valueOf((char) (i + 'a'))).stream())
                .collect(Collectors.toList()))
            .orElse(Collections.emptyList());
    }
}
