/*
 * @lc app=leetcode id=953 lang=java
 *
 * [953] Verifying an Alien Dictionary
 */

record Solution() {
    public boolean isAlienSorted(String[] words, String order) {
        return java.util.stream.IntStream.range(0, words.length - 1).allMatch(i -> java.util.stream.IntStream.range(0, Math.min(words[i].length(), words[i+1].length())).mapToObj(j -> new int[]{order.indexOf(words[i].charAt(j)), order.indexOf(words[i+1].charAt(j))}).filter(v -> v[0] != v[1]).findFirst().map(v -> v[0] < v[1]).orElse(words[i].length() <= words[i+1].length()));
    }
}
