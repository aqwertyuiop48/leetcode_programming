/*
 * @lc app=leetcode id=4014 lang=java
 *
 * [4014] Minimum Total Price After Applying Discounts
 */

class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        return Stream.of(prices).peek(Arrays::sort).flatMapToDouble(p ->
            Stream.of(discounts).peek(Arrays::sort).flatMapToDouble(d ->
                IntStream.range(0, prices.length)
                    .mapToDouble(i ->
                        i < discounts.length
                            ? prices[prices.length - 1 - i] * (100.0 - discounts[discounts.length - 1 - i]) / 100.0
                            : prices[prices.length - 1 - i]
                    )
            )
        ).sum();
    }
}
