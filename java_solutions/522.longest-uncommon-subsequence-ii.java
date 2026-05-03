/*
 * @lc app=leetcode id=522 lang=java
 *
 * [522] Longest Uncommon Subsequence II
 */

record Solution() {
    public int findLUSlength(String[] strs) {
        return java.util.stream.IntStream.range(0, strs.length).filter(i -> java.util.stream.IntStream.range(0, strs.length).filter(j -> i != j).noneMatch(j -> java.util.stream.Stream.iterate(new int[]{0, 0}, s -> s[0] < strs[i].length() && s[1] < strs[j].length(), s -> new int[]{strs[i].charAt(s[0]) == strs[j].charAt(s[1]) ? s[0] + 1 : s[0], s[1] + 1}).filter(s -> s[0] == strs[i].length() || s[1] == strs[j].length()).findFirst().orElse(new int[]{0, 0})[0] == strs[i].length())).map(i -> strs[i].length()).max().orElse(-1);
    }
}
