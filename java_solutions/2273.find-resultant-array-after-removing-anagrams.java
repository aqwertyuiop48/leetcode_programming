/*
 * @lc app=leetcode id=2273 lang=java
 *
 * [2273] Find Resultant Array After Removing Anagrams
 */

class Solution {
    public List<String> removeAnagrams(String[] words) {
        return IntStream.range(0, words.length)
            .filter(i -> i == 0 || !Stream.of(words[i].split("")).sorted().collect(Collectors.joining())
                .equals(Stream.of(words[i - 1].split("")).sorted().collect(Collectors.joining())))
            .mapToObj(i -> words[i])
            .collect(Collectors.toList());
    }
}
