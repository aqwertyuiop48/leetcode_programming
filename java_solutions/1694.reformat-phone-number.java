/*
 * @lc app=leetcode id=1694 lang=java
 *
 * [1694] Reformat Phone Number
 */

class Solution {
    public String reformatNumber(String number) {
        return Optional.of(number.replaceAll("[\\s-]", ""))
            .map(s -> IntStream.iterate(0, i -> i < s.length(), i -> i + (s.length() - i == 4 ? 2 : 3))
                .mapToObj(i -> s.substring(i, i + (s.length() - i == 4 ? 2 : Math.min(3, s.length() - i))))
                .collect(Collectors.joining("-")))
            .get();
    }
}
