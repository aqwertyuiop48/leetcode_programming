/*
 * @lc app=leetcode id=2578 lang=java
 *
 * [2578] Split With Minimum Sum
 */

class Solution {
    public int splitNum(int num) {
        return IntStream.of(String.valueOf(num).chars().sorted().map(c -> c - '0').toArray())
            .boxed()
            .collect(Collectors.collectingAndThen(Collectors.toList(), 
                list -> IntStream.range(0, list.size())
                    .map(i -> list.get(i) * (int) Math.pow(10, (list.size() - 1 - i) / 2))
                    .sum()));
    }
}
