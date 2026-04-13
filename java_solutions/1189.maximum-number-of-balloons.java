/*
 * @lc app=leetcode id=1189 lang=java
 *
 * [1189] Maximum Number of Balloons
 */

class Solution {
    public int maxNumberOfBalloons(String text) {
        return Optional.of(text.chars().boxed().collect(Collectors.groupingBy(c -> (char) c.intValue(), Collectors.counting())))
            .map(m -> Stream.of('b', 'a', 'l', 'o', 'n')
                .mapToLong(c -> m.getOrDefault(c, 0L) / (c == 'l' || c == 'o' ? 2 : 1))
                .min()
                .orElse(0L))
            .get().intValue();
    }
}
