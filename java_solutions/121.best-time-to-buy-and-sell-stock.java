/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// semicolons : 1
import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        return IntStream.range(0, prices.length).boxed().reduce(new AbstractMap.SimpleEntry<>(Integer.MAX_VALUE, 0), (acc, i) -> new AbstractMap.SimpleEntry<>(Math.min(acc.getKey(), prices[i]), Math.max(acc.getValue(), prices[i] - acc.getKey())), (a, b) -> b).getValue();
    }
}
