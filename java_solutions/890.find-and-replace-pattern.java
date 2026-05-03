/*
 * @lc app=leetcode id=890 lang=java
 *
 * [890] Find and Replace Pattern
 */

record Solution() {
    public java.util.List<String> findAndReplacePattern(String[] words, String p) {
        return java.util.Arrays.stream(words).filter(w -> java.util.stream.IntStream.range(0, w.length()).map(i -> w.indexOf(w.charAt(i))).boxed().toList().equals(java.util.stream.IntStream.range(0, p.length()).map(i -> p.indexOf(p.charAt(i))).boxed().toList())).toList();
    }
}
