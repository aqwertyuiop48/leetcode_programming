/*
 * @lc app=leetcode id=917 lang=java
 *
 * [917] Reverse Only Letters
 */

class Solution {
    public String reverseOnlyLetters(String s) {
        return Optional.of(s.replaceAll("[^a-zA-Z]", "")).map(letters -> new StringBuilder(letters).reverse().toString()).map(rev -> IntStream.range(0, s.length()).collect(StringBuilder::new, (sb, i) -> sb.append(Character.isLetter(s.charAt(i)) ? rev.charAt((int) sb.chars().filter(c -> Character.isLetter((char)c)).count()) : s.charAt(i)), StringBuilder::append).toString()).get();
    }
}
