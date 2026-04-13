/*
 * @lc app=leetcode id=3734 lang=java
 *
 * [3734] Lexicographically Smallest Palindromic Permutation Greater Than Target
 */

class Solution {
    public String lexPalindromicPermutation(String input, String target) {
        return Stream.<Object[]>of(new Object[]{new int[26], new char[input.length()], new int[]{0}, null, new boolean[]{false}})
            .peek(s -> input.chars().forEach(c -> ((int[]) s[0])[c - 'a']++))
            .filter(s -> Arrays.stream((int[]) s[0]).filter(c -> c % 2 != 0).count() <= 1)
            .peek(s -> s[3] = (BiPredicate<Integer, Boolean>) (idx, tight) -> 
                idx == (input.length() + 1) / 2 
                    ? IntStream.range(0, input.length() / 2).allMatch(i -> (((char[]) s[1])[input.length() - 1 - i] = ((char[]) s[1])[i]) != 0) && (new String((char[]) s[1]).compareTo(target) > 0)
                    : IntStream.range(0, 26)
                        .filter(i -> ((int[]) s[0])[i] >= (input.length() % 2 == 1 && idx == (input.length() + 1) / 2 - 1 ? 1 : 2))
                        .filter(i -> !tight || (i + 'a' >= target.charAt(idx)))
                        .anyMatch(i -> Stream.of((char) (i + 'a'))
                            .peek(c -> ((char[]) s[1])[idx] = c)
                            .peek(c -> ((int[]) s[0])[i] -= (input.length() % 2 == 1 && idx == (input.length() + 1) / 2 - 1 ? 1 : 2))
                            .filter(c -> ((BiPredicate<Integer, Boolean>) s[3]).test(idx + 1, tight && c == target.charAt(idx)))
                            .map(c -> true)
                            .findFirst()
                            .orElseGet(() -> Stream.of(i)
                                .peek(idx_i -> ((int[]) s[0])[idx_i] += (input.length() % 2 == 1 && idx == (input.length() + 1) / 2 - 1 ? 1 : 2))
                                .map(idx_i -> false).findFirst().get())))
            .map(s -> ((BiPredicate<Integer, Boolean>) s[3]).test(0, true) ? new String((char[]) s[1]) : "")
            .findFirst().orElse("");
    }
}
