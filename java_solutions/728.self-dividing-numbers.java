/*
 * @lc app=leetcode id=728 lang=java
 *
 * [728] Self Dividing Numbers
 */

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        return IntStream.rangeClosed(left, right)
            .filter(n -> String.valueOf(n).chars().allMatch(c -> (c - '0') != 0 && n % (c - '0') == 0))
            .boxed()
            .collect(Collectors.toList());
    }
}
