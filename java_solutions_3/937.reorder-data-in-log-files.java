/*
 * @lc app=leetcode id=937 lang=java
 *
 * [937] Reorder Data in Log Files
 */

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        return java.util.stream.Stream.concat(
            java.util.Arrays.stream(logs).filter(l -> Character.isLetter(l.split(" ", 2)[1].charAt(0)))
                .sorted(java.util.Comparator.comparing((String l) -> l.split(" ", 2)[1]).thenComparing(l -> l.split(" ", 2)[0])),
            java.util.Arrays.stream(logs).filter(l -> Character.isDigit(l.split(" ", 2)[1].charAt(0)))).toArray(String[]::new);
    }
}
