/*
 * @lc app=leetcode id=824 lang=java
 *
 * [824] Goat Latin
 */

class Solution {
    public String toGoatLatin(String s) {
        return IntStream.range(0, s.split(" ").length)
            .mapToObj(i -> Optional.of(s.split(" ")[i])
                .map(w -> "aeiouAEIOU".indexOf(w.charAt(0)) >= 0 ? w : w.substring(1) + w.charAt(0))
                .map(w -> w + "ma" + "a".repeat(i + 1)).get())
            .collect(Collectors.joining(" "));
    }
}
