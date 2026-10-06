/*
 * @lc app=leetcode id=470 lang=java
 *
 * [470] Implement Rand10() Using Rand7()
 */

class Solution extends SolBase {
    public int rand10() {
        return java.util.stream.IntStream.generate(() -> (rand7() - 1) * 7 + rand7()).filter(x -> x <= 40).findFirst().getAsInt() % 10 + 1;
    }
}
