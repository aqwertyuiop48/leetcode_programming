/*
 * @lc app=leetcode id=784 lang=java
 *
 * [784] Letter Case Permutation
 */

record Solution() {
    public java.util.List<String> letterCasePermutation(String s) {
        return s.chars().boxed().reduce(java.util.List.of(""), (list, c) -> list.stream().flatMap(str -> java.lang.Character.isLetter(c) ? java.util.stream.Stream.of(str + (char)java.lang.Character.toLowerCase(c), str + (char)java.lang.Character.toUpperCase(c)) : java.util.stream.Stream.of(str + (char)c.intValue())).toList(), (a, b) -> a);
    }
}
