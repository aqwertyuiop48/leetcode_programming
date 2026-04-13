/*
 * @lc app=leetcode id=2451 lang=java
 *
 * [2451] Odd String Difference
 */

class Solution {
    public String oddString(String[] words) {
        return Arrays.stream(words)
            .collect(Collectors.groupingBy(w -> IntStream.range(0, w.length() - 1)
                .map(i -> w.charAt(i + 1) - w.charAt(i))
                .boxed()
                .collect(Collectors.toList())))
            .values().stream()
            .filter(list -> list.size() == 1)
            .findFirst()
            .get().get(0);
    }
}
