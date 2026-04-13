/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

class Solution {
    public int climbStairs(int n) {return IntStream.range(2, n).boxed().reduce(new ArrayList<>(Arrays.asList(1, 2)), (list, i) -> Stream.of(list).peek(l -> l.add(l.get(i - 1) + l.get(i - 2))).findFirst().get(), (a, b) -> a).stream().reduce((first, last) -> last).map(last -> n < 3 ? n : last).orElse(n);}
}
