/*
 * @lc app=leetcode id=1291 lang=java
 *
 * [1291] Sequential Digits
 */

class Solution {
    public java.util.List<Integer> sequentialDigits(int low, int high) {
        return java.util.stream.IntStream.range(1, 10)
            .boxed()
            .flatMap(startDigit -> java.util.stream.IntStream.range(startDigit + 1, 10)
                .mapToObj(endDigit -> java.util.stream.IntStream.rangeClosed(startDigit, endDigit)
                    .reduce(0, (num, digit) -> num * 10 + digit)))
            .filter(num -> num >= low && num <= high)
            .sorted()
            .collect(java.util.stream.Collectors.toList());
    }
}
